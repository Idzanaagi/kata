/*
In this Kata, you will implement the Luhn Algorithm, which is used to help validate credit card numbers.
Given a positive integer of up to 16 digits, return true if it is a valid credit card number, and false if it is not.
Here is the algorithm:
    Double every other digit, scanning from right to left, starting from the second digit (from the right).
    Another way to think about it is: if there are an even number of digits, double every other digit starting with the first; if there are an odd number of digits, double every other digit starting with the second:
    If a resulting number is greater than 9, replace it with the sum of its own digits (which is the same as subtracting 9 from it):
    Sum all of the final digits:
    Finally, take that sum and divide it by 10. If the remainder equals zero, the original credit card number is valid.
*/
public class Validate{
  public static boolean validate(String n){
        int[] arrayList = Arrays.stream(n.split("")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arrayList.length; i++) {
            if (arrayList.length % 2 != 0) {
                if (i % 2 != 0) {
                    result.add(arrayList[i] * 2);
                }
                if (i % 2 == 0) {
                    result.add(arrayList[i]);
                }
            }
            if (arrayList.length % 2 == 0) {
                if (i % 2 == 0) {
                    result.add(arrayList[i] * 2);
                }
                if (i % 2 != 0) {
                    result.add(arrayList[i]);
                }
            }
        }
        List<Integer> filter = result.stream().map(i -> i > 9 ? i = i - 9 : i).toList();
        List<Integer> reduce = filter.stream().reduce(Integer::sum).stream().toList();
        return reduce.get(0) % 10 == 0;
  }
}

/*
Given two words and a letter, return a single word that's a combination of both words, merged at the point where the given letter first appears in each word. 
The returned word should have the beginning of the first word and the ending of the second, with the dividing letter in the middle. You can assume both words will contain the dividing letter.
*/
public class Kata {
  public static String stringMerge(String s1, String s2, char letter) {
    return  s1.substring(0, s1.indexOf(letter)) + s2.substring(s2.indexOf(letter));
  }
}

/*
 Find the sum of all multiples of n below m
Keep in Mind
    n and m are natural numbers (positive integers)
    m is excluded from the multiples
*/
public class Kata {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
          throw new IllegalArgumentException();
        }
        int[] arr = IntStream.rangeClosed(n, m -1).toArray();
        return Arrays.stream(arr).filter(item -> item % n == 0).sum();
    }
}

/*
Define String.prototype.toAlternatingCase (or a similar function/method such as to_alternating_case/toAlternatingCase/ToAlternatingCase in your selected language; 
see the initial solution for details) such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.
*/
public class StringUtils {
  public static String toAlternativeString(String string) {
        String[] arr = string.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : arr) {
            StringBuilder stringBuilder1 = item.equals(item.toUpperCase()) ?
                    stringBuilder.append(item.toLowerCase()) : item.equals(item.toLowerCase()) ?
                    stringBuilder.append(item.toUpperCase()) : stringBuilder.append(item);
        }
        return stringBuilder.toString();
  }
}

/*
Write a function that merges two sorted arrays into a single one. The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.
*/
public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		  int[] result = new int[first.length + second.length];
      System.arraycopy(first, 0, result, 0, first.length);
      System.arraycopy(second, 0, result, first.length, second.length);
      return Arrays.stream(result).sorted().distinct().toArray();
	}
}

/*
Find the mean (average) of a list of numbers in an array.
*/
public class GrassHopper {
    public static int findAverage(int[] nums) {
      return Arrays.stream(nums).sum() / nums.length;
    }
}

/*
You will be given an array of numbers. You have to sort the odd numbers in ascending order while leaving the even numbers at their original positions.
*/
public class Kata {
  public static int[] sortArray(int[] array) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                hashMap.put(i, array[i]);
            }
        }
        HashMap<Integer, Integer> odd = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.put(i, array[i]);
            }
        }
        List<Integer> filter = Arrays.stream(array).filter(i -> i % 2 != 0).sorted().boxed().toList();
        Object[] keys = odd.keySet().stream().sorted().toArray();
        for (int i = 0; i < keys.length; i++) {
            odd.put((Integer) keys[i], filter.get(i));
        }
        for (int i = 0; i < hashMap.size(); i++) {
            result[(int) hashMap.keySet().toArray()[i]] = (int) hashMap.values().toArray()[i];
        }
        for (int i = 0; i < odd.size(); i++) {
            result[(int) odd.keySet().toArray()[i]] = (int) odd.values().toArray()[i];
        }
        return result;
  }
}

/*
I'm new to coding and now I want to get the sum of two arrays... Actually the sum of all their elements. I'll appreciate for your help.
P.S. Each array includes only integer numbers. Output is a number too.
*/
public class Sum {
  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
  }
}

/*
Given an array with exactly 5 strings "a", "b" or "c" (chars in Java, characters in Fortran), check if the array contains three and two of the same values.
*/
public class Solution {
    public boolean checkThreeAndTwo(char[] chars) {
    String[] arr = Arrays.toString(chars).split("");
        int a = Arrays.stream(arr).filter(i -> i.equals("a")).toArray().length;
        int b = Arrays.stream(arr).filter(i -> i.equals("b")).toArray().length;
        int c = Arrays.stream(arr).filter(i -> i.equals("c")).toArray().length;
        if (a != 3 && b != 3 && c != 3) {
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        if (arrayList.contains(3) && arrayList.contains(2)) {
            return true;
        }
        return false;
    }
}
