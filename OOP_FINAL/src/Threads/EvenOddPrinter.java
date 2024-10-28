package Threads;

public class EvenOddPrinter {

    public EvenOddPrinter() {
    }

    private static final int MAX_NUM = 20;
    private static int nextNum = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(new EvenRunnable(), "EvenThread");
        Thread oddThread = new Thread(new OddRunnable(), "OddThread");

        evenThread.start();
        oddThread.start();
    }

    static class EvenRunnable implements Runnable {
        @Override
        public void run() {
            while (nextNum <= MAX_NUM) {
                synchronized (lock) {
                    if (nextNum % 2 == 0) {
                        System.out.println("Even Thread: " + nextNum);
                        nextNum++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class OddRunnable implements Runnable {
        @Override
        public void run() {
            while (nextNum <= MAX_NUM) {
                synchronized (lock) {
                    if (nextNum % 2 == 1) {
                        System.out.println("Odd Thread: " + nextNum);
                        nextNum++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
