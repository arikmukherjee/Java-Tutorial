public class Main extends Thread{
 public void run(){
  for(int i=1;i<=3;i++){
   try{
    Thread.sleep(500);
   }catch(Exception e){System.out.println(e);}
  System.out.println(i);
  }
 }
public static void main(String args[]){
 Main t1=new Main();
 Main t2=new Main();
 Main t3=new Main();
 t1.start();
 t2.start();
 t3.start();
 }
}