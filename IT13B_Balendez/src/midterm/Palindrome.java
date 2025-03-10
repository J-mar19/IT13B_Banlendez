package midterm;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = in.nextLine();
        
        String reversedWord = new StringBuilder(word).reverse().toString();
        
        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println("The word is a palindrome.");
        } else {
            System.out.println("The word is not a palindrome.");
        }
        
        in.close(); // Close the scanner
    }
}

    
