package Functional_Interfaces;

public class FP06Threads {

	public static void main(String[] args) 
	
	{

			Runnable runnable = ()->{
				
						for(int i =0; i<10; i++) 
						{
							System.out.println(Thread.currentThread().getName()+" : "+i);
						}};
				
			
			Thread t = new Thread(runnable);
			t.start();
			
			Thread t1 = new Thread(runnable);
			t1.start();
			
			Thread t2 = new Thread(runnable);
			t1.start();
			
			
		
	}

}
