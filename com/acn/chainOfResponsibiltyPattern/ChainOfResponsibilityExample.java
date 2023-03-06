package com.acn.chainOfResponsibiltyPattern;

import com.acn.chainOfResponsibiltyPattern.middleware.Middleware;
import com.acn.chainOfResponsibiltyPattern.middleware.RoleCheckMiddleware;
import com.acn.chainOfResponsibiltyPattern.middleware.ThrottlingMiddleware;
import com.acn.chainOfResponsibiltyPattern.middleware.UserExistsMiddleware;
import com.acn.chainOfResponsibiltyPattern.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsibilityExample {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = Middleware.link(
                new ThrottlingMiddleware(2),
                new UserExistsMiddleware(server),
                new RoleCheckMiddleware()
        );

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
