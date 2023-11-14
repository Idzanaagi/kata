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
