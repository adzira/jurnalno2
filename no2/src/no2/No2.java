/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
        System.out.print("input  : ");
        int n=scn.nextInt();
//erickstdy.blogspot.com      

    for (int i = 1; i < n; i += 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");
        System.out.print("\n");
    }

    for (int i = n; i > 0; i -= 2) {
      for (int j = 0; j < 4 - i / 2; j++)
        System.out.print(" ");

      for (int j = 0; j < i; j++)
        System.out.print("*");
        System.out.print("\n");
    }
    
}
