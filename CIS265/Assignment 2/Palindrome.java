import java.util.Scanner;

public class Palindrome {
   
   public static void main(String s[]){
      
      System.out.print("Enter a String to check if it is a palindrome : ");
      Scanner scan = new Scanner(System.in);
      String palindromeStr = scan.nextLine();
      
      boolean palindrome = isPalindrome(palindromeStr);
      
      if(palindrome) 
         System.out.println(palindromeStr + " is a palindrome.");
      else 
         System.out.println(palindromeStr + " is not a palindrome.");
   }

   public static boolean isPalindrome(String palindromeStr){

      boolean result = false;
      String reversedStr = "";
      
      for(int k = palindromeStr.length() - 1; k >= 0; k--){
         reversedStr = reversedStr + palindromeStr.charAt(k);
      }

      if(palindromeStr.equals(reversedStr))
         result = true;
      
      return result;
   }
}