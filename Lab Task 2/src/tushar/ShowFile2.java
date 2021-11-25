package tushar;

import java.io.*;

public class ShowFile2 {

    public static void main(String args[])
    {
        int i;
        FileInputStream fileInput = null;

        if(args.length != 1)
        {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fileInput = new FileInputStream(args[0]);
            do {
                i = fileInput.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(FileNotFoundException e) {
            System.out.println("File Not Found.");
        } catch(IOException e) {
            System.out.println("An I/O Error Occurred");
        } finally {
            try {
                if(fileInput != null) fileInput.close();
            } catch(IOException e) {
                System.out.println("Error Closing File");
            }
        }
    }
}
