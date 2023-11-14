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

// ======================

/*
Write a function that returns both the minimum and maximum number of the given list/array.
Examples (Input --> Output): [1,2,3,4,5] --> [1,5]
*/
class MinMax {
    public static int[] minMax(int[] arr) {
        int[] sorted = Arrays.stream(arr).sorted().toArray();
        int[] result = new int[2];
        result[0] = sorted[0];
        result[1] = sorted[sorted.length - 1];
        return result;
    }
}

/*
Write a function which takes a list of strings and returns each line prepended by the correct number.
Examples: (Input --> Output): ["a", "b", "c"] --> ["1: a", "2: b", "3: c"]
*/
public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < lines.size(); i++) {
            result.add((i + 1) + ": " + lines.get(i));
        }
        return result;
    }
}

/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
Examples: (Input --> Output): Kata.filterList(List.of(1, 2, "a", "b")) => List.of(1,2)
*/
public class Kata {
  public static List<Object> filterList(final List<Object> list) {
    return list.stream().filter(item -> item instanceof Integer).collect(Collectors.toList());
  }
}

/*
Your task is to return the number of people who are still on the bus after the last bus stop (after the last array).
*/
class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
        int in = 0;
        int out = 0;
        for (int[] stop : stops) {
            in += stop[0];
            out += stop[1];
        }
        return in - out;
  }
}
