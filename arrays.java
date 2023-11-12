/*
Given a list of integers, determine whether the sum of its elements is odd or even.
Give your answer as a string matching "odd" or "even".
If the input array is empty consider it as: [0] (array with a zero).
*/
public class Codewars {
  public static String oddOrEven (int[] array) {
    return Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
  }
}

/*
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20
*/
public class Positive{
  public static int sum(int[] arr){
    return arr.length == 0 ? 0 : Arrays.stream(arr).filter(item -> item > 0).sum();
  }
}

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.
*/
public class Kata {
  public static int squareSum(int[] n) { 
     double sum = Arrays.stream(n).mapToDouble(item -> Math.pow(item, 2)).sum();
     return (int) Math.round(sum);
  }
 }

/*
Consider an array/list of sheep where some sheep may be missing from their place. We need a function that counts the number of sheep present in the array (true means present).

Example:
[true,  true,  true,  false,
  true,  true,  true,  true ,
  true,  false, true,  false,
  true,  false, false, true ,
  true,  true,  true,  true ,
  false, false, true,  true]
The correct answer would be 17.
*/
public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    List<Boolean> filter = Arrays.stream(arrayOfSheeps).filter(
                Objects::nonNull).toList().stream().filter(item -> item.equals(true)).toList();
    return filter.size();
  }
}
