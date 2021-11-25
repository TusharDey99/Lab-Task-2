package tushar;

import java.io.*;

public class BRRead {

        public static void main(String args[]) throws IOException
        {
            char character;

            BufferedReader bufferedReader = new
                    BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter characters(enter 'q' to quit.): ");

            do {
                character = (char) bufferedReader.read();
                System.out.println(character);
            } while(character != 'q');
        }
}
