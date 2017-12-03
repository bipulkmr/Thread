import java.io.*;
public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SharedClass shclass = new SharedClass() ;
		Producer p =new Producer(shclass);
		Consumer c = new Consumer(shclass);
		Thread tc = new Thread(c);
		Thread pc = new Thread(p);
		tc.start();
		pc.start();

	}

}
