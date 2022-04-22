package chapter12;

public enum TrafficLightColor {
    RED(12000), GREEN(10000), YELLOW(2000);

    private int delay;

    TrafficLightColor(int d) {
        delay = d;
    }

    int getDelay() {
        return delay;
    }

    TrafficLightColor getNext() {
        return values()[(ordinal()+1) % values().length];
    }
}
