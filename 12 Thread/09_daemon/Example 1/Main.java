public class Main extends Thread{
 public void run(){
  if(Thread.currentThread().isDaemon()){
   System.out.println("daemon thread");
  }
  else{
  System.out.println("user thread ");
 }
 }
 public static void main(String[] args){
  Main t1=new Main();
  Main t2=new Main();
  Main t3=new Main();

  t1.setDaemon(true);
 
  t1.start();
  t2.start();
  t3.start();
 }
}