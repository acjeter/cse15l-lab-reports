import java.io.IOException;
import java.net.URI;
// import java.util.ArrayList;

class Handler implements URLHandler {
    String runningString = "";
    
    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format(runningString);
        }
        else if (url.getPath().equals("/add-message?s=")) {
            String[] urlStrings = url.getQuery().split("=");
            runningString.join(urlStrings[1] + "\n");
            System.out.println(runningString);
            return String.format(runningString);
        }
        else {
            return "Error 404 Not Found!";
        }
    }
}

