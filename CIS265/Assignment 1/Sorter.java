import java.util.*;

public class Sorter{
   public static void main(String args[]){
   
      int a[] = new int[20];
      for(int i = 0; i < a.length; i++){
         a[i] = (int) (Math.random() * 100);
      }
      
      int b[] = new int[20];
      b = bSort(a, 10);
      
      for(int j = 0; j < a.length; j++){
         System.out.println(a[j]);
      }
      
      System.out.println();
      System.out.println("-------------------------");
      System.out.println();
      
      for(int k = 0; k < b.length; k++){
         System.out.println(b[k]);
      }
   }
   
   public static int[] bSort(int[] a, int number){
      
      int dummy;
      
      if(number < 1){
         return a;
      }
      else{
         a = bSort(a, number/2);
         for(int i = 0; i < a.length - number;){
            if(a[i] > a[i+number]){
               dummy = a[i];
               a[i] = a[i+number];
               a[i+number] = dummy;
            }
            i=i+number;
         }
         return a;
      }
   }
}