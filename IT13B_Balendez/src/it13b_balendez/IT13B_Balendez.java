/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it13b_balendez;

/**
 *
 * @author User
 */
public class IT13B_Balendez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x = 10;
        int y = 4;
        int w = 6;
        
       System.out.println(x + " * " + y + " + " + w + " = " + (x * y + w));
       System.out.println("(" + x + " - " + y + ")"+ " % " + w + " = " + ((x - y) % w));
       System.out.println("(" + x + " + " + y + " + " + w + ")" + "/" + 3 + " = " + ((x + y + w) / 3));
       System.out.println(x + " * " + w + " - "+ "(" + y + "*" + y + ")" +" = " + (x * w - (y * y)));
    }
    
}
