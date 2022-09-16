package com.romil;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        door.getLock().test();

        System.out.println(door.getLock().isUnlocked("qwerty"));
    }
}
