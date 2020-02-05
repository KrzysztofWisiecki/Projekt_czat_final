package com.muc;

public class ServerMain {
    public static void main(String[] args) {
        int port = 5005;
        Server server = new Server(port);
        server.start();
    }
}
