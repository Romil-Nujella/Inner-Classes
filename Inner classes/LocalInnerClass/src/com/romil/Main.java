package com.romil;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        System.out.println(door.isLocked("qwerty"));
        if(door.isLocked("qwerty")){
            System.out.println("shop has closed, visit later");
        }
        else{
            System.out.println("welcome, we are open :)");
        }
    }
}
