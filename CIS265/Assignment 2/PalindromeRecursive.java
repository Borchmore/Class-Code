import java.util.Scanner;

public class PalindromeRecursive {
   
   public static void main(String[] args) {

      System.out.print("Enter a string to check if it is palindrome :: ");
      Scanner input = new Scanner(System.in);
      String inputString = input.nextLine();
      String palindromeString = cleanupString(inputString, 0);
      boolean isPalindrome = checkPalindrome(palindromeString, 0, palindromeString.length() - 1);
      if (isPalindrome) {
         System.out.println("The given string is a palindrome");
      } 
      else {
         System.out.println("The given string is not a palindrome");
      }
      input.close();
   }

   private static String cleanupString(String s, int counter) {
      
      String cleanupStr = "";
      
      if(counter == s.length() - 1){
         if((s.charAt(counter) > 97) && (s.charAt(counter) < 122)){
            cleanupStr = s.charAt(counter) + cleanupStr; 
         }
      }
      else if((s.charAt(counter) > 97) && (s.charAt(counter) < 122)){
         cleanupStr = s.charAt(counter) + cleanupString(s, counter + 1);
      }
      else{
         cleanupStr = cleanupString(s, counter + 1);
      }
            
      return cleanupStr;
   }
   
   private static boolean checkPalindrome(String inputString, int low, int high) {
      
      boolean checkResult;
      
      if(low >= high){
         checkResult = true;
      }
      else if (inputString.charAt(low) != inputString.charAt(high)){
            checkResult = false;
         }
         else {
            checkResult = checkPalindrome(inputString, low + 1, high - 1);
         }
      
      return checkResult;     
   }
}