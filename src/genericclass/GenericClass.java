/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericclass;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ^_^
 */
public class GenericClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Pair> x = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            x.add(new Pair(1 + i, "Test: " + (i + 1)));
        }

        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i).toString());
        }
    }

}
