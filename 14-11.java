// Arrays

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

// String

/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)
"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
*/
public class isogram {
    public static boolean  isIsogram(String str) {
        List<String> list = Arrays.stream(str.toLowerCase().split("")).sorted().collect(Collectors.toList());
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).hashCode() == list.get(i + 1).hashCode()) {
                return false;
            }
        }
        return true;
  }
}

/*
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings: name + " plays banjo", name + " does not play banjo"
*/
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    return name.startsWith("R") || name.startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
  }
}

/*
Write a function to split a string and convert it into an array of words.
*/
public class Solution {
    public static String[] stringToArray(String s) {
      return s.split(" ");
    }
}

/*
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
*/
class Kata {
  public static String countingSheep(int num) {
     StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(Integer.toString(i)).append(" sheep...");
        }
    return result.toString();
  }
}

/*
Complete the solution so that it reverses the string passed into it. 
*/
public class Kata {
  public static String solution(String str) {
    return new StringBuilder(str).reverse().toString();
  }
}

// fundamentals

public class Kata {
  public ArrayList<String> fizzBuzz() {
      ArrayList<String> result = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            if (i % 3 == 0) {
                result.add("Fizz");
            }
            if (i % 5 == 0) {
                result.add("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                result.add(String.valueOf(i));
            }
        }
      return result;
}

/*
Your task is to make two functions (max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.

Example (Input -> Output): [4,6,2,1,9,63,-134,566] -> max = 566, min = -134
*/
public class Kata {
  public int min(int[] list) {
    int mins = list[0];
    for (int num : list) {
      if (num < mins) {
        mins = num;
      }
    }
    return mins;
  }
  
  public int max(int[] list) {
     int max = list[0];
    for (int num : list) {
      if (num > max) {
        max = num;
      }
    }
    return max;
  }
}

/*
You are given the length and width of a 4-sided polygon. The polygon can either be a rectangle or a square.
If it is a square, return its area. If it is a rectangle, return its perimeter.
*/
public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        return l == w ? l * w : (l + w) * 2;
    }
}

/*
Your task is to create a function that does four basic mathematical operations.
The function should take three arguments - operation(string/char), value1(number), value2(number).
The function should return result of numbers after applying the chosen operation.
*/
public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    switch (op) {
        case "+":
        return v1 + v2;
        
        case "-": 
        return v1 - v2;
        
        case "*":
        return v1 * v2;
        
        case "/":
        return v1 / v2;
        
        default:
        return 0;
    }
  }
}


/*
Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.
*/
public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).map(String::length).sorted().toList().get(0);
    }
}

/*
Very simple, given an integer or a floating-point number, find its opposite.
*/
public class Kata {
  public static int opposite(int number) {
    return number > 0 ? - number : number * -1;
  }
}

/*
Your classmates asked you to copy some paperwork for them. You know that there are 'n' classmates and the paperwork has 'm' pages.
Your task is to calculate how many blank pages do you need. If n < 0 or m < 0 return 0.
*/
public class Paper {
  public static int paperWork(int n, int m) {
   return n < 0 || m < 0 ? 0 : n * m;
  }
}

/*
Given an integral number, determine if it's a square number:
*/
public class Square {    
  public static boolean isSquare(int n) {    
    if (n == 0) {
      return true;
    }
      return n % Math.sqrt(n) == 0;
  }
}
