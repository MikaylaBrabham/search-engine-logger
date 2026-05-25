package com.pluralsight;

//import file writer / reader. buffer. localdate . scanner

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

            if(searchTerm.equalsIgnoreCase("X")) {
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
}
