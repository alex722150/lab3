package system;

import java.util.logging.Logger;

public class JThread extends Thread {
    private Logger log = Logger.getLogger(this.getName());
    JThread(String name){
        super(name);
    }

    public void run(){
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        log.info(Thread.currentThread().getName() + " is running now");
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        JThread second = new JThread("SecondThread");
        JThread first = new JThread("FirstThread");
        second.start();
        second.run();
        first.start();
        first.run();
    }
}
