package ru.netology;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        server.startServer();

        ExecutorService es = Executors.newFixedThreadPool(64);
        es.execute(server::clientConnect);

    }
}
