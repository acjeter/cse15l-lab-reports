import java.io.IOException;
import java.net.URI;
// import java.util.ArrayList;

class Handler implements URLHandler {
    List<String> lines;
    String path;
    
    public String handleRequest(URI url) throws IOException {
        String query = url.getQuery();
        if (url.getPath().equals("/")) {
            return String.format(runningString);
        }
        else if (url.getPath().equals("/add-message")) {
            if (query.startsWith("s=")) {
                String current = query.split("=")[1];
                this.lines.add(current);
                return String.format(lines);
            }
            else {
                return "Add message requires query parameter s\n";
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

