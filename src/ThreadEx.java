


class A extends Thread
{
    public void run()
    {
        for(int x=1;x<1000;x++)
        {
            try
            {
               // Thread.sleep(2000);
            }
            catch (Exception e)
            {
            }
            System.out.println("A is executing"+x);
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int x=1;x<1000;x++)
        {
            try
            {
                //Thread.sleep(2000);
            }
            catch (Exception e)
            {
            }
            System.out.println("B is executing"+x);
        }
    }
}
public class ThreadEx {

    public static void main(String[] args) {

A a=new A();
B b=new B();




a.start();
b.start();
    }

}
