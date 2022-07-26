import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ShopApp
 */
public class ShopApp {
    public static void main(String[] args) {
        System.out.println("welcome to the shop");

        Clothing item1 = new Clothing("blue shirt", 19.99, "M");
        Clothing item2 = new Clothing("red shirt", 19.99, "XXL");
        Clothing item3 = new Clothing("yellow shirt", 19.99, "S");

        Clothing[] items = {item1,item2,item3};

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                    .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                    .bindAddress(InetAddress.getLocalHost())
                    .port(8888).build();
            WebServer ws = WebServer.create(config, routing);
            ws.start();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
    
}