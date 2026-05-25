package com.pluralsight;

//import file writer / reader. buffer. localdate . scanner

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.format.DateTimeFormatter;


public class SearchEngine {
    //add main
    public static void main(String[] args) {
        //name my scanner
        Scanner myscanner = new Scanner(System.in);

        //launch app
        logAction("launch");

        //add while true
        while (true) {
            //add given search term
            System.out.println("Enter a search term (X to exit): ");
            String searchTerm = myscanner.nextLine();

            if (searchTerm.equalsIgnoreCase("X")) {
                logAction("exit");
                break;
            }
            //add search for the term
            logAction("search : " + searchTerm);
        }

        //add successful completion
        System.out.println("Successfully Completed!");
    }

    //create try catch for logaction file creation
    public static void logAction(String action) {

        //add try
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt", true));

                //enter date time formatter for given
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                //add timestamp
                String timestamp = LocalDateTime.now().format(formatter);

                //add writer
                writer.write(timestamp + " " + action);
                writer.newLine();

                //close writer
                writer.close();


                //add catch
            } catch (IOException e) {
                System.out.println("Error writing the log file");
                throw new RuntimeException(e);
            }
        }
    }

