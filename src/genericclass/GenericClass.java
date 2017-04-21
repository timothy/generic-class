/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates an ArrayList of 10 Pair objects containing values. The program will
 * then print the string representation of each Pair to System.out (i.e., use
 * the toString() method).
 *
 * @author Timothy Bradford
 */
public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Pair> x = new ArrayList<>();

        //add Pair values to ArrayList
        for (int i = 0; i < 10; i++) {
            x.add(new Pair(1 + i, "Test: " + (i + 1)));
        }

        //Print all Pair values toString methods
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
    }

}
