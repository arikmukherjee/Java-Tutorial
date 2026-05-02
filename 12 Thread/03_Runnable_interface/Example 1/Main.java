public class Main implements Runnable
{
   public void run()
   {
      System.out.println("Thread is running");
   }
   public static void main(String[] args) {
      Main ob=new Main();
      Thread t1=new Thread(ob);
      t1.start();
   }   
}
