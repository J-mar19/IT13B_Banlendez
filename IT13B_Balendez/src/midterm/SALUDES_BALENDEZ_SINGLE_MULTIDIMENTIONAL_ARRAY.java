package midterm;

public class SALUDES_BALENDEZ_SINGLE_MULTIDIMENTIONAL_ARRAY {
    
    public static void main(String[] args) {
       
       char letters[] = {'A','B','C','D','E','F','G'};
       
        for (char a = 0; a < letters.length; a++) {
           System.out.print(letters[a] + "," );
           
       }
        System.out.println();
        
       int numbers [][] = {
           {1, 2, 3, 4},
           {5, 6, 7, 8},
           {9, 10, 11, 12}
       };
       for (int a = 0; a< numbers.length; a++){
           System.out.print ("The Numbers in Row " + (a + 1) + ": ");
           for (int b = 0; b< numbers[a].length; b++){
             System.out.print(numbers[a][b] + " ");
           }
           System.out.println();
       }
    }
}