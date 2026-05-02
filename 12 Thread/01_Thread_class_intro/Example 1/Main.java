class Cl extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}
class Main
{
    public static void main(String[] args) {
        Cl ob=new Cl();
        ob.start();
    }
}