import java.lang.Math;
class Main {
  public static void main(String[] args) {
    
    int[] numbers  = {4,3,9,7,2,1};
    for(int i=0; i<numbers.length;i++){
       if(checkPerfectSquare(numbers[i])){
         
         double root=Math.sqrt(numbers[i]);
         numbers[i] = (int)root;
       }
       else{
         numbers[i]=numbers[i]*numbers[i];
       }
    }
    for(int j=0;j<numbers.length;j++){
        System.out.print(numbers[j] +", ");
      }
  }
  
  static boolean checkPerfectSquare(double x)  
    {
      
	    double sq = Math.sqrt(x); 
	    return ((sq - Math.floor(sq)) == 0); 
      
    }
}