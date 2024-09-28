package com.campusdual.classroom;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exercise31 {

    public static void main(String[] args) {
        BufferedReader reader = null;

        try {

            reader = new BufferedReader(new FileReader("src/main/resources/lorem.txt"));
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {

            e.printStackTrace();
            System.out.println("Exception: " + e);

        } finally {

            try {
                reader.close();
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("Exception: " + e2);
            }

        }
    }
}
