import java.lang.Math;
import java.util.*;
class Main {
  public static void main(String[] args) {
    
    int[] numbers  = {4,3,9,7,2,1};
    
    int[] newNumbers = new int[numbers.length];
    
    for(int i=0;i<numbers.length;i++){
      newNumbers[i]=numbers[i];
    }
    
    newNumbers=squareOrSquareRoot(newNumbers);
    
    System.out.print("[");
    for(int j=0;j<numbers.length;j++){
      
        System.out.print(numbers[j]+", ");
      
      }
    
    System.out.print("] -> [");
    for(int j=0;j<numbers.length;j++){
      
        System.out.print(newNumbers[j]+", ");
      
      }
    System.out.print("]");
  }
  
  static boolean checkPerfectSquare(double x)  
    {
      
	    double sq = Math.sqrt(x); 
	    return ((sq - Math.floor(sq)) == 0); 
      
    }

  public static int[] squareOrSquareRoot(int[] newNumbers){
    for(int i=0; i<newNumbers.length;i++){
      
       if(checkPerfectSquare(newNumbers[i])){
         
         double root=Math.sqrt(newNumbers[i]);
         newNumbers[i] = (int)root;
       }
       else{
         
         newNumbers[i]=newNumbers[i]*newNumbers[i];
         
       }
    }
      return newNumbers;
  }
}
