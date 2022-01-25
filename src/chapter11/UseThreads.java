package chapter11;

/**
 * Thread usage simulator from chapter 11 Shildt
 */
public class UseThreads {
    public static void main(String[] args) {
        System.out.println("Start of main thread");

        /* Create object of MyThread type, firstly */
        MyThread mt = MyThread.createAndStart("Spawned stream #1");

        for (int i=0; i<50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException exc) {
                System.out.println("Main thread aborting");
            }
        }

        System.out.println("Main thread completion");
    }
}

//MyThread class changes
//
class MyThread implements Runnable {
    Thread thrd;

    //New thread creation based on an interface
    //and giving it the name
    MyThread(String name) {
        thrd = new Thread(this, name);
    }

    //Creation and start of the thread with the help
    //of Factory Method
    public static MyThread createAndStart(String name) {
        MyThread myThrd = new MyThread(name);

        myThrd.thrd.start();
        return myThrd;
    }

    //Enter point to thread
    @Override
    public void run() {
        System.out.println(thrd.getName() + " - start");
        try {
            for (int count=0; count<10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + ", counter: "
                        + count);
            }
        }
        catch (InterruptedException exc) {
            System.out.println(thrd.getName() + " - aborted");
        }
        System.out.println(thrd.getName() + " - finishing");
    }
}
