package comtnsif.multithreading;

public class Eclip implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			System.out.println("Eclip "+ Thread.currentThread().getId());
		
	}
	

}
