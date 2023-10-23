package ws;

import jakarta.xml.ws.Endpoint;
import org.example.Main;

public class ServerJWS {
    public static void main(String[] args) {

        Endpoint.publish("http://0.0.0.0:8089/",new Banqueservice());
        System.out.println("Web service deployé sur http://0.0.0.0:8089/");

    }
}
