/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.module2assignment;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * Aidan Jacoby 11/2/25 Module 2 Assignment
 */
public class Module2assignment {

    public static void main(String[] args) {
        
        int[] randInt = {4, 78, 94, 2, 410};
        double[] randDouble = {5.00, 8.39, 6.01, 8.47, 10.41};
        
        try {
            File myObj = new File("aidanjacobydatafile.dat");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }
            else {
                System.out.println("File already exists.");
            }
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        try {
            FileWriter myWriter = new FileWriter("aidanjacobydatafile.dat", true);
            for (int i = 0; i < randInt.length; i++) {
                myWriter.write(randInt[i]+", ");
            }
            for (int i = 0; i < randDouble.length; i++) {
                myWriter.write(randDouble[i]+", ");
            }
            System.out.println("File Apprended.");
            myWriter.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}