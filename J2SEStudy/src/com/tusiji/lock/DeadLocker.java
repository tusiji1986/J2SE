package com.tusiji.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLocker implements Runnable {
    public int flag = 1;

    private static final Lock lock = new ReentrantLock();

    public boolean checkLock() {
        return lock.tryLock();
    }

    public void run() {

            try {
            	lock.lock();
                System.out.println("flag=" + flag);
                if (flag == 1) {
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    System.out.println("1");
                }
                if (flag == 0) {
                    try {
                        Thread.sleep(3000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("0");
                }
            } finally {
                lock.unlock();
            }
        
    }

    public static void main(String[] args) {
    	DeadLocker td1 = new DeadLocker();
    	DeadLocker td2 = new DeadLocker();
        td1.flag = 1;
        td2.flag = 0;
        Thread t1 = new Thread(td1);
        Thread t2 = new Thread(td2);
        t1.start();
        t2.start();
    }
}
