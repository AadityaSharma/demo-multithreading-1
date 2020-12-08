package examples;

public class E3 {

    public static void main(String[] args) {
        Thread thread = new NewThread();
        thread.start();
    }

    private static class NewThread extends Thread {
        @Override
        public void run() {
            // code that executes on the new thread
            System.out.println("Hello from " + Thread.currentThread().getName()
                    + ", id: " + Thread.currentThread().getId());
            this.setName("NewThread X1");
            System.out.println("Hello again from " + this.getName()
                    + ", id: " + this.getId());
        }
    }
}
