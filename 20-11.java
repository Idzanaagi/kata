/*
The main idea is to count all the occurring characters in a string. If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
What if the string is empty? Then the result should be empty object literal, {}.
*/
public class Kata {
    public static Map<Character, Integer> count(String str) {
       if (str.isEmpty()) {
            return new LinkedHashMap<>();
        }
        List<String> arrayList = Arrays.stream(str.split("")).toList();
        List<String> distinct = Arrays.stream(str.split("")).sorted().distinct().toList();
        Map<Character, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < distinct.size(); i++) {
            int finalI = i;
            int count = arrayList.stream().filter(item -> Objects.equals(item, distinct.get(finalI))).toArray().length;
            result.put(distinct.get(i).charAt(0), count);
        }
        return result;
    }
}

/*
In this kata you should simply determine, whether a given year is a leap year or not. In case you don't know the rules, here they are:
    Years divisible by 4 are leap years,
    but years divisible by 100 are not leap years,
    but years divisible by 400 are leap years.
Tested years are in range 1600 ≤ year ≤ 4000.
*/
public class LeapYears {
  public static boolean isLeapYear(int year) {
    return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
  }
}

/*
Write a function that will return the count of distinct case-insensitive alphabetic characters and numeric digits that occur more than once in the input string. The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.
Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
*/
public class CountingDuplicates {
  public static int duplicateCount(String text) {
        if (text.length() == Arrays.stream(text.toLowerCase().split("")).distinct().count()) {
          return 0;
        }
        List<String> distinct = Arrays.stream(text.toLowerCase().split("")).distinct().toList();
        List<String> arr = Arrays.stream(text.toLowerCase().split("")).toList();
        int result = 0;
        for (int i = 0; i < distinct.size(); i++) {
            int finalI = i;
            if (arr.stream().filter(item -> item.equals(distinct.get(finalI))).toList().size() >= 2) {
                result += 1;
            }
        }
        return result;
  }
}

/*
Your task is to sort an array of integer numbers by the product of the value and the index of the positions.
For sorting the index starts at 1, NOT at 0!
The sorting has to be ascending.
The array will never be null and will always contain numbers. 
*/
public class Kata {
  public static int[] sortByValueAndIndex(int[] array) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i] * (i + 1), array[i]);
        }
        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        return valueList.stream().mapToInt(i -> i).toArray();
  }
}

/*
Using n as a parameter in the function pattern, where n>0, complete the codes to get the pattern (take the help of examples):
Note: There is no newline in the end (after the pattern ends)
Examples
pattern(3) should return "1\n1*2\n1**3", e.g. the following:
1
1*2
1**3
*/
public class Kata {
    public static String pattern(int n){
        StringBuilder string = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                string.append(1);
            }
            if (i != 1) {
                string.append("\n")
                  .append(1)
                  .append("*".repeat(i - 1))
                  .append(i);
            }
        }
        return String.valueOf(string);
    }
}
