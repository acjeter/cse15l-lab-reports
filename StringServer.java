import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

//localhost:4050/add-message?s=Hello

class Handler implements URLHandler {
    String runningString = "";
    
    public String handleRequest(URI url) {
        String query = url.getQuery();
        if (url.getPath().equals("/")) {
            return String.format(runningString);
        }
        else if (url.getPath().equals("/add-message")) {
            if (query.contains("s=")) {
                String[] urlStrings = query.split("=");
                if (urlStrings[0].equals("s")) {
                    runningString = runningString + urlStrings[1] + "\n";
                    return String.format(runningString);
                }  
            } 
        } 
        return "Error 404 Not Found!";
    }
}

class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0) {
            System.out.println(
                "Missing port number! Try any number between 1024 to 49151!");
            return;
        }
        int port = Integer.parseInt(args[0]);
        Server.start(port, new Handler());
    }
}

