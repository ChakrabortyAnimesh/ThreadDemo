package com.company.java;

public class NewThread extends  Thread {
    NewThread()
    {
        super("Demo Thread");
        System.out.println("Child thread :"+this);
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i > 0; i--) {
                System.out.println("Child Thread: " + i);

                Thread.sleep(1000);
            }
        }catch (InterruptedException e) {
            System.out.println("Child interrupted");

            }
        System.out.println("Exiting child thread");
        }
    }
