import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    char[] test = {
      'a', 'a', 'b', 'c', 'c', 'c', 'd', 'd', 'e', 'f'
    };
    System.out.println(compressGetLen(test, false));
  }

  public static List<String> compressGetLen(char[] input, boolean debug) {
    List<String> response = new ArrayList<>();
    Map<Character, Integer> data = new HashMap<>();
    for (char c : input) {
      if (data.containsKey(c)) {
        data.put(c, data.get(c) + 1);
      } else {
        data.put(c, 1);
      }
    }
    if (debug) {
      System.out.println(data.toString());
    }

    for (char c : data.keySet()) {
      String single = Character.toString(c) + data.get(c) + "";
      response.add(single);
    }

    return response;
  }
}