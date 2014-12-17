package com.prystupa;

import org.apache.zookeeper.KeeperException;

import java.io.IOException;

/**
 * Hello world!
 */
public class ServerApp {
    public static void main(String[] args) throws KeeperException, InterruptedException, IOException {

        try (JoinGroup joinGroup = new JoinGroup()) {

            joinGroup.connect(args[0]);
            joinGroup.join(args[1], args[2]);

            Thread.sleep(Long.MAX_VALUE);
        }
    }
}
