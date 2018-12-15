
public class ThreadApplication {
    public static void main(String args[]) {
        PrintNumberWithMultiplier ps1 = new PrintNumberWithMultiplier(2);
        PrintNumberWithMultiplierWithRunnable ps2 = new PrintNumberWithMultiplierWithRunnable(3);
        Thread t = new Thread(ps2);
        t.start();
        ps1.start();
        // ps2.start();
        // try {
        // ps1.join();
        // } catch (InterruptedException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        System.out.println("Running a simple thread");
    }

}
