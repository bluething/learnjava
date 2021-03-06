package io.github.bluething.java.threadmodel;

public class NewThreadWithExtendingThreadDemo {

    public static void main(String[] args) {
        NewThreadWithExtendingThread newThreadWithExtendingThread = new NewThreadWithExtendingThread();
        newThreadWithExtendingThread.start();

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }

    static class NewThreadWithExtendingThread extends Thread {

        NewThreadWithExtendingThread() {
            super("Demo thread");
            System.out.println("Child thread: " + this);
        }

        @Override
        public void run() {
            try {
                for (int i = 5; i > 0; i--) {
                    System.out.println("Child thread " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Child thread interrupted");
            }
            System.out.println("Exiting child thread");
        }
    }
}
