
public class PrintNumberWithMultiplier extends Thread {
    int x;


    public PrintNumberWithMultiplier(int x) {
        this.x = x;
    }

    public void run() {
        int z;
        z = 1;
        while (z <= 10000) {
            z = z * x;
            System.out.println("Thread running with multiplier : " + x + " " + z);
        }

    }

}
