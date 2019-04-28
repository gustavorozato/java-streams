package com.rozatogustavo.examples.market;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Trade {

    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client("Gustavo", 500), new Client("Rafael", 200),
                new Client("Leticia", 150), new Client("Giovana", 600));
        Product product = new Product("Bread", 200);

        List<Client> clientsWhoCanBuyBread = clients.stream()
                .filter(client -> client.getCredit() > product.getPrice())
                .collect(Collectors.toList());

        clientsWhoCanBuyBread.forEach(client -> System.out.println(client.getName()));
    }
}
