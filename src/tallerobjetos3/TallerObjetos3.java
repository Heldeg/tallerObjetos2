/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos3;

import java.util.Scanner;

/**
 *
 * @author EDER H
 */
public class TallerObjetos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int edad;
        System.out.print("Dime tu edad: ");
        edad = s.nextInt();
        System.out.println("");
        if (edad >= 0 && edad < 150) {
            System.out.println("Ok, gracias");
        } else if (edad < 0) {
            System.out.println("Lo siento, aun no has nacido");
        } else {
            System.out.println("Lo siento, estas muy viejo");
        }
    }

}
