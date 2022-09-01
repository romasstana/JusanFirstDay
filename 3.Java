import java.lang.Math;
import java.util.*;
class Main {
    public static String which_finger(int n){
      // int [][] array = new int[5][10000];
      // int p=1;
      // for(int i=0, j=0; i<5; i++){
      //   array[i][0]=p;
      //   p++;
      // }
      // for(int j = 1; j<10000;j++){
      //   if(j%2==1 || j==1){
      //     for(int i=3;i>=0;i--){
      //       array[i][j]=p++;
      //     }
      //   }
      //   else{
      //     for(int i=1;i<5;i++){
      //       array[i][j]=p++;
      //     }
      //   }
      // }
      int a=n-5;
      a=a%8;
      if(a==0){
        return "Мизинец";
      }
      else if(a==1 || a==7){
        return "Безымянный палец";
      }
      else if(a==2 || a==6){
        return "Средний палец";
      }
     
        return "Указательный палец";
      
    }
    public static void main(String[] args) {
      Scanner myInput = new Scanner( System.in );
      System.out.print( "Enter the integer: " );
      int a = myInput.nextInt();
      System.out.print(a+" => " + which_finger(a));
  }
}
