package com.example.geektrust;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import com.example.geektrust.model.Source;
import com.example.geektrust.model.Destination;
import com.example.geektrust.business.Business;

public class Main {
    public static void main(String[] args) {

        Source source = new Source();
        Destination destination = new Destination();

        try {
            InputStream is = new FileInputStream(args[0]);
            run(is, source, destination);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        Business business = new Business();
        System.out.println("POWER "+ business.remainingPower());

    }
    public static void run(InputStream is, Source source, Destination destination){

        Scanner sc = new Scanner(is, StandardCharsets.UTF_8.name());

        while (sc.hasNextLine()) {

            String currentLine = sc.nextLine();
            String[] lineArray = currentLine.split(" ", 0);

            if (lineArray[0].equals("SOURCE")){
                source.createSource(lineArray[1], lineArray[2], lineArray[3]);
            }

            else if (lineArray[0].equals("DESTINATION")){
                destination.createDestination(lineArray[1], lineArray[2]);
            }
        }
        sc.close();
    }
}
