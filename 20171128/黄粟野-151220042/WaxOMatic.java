//package concurrency.waxomatic;

import java.util.concurrent.*;

//import static net.mindview.util.Print.*;

class Car {
    private boolean waxOn = false;
    private boolean buffing = false;    // false表示新car可以wax  true表示前一车在等待buffer

    public synchronized void waxed() {
        waxOn = true; // Ready to buff
        buffing = true;
        notifyAll();
    }

    public synchronized void buffed() {
        waxOn = false; // Ready for another coat of wax
        buffing = false;
        notifyAll();
    }

    public synchronized void waitForWaxing()
            throws InterruptedException {
        while (waxOn == false)
            wait();
    }

    public synchronized void waitForBuffing()
            throws InterruptedException {
        while (waxOn == true)
            wait();
    }

    public synchronized void waitForAvailable()
            throws InterruptedException {
        while(buffing)
            wait();
        buffing = true;
    }
}

class WaxOn implements Runnable {
    private Car car;
    private int cid;

    public WaxOn(Car c, int id) {
        car = c;
        this.cid = id;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                //printnb("Wax On! ");
                //System.out.println("Wax On! ");
                car.waitForAvailable();
                System.out.println("WaxOn" + this.cid + ":" + "Wax On! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.waxed();
                Thread.yield();
                car.waitForBuffing();
            }
        } catch (InterruptedException e) {
            //print("Exiting via interrupt");
            System.out.println("Exiting via interrupt");
        }
        //print("Ending Wax On task");
        System.out.println("Ending Wax On task");
    }
}

class WaxOff implements Runnable {
    private Car car;

    public WaxOff(Car c) {
        car = c;
    }

    public void run() {
        try {
            while (!Thread.interrupted()) {
                car.waitForWaxing();
                //printnb("Wax Off! ");
                System.out.println("Wax Off! ");
                TimeUnit.MILLISECONDS.sleep(200);
                car.buffed();
            }
        } catch (InterruptedException e) {
            //print("Exiting via interrupt");
            System.out.println("Exiting via interrupt");
        }
        //print("Ending Wax Off task");
        System.out.println("Ending Wax Off task");
    }

}

public class WaxOMatic {
    public static void main(String[] args) throws Exception {
        Car car = new Car();
        ExecutorService exec = Executors.newCachedThreadPool();
        exec.execute(new WaxOff(car));
        exec.execute(new WaxOn(car,1));
        exec.execute(new WaxOn(car,2));
        TimeUnit.SECONDS.sleep(5); // Run for a while...
        exec.shutdownNow(); // Interrupt all tasks
    }
}
