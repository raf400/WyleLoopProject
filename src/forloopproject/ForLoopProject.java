/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopproject;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class ForLoopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Using input to account for the nth value, suggested up to 9 as to keep
        //format
        System.out.println("Enter a value(up to 9):");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 1;

        while (i <= n) {
            String dot = new String(new char[n - i]).replace('\0', '.');
            System.out.print(dot);

            for (int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
            i++;
        }

    }

}
