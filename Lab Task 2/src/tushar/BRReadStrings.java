package tushar;

import java.io.*;

public class BRReadStrings {

    public static void main(String args[]) throws IOException
    {
        BufferedReader bufferedReader = new BufferedReader(new
                InputStreamReader(System.in));
        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit.");

        do {
            str = bufferedReader.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
}
