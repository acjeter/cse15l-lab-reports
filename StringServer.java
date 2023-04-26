import java.io.IOException;
import java.net.URI;
// import java.util.ArrayList;

class Handler implements URLHandler {
    String runningString = "";
    
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(runningString);
        }
        else if (url.getPath().equals("/add-message")) {
            if (url.getQuery().contains("s=")) {
                String[] urlStrings = url.getQuery().split("=");
                String temp = urlStrings[1] + "\n";
                runningString = runningString + temp;
                System.out.println("p" + runningString);
                return String.format(runningString);
            }
            else {
                return "Error 404 Not Found!";
            }
        }
        else {
            return "Error 404 Not Found!";
        }
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

