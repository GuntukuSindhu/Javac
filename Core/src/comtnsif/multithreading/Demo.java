package comtnsif.multithreading;

public class Demo extends Thread {
	public void run() {
		for (int i=0;i<5;i++) {
			
		System.out.println("demo "+ Thread.currentThread().getId());
		try {
			sleep(2000);  //2s
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

}
