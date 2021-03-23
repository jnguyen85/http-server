import com.github.Mehra.httpserver.HttpServer;

public class App {
    public static void main(String[] args) {
        HttpServer server = new HttpServer(8080);
        server.start();
    }
}
