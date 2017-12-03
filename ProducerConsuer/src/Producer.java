
public class Producer  implements Runnable {
	SharedClass sc ;
    public Producer(SharedClass sc) {
    	this.sc = sc;
    }
	public void run() {
		this.producesVar();
	}
	
	public  void producesVar()   {
		while(sc.x < 15) {
			if(sc.y==0) {
				sc.x++;
			System.out.println("in producer" + sc.x);
			sc.y = 1;
			}
			
		}
	}
	

}
