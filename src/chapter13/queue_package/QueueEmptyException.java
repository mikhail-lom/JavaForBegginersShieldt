package chapter13.queue_package;
/**
 * This class is similar as in package chapter9.
 * Nevertheless we repeat this code to repeat some skills
 * and make this queue application independent.
 */
public class QueueEmptyException extends Exception {
    public String toString() {
        return "\n Queue is empty";
    }
}
