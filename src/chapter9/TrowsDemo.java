package chapter9;
import java.io.*;

public class TrowsDemo {
    public static char prompt(String str) throws IOException {
        System.out.println(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = prompt("Enter the letter");
        }
        catch (IOException exc) {
            System.out.println("Exception of input/output occurs");
            ch = 'X';
        }
        System.out.println("You entered key " + ch);
    }
}
