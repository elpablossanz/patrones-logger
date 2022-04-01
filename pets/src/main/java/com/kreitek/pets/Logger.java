package com.kreitek.pets;

public class Logger {


    public void debug(String log) {
        System.out.println("[debug]["+ PetApp.count++ +"]" + log);


    }
}
