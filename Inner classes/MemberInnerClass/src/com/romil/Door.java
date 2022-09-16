package com.romil;

public class Door {
    private Lock lock;
    public Door(){
        this.lock = new Lock(true);
    }
    public Lock getLock(){
        return this.lock;
    }

    public void shopStatus(){
        if(this.lock.getLock()){
            System.out.println("Shop is closed, please visit later.");
        }
        else{
            System.out.println("Welcome, we are open.");
        }
    }

    public class Lock{
        private boolean lock;

        public Lock(boolean lock){
            this.lock = lock;
        }

        public void setLock(boolean lock){
            this.lock = lock;
        }
        public boolean getLock(){
            return this.lock;
        }
    }
}
