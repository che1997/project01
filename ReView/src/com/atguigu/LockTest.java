package com.atguigu;


import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by 渝B on 2020/2/10.
 */
public class LockTest {
    public static void main(String[] args) {
        Window w = new Window();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}
class Window implements  Runnable{
    private ReentrantLock lock = new ReentrantLock();
    private  int ticket = 100;
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+" 售票 "+ticket);
                    ticket--;
                }else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }

    }
}