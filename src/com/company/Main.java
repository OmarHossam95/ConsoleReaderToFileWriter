package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	// write your code here


        try {
            InputStreamReader r = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(r);

            FileWriter w = new FileWriter("file.txt");
            BufferedWriter bw = new BufferedWriter(w);

            String input;
            do {
                System.out.println("Enter data: ");
                input = br.readLine();

                System.out.println("Data is: " + input);
                bw.write(input);
                bw.newLine();
            } while (!input.equals("stop"));

            br.close();
            r.close();

            bw.close();
            w.close();
        }
        catch (Exception e){
            System.out.println("Exception occurred!");
        }
    }
}
