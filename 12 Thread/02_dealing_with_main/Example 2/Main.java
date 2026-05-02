public class Main extends Thread 
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Main t1=new Main();
        Main t2=new Main();

        t1.run();
        t2.run();
    }    
}
