public class Main extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.print(Thread.currentThread().getName() + " ");
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();

        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("Name of t1:" + t3.getName());
        System.out.println("id of t1:" + t1.getId());
        System.out.println("id of t1:" + t2.getId());
        System.out.println("id of t1:" + t3.getId());
        t1.start();
        try {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t1.setName("dj thread");
        System.out.println("Name of t1:" + t1.getName());

        t2.start();
        t3.start();

    }
}