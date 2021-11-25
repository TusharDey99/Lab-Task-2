package tushar;

import java.io.*;

public class ShowFile {

    public static void main(String args[])
    {
        int i;
        FileInputStream fileInput;

        if(args.length != 1)
        {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        try {
            fileInput = new FileInputStream(args[0]);
        } catch(FileNotFoundException e) {
            System.out.println("Cannot Open File");
            return;
        }

        try {
            do {
                i = fileInput.read();
                if(i != -1) System.out.print((char) i);
            } while(i != -1);
        } catch(IOException e) {
            System.out.println("Error Reading File");
        }

        try {
            fileInput.close();
        } catch(IOException e) {
            System.out.println("Error Closing File");
        }
    }
}
