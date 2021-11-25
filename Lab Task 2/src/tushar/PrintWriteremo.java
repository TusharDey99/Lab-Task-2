package tushar;

import java.io.*;

public class PrintWriteremo {

    public static void main(String args[]) {
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("This is a string");

        int i = -7;
        printWriter.println(i);
        
        double d = 4.5e-7;
        printWriter.println(d);
    }
}
