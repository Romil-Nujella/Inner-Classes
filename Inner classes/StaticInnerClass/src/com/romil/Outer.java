package com.romil;

public class Outer {
    public static class Inner{
        private static int x = 0;
        public static void testingInnerMethod(){
            System.out.println("Testing inner class method.");
        }
        public static int getX(){
            return x;
        }
    }
}
