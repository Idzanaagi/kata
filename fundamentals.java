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
