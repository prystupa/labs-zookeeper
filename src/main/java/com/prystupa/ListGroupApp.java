package com.prystupa;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;

public class ListGroupApp {

    public static void main(String[] args) throws InterruptedException, IOException, KeeperException {

        try (ListGroup listGroup = new ListGroup()) {
            listGroup.connect(args[0]);
            listGroup.list(args[1]);
        }
    }
}
