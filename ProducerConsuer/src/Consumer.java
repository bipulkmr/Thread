
public class Consumer implements Runnable {
    SharedClass sc ;
    public Consumer(SharedClass sc) {
    	this.sc = sc;
    }
	public void run() {
		
		
		this.consumesVariable();
	}
	
	public   void consumesVariable() {	
		while(sc.x < 15) {
		if(sc.y==1) {
		System.out.println("in consumer" + sc.x);
		sc.y = 0;
		}
		
	}
	}

}
