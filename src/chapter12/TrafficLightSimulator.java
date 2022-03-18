package chapter12;

public class TrafficLightSimulator implements Runnable {
    private TrafficLightColor tlc; //current color of traffic lights
    boolean changed = false; //for imitation stop make true
    boolean stop = false; //true, if traffic lights switches

    TrafficLightSimulator(TrafficLightColor init) {
        tlc = init;
    }

    TrafficLightSimulator() {
        tlc = TrafficLightColor.RED;
    }


    //Start of imitation of traffic lights
    @Override
    public void run() {
        while (!stop) {
            try {
                switch (tlc) {
                    case GREEN -> {
                        Thread.sleep(10000); //Green for 10 sec.
                        break;
                    }
                    case YELLOW -> {
                        Thread.sleep(2000); //Yellow for 2 sec.
                        break;
                    }
                    case RED -> {
                        Thread.sleep(12000); //Red for 12 sec.
                        break;
                    }
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            changeColor();
        }

    }

    //Color switch
    synchronized void changeColor() {
        switch(tlc) {
            case RED -> {
                tlc = TrafficLightColor.GREEN;
                break;
            }
            case YELLOW -> {

                tlc = TrafficLightColor.RED;
                break;
            }
            case GREEN -> {
                tlc = TrafficLightColor.YELLOW;
                break;
            }
        }

        changed = true;
        notify();//notify about switching the color
    }

    //Waiting for switch color
    synchronized void waitForChange() {
        try {
            while (!changed) wait(); //wait for switching color
            changed = false;
        } catch(InterruptedException exc) {
            System.out.println(exc);
        }
    }

    //Return of current color
    synchronized TrafficLightColor getColor() {
        return tlc;
    }

    //Stop imitation of traffic lights
    synchronized void cancel() {
        stop = true;
    }
}
