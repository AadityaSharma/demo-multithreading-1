package examples;

public class E1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // code that will run in a new thread
                System.out.println("We are not in thread " + Thread.currentThread().getName());
            }
        });

        System.out.println("We are in thread: "
                + Thread.currentThread().getName()
                + " before starting a new thread");
        thread.start();

        System.out.println("We are in thread: "
                + Thread.currentThread().getName()
                + " after starting a new thread");

        Thread.sleep(10000);
    }
}
