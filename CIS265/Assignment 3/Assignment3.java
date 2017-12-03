import java.io.*;
import java.util.*;

public class Assignment3{
   
   public static void main(String args[]){
   
      BinaryTree tree = new BinaryTree(); //creates binary tree object
      int charCounter; //this corresponds to the character in the strings that are being compared; 0 is the first character, 1 is the second character, etc.
      boolean insert = false; //this variable is set to true when a new string is put in the binary tree
      char currentChar; //the character value for the string in the binary tree that the new string is being compared to
      char newChar; //the character value for the new string that is being compared to the string in the binary tree
      
      File file = new File("C:/Users/Borchmore/Documents/data.txt");
      FileInputStream fis = null;
      BufferedInputStream bis = null;
      DataInputStream dis = null;
      
      try{
         fis = new FileInputStream(file);
         bis = new BufferedInputStream(fis);
         dis = new DataInputStream(bis);
         
         tree.root = new Node(dis.readLine());
         while (dis.available() != 0){
            charCounter = 0; //this resets the character counter
            insert = false; //this resets the insert variable
            tree.current = tree.root; //this sets the current string in the tree to the root of the tree
            String currentLine = dis.readLine(); //currentLine is the string currently being read by the program   
            do{
               if(charCounter >= tree.current.line.length() || charCounter >= currentLine.length()){ //protects from an overflow error
                  if(tree.current.line.length() > currentLine.length()){ //checks if the current string is longer than the new string
                     if(tree.current.right == null){ //this inserts currentLine into the tree to the right of tree.current if there is space available
                       tree.current.right = new Node(currentLine);
                        insert = true;
                     }
                     else{ //this sets tree.current to the string to the right of tree.current if tree.current.right is not null
                        tree.current = tree.current.right;
                        charCounter = 0;
                     }
                  }
                  else{
                     if(tree.current.left == null){ //this inserts currentLine into the tree to the left of tree.current if there is space available
                        tree.current.left = new Node(currentLine);
                        insert = true;
                     }
                     else{ //this sets tree.current to the string to the left of tree.current if tree.current.left is not null
                        tree.current = tree.current.left;
                        charCounter = 0;
                     }
                  }
               }
               currentChar = tree.current.line.charAt(charCounter); //sets the current character to the character in the current string that corresponds to charCounter
               newChar = currentLine.charAt(charCounter); //same as above, but with the new string (currentLine)
               if(currentChar > 96){ //makes lowercase letters uppercase
                  currentChar = (char)(currentChar - 32);
               }
               if(newChar > 96){ //same as above
                  newChar = (char)(newChar - 32);
               }
               if(currentChar > newChar){ 
                  if(tree.current.left == null){ //this inserts currentLine into the tree to the left of tree.current if there is space available
                     tree.current.left = new Node(currentLine);
                     insert = true;
                  }
                  else{ //this sets tree.current to the string to the left of tree.current if tree.current.left is not null
                     tree.current = tree.current.left;
                     charCounter = 0;
                  }
               }
               else if(currentChar < newChar){ //this inserts currentLine into the tree to the right of tree.current if there is space available
                  if(tree.current.right == null){
                     tree.current.right = new Node(currentLine);
                     insert = true;
                  }
                  else{ //this sets tree.current to the string to the right of tree.current if tree.current.right is not null
                     tree.current = tree.current.right;
                     charCounter = 0;
                  }
               }
               else{ //this is reached when both strings have the same value for the current character; this moves the charCounter to the next character
                  charCounter++;
               }           
            } while(insert == false);
         }
      }
      catch(FileNotFoundException e){
         System.out.println("Error: File not found.");
      }
      catch(IOException e){
         System.out.println("Error: I/O error.");
      }
      
      tree.preorderPrint();
      tree.inorderPrint();
      tree.postorderPrint();
   }
}