/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication13;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author User
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ara = new Scanner(System.in);
        Random mina = new Random();
       
       int Random = mina.nextInt(100)+1;
       int guess = 2;
       int attempt = 0;
       
       System.out.print("Enter Your Guess: ");
       guess = ara.nextInt();
       
       do {
           guess++;
           attempt++;
           
           
           if (guess > Random){
               System.out.println("Too High! Please Try Again! ");
               
           }else if (guess < Random){
               System.out.println("Too Low! Please Try Again! ");
               
           }else {
               System.out.println("Congratiolations! You Guessed the Right Number! in "+attempt+"attempt.");
           }
       } while (guess < Random);
     
        
    }
    
}
