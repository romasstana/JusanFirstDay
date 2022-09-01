import java.lang.Math;
import java.util.*;
class Main {

    public static List<Integer> dont_give_me_five(int start, int end){
        List<Integer> array = new ArrayList<>();
        for(int i = start; i <= end; i++){
            if(start==5 || start%10==5 || start/10==5){
              start++;
            }
          else{
            array.add(start);
            start++;
          }
        }
      return array;
    }

    public static void main(String[] args) {
      Scanner myInput = new Scanner( System.in );
      System.out.print( "Enter first integer: " );
      int a = myInput.nextInt();
      System.out.print( "Enter second integer: " );
      int b = myInput.nextInt();
      List<Integer> lastArray = dont_give_me_five(a, b);
      System.out.print(a + ", "+ b + " -> " +  Arrays.toString(lastArray.toArray()) + "-> Result " + lastArray.size());
    }

}
