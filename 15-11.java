/*
Given a string, capitalize the letters that occupy even indexes and odd indexes separately, and return as shown below. Index 0 will be considered even.
For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.
The input will be a lowercase string with no spaces.
*/
class Solution{
    public static String[] capitalize(String s){
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>();
        String[] array = s.split("");
        for (int i = 0; i < s.length(); i++) {
            boolean q = i % 2 == 0 ? strings.add(array[i].toUpperCase()) : strings.add(array[i]);
        }
        for (int i = 0; i < s.length(); i++) {
            boolean q = i % 2 == 0 ? strings1.add(array[i]) : strings1.add(array[i].toUpperCase());
        }
        String listString = String.join("", strings);
        String listString1 = String.join("", strings1);
        return new String[]{listString, listString1};
    }
}

/*
Complete the function to find the count of the most frequent item of an array. You can assume that input is an array of integers. For an empty array return 0
*/
public class Kata {
  public static int mostFrequentItemCount(int[] collection) {
       int[] val = Arrays.stream(collection).distinct().toArray();
       int count = 0;
       for (int item : val) {
           int length = Arrays.stream(collection).filter(coll -> item == coll).toArray().length;
           if (length > count) {
               count = length;
           }
       }
        return count;
  }
}

/*
It checks the char in the given string from the front with an iteration, in the iteration it does these steps:
    There is a flag and it will be started from 1.
    Check the current char in the iteration index.
        If it is an alphabet character [a-zA-Z] and the flag value is equal to 1, then change this character to upper case.
        If it is an alphabet character [a-zA-Z] and the flag value is equal to 0, then change this character to lower case.
        Otherwise, if it is not an alphabet character, then set the flag value to 1.
    If the current char is an alphabet character, do a boolean not operation to the flag.
After the iteration has done, return the fixed string that might have been changed in such iteration.
*/
public class Ugly {
  public static String uglifyWord(String str) {
        boolean flag = true;
        ArrayList<String> arrayList = new ArrayList<>();
        String[] split = str.split("");
        for (String string : split) {
            if (string.matches("[a-zA-Z]+")) {
                if (flag == true) {
                    arrayList.add(string.toUpperCase());
                }
                if (flag == false) {
                    arrayList.add(string.toLowerCase());

                }
                flag = !flag;
            }
            if (!string.matches("[a-zA-Z]+")) {
                arrayList.add(string);
                flag = true;
            }
        }
        return String.join("", arrayList);
  }
}

/*
Count how often sign changes in array.
result - number from 0 to ... . Empty array returns 0
*/
public class Solution {
  public static int signChange(int[] arr) {
        int length = Arrays.stream(arr).filter(item -> item < 0).toArray().length;
        if (length == 0 || length == 1) {
            return length;
        }
        int count = 0;
        boolean flag = arr[0] >= 0;
        for (int i = 0; i < arr.length; i++) {
           if (flag && arr[i] < 0) {
               count += 1;
               flag = !flag;
           }
           if (!flag && arr[i] >=0 ) {
               count += 1;
               flag = !flag;
           }
        }
        return count;
  }
}

/*
Determine the total number of digits in the integer (n>=0) given as input to the function. For example, 9 is a single digit, 66 has 2 digits and 128685 has 6 digits. Be careful to avoid overflows/underflows.
*/
public class DecTools {
  public static int Digits(long n) {
    return String.valueOf(n).length();
  }
}

/*
Nickname Generator
Write a function, nicknameGenerator that takes a string name as an argument and returns the first 3 or 4 letters as a nickname.
If the 3rd letter is a consonant, return the first 3 letters.
If the 3rd letter is a vowel, return the first 4 letters. 
If the string is less than 4 characters, return "Error: Name too short".
*/

class Generator {
      public static String nickname (String name) {
        if (name.length() < 4) {
            return "Error: Name too short";
        }
        String[] n = name.split("");
        if (n[2].matches("[aeiou]")) {
            return name.substring(0, 4);
        }
        return name.substring(0, 3);
    }
}
