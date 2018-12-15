
public class PrintNumberWithMultiplierWithRunnable implements Runnable {
    int x;


    public PrintNumberWithMultiplierWithRunnable(int x) {
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
