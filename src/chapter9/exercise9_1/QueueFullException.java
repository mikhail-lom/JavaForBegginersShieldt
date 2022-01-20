package chapter9.exercise9_1;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\n Queue is full. Maximum size is " + size;
    }
}
