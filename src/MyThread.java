
public class MyThread extends Thread {

	public void run()
	{
	    
	    m1();
	}
synchronized void m1()
{
	System.out.println(Thread.currentThread().getName());
}

}
