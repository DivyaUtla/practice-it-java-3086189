package _03_06;

import java.util.Arrays;
import java.util.List;

public class EnhancedForLoops {

  public static void main(String[] args) {
    int[] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19 };
    // Write an enhanced for loop to print out each prime number in the array.
for(int primenum:primeNumbers){
  System.out.println(primenum);
}
    List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
    // Write an enhanced for loop to print out each week day in the list.
for(String weekday:weekDays){
  System.out.println(weekday);
}
    int[] randomNumbers = { 23, 51, 72, 84, 1, 60, 34, 102 };
    // Write an enhanced for loop to print out the numbers in the array that are
    // greater than 50.
    for(int randomnum:randomNumbers){
      if(randomnum>50){
        System.out.println(randomnum);
      }
    }

  }

}
