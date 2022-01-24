package chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Text file showing
 */

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        //Acceptance of file transfer
        if(args.length != 1) {
            System.out.println("Usage: ShowFile file_name");
            return;
        }

        try {
            fin = new FileInputStream(args[0]);
        }
        catch (FileNotFoundException exc) {
            System.out.println("File not found");
            return;
        }

        try {
            //File reading, until EOF symbol meeting
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        }
        catch (IOException exc) {
            System.out.println("File reading error");
        }
        finally {
            //Close file when outgoing from try block
            try {
                if (fin != null) {
                    fin.close();
                }
            }
            catch (IOException exc) {
                System.out.println("File close error");
            }
        }
    }
}
