package com.rozatogustavo.examples.market;

public class Client {

    private final String name;
    private final long credit;

    public Client(String name, long credit) {
        this.name = name;
        this.credit = credit;
    }

    public String getName() {
        return name;
    }

    public long getCredit() {
        return credit;
    }
}
