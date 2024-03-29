package com.baseframe.core.zhuzsdemo.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * LockDemo
 *
 * @author zhu_zishuang
 * @date 2020-11-28
 */
public class LockDemo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        new Thread(ticket, "1号窗口").start();
        new Thread(ticket, "2号窗口").start();
        new Thread(ticket, "3号窗口").start();
    }
}

/**
 * 模拟售票
 *
 * @author zhu_zishuang
 * @date 2020-11-28
 */
class Ticket implements Runnable {
    private static int tick = 100;
    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tick > 0) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " 完成售票，余票为 " + --tick);
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
