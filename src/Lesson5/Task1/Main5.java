package Lesson5.Task1;

//Учитывая два массива строк words1и words2, верните количество строк, которые
// появляются ровно один раз в каждом  из двух массивов.

import java.util.HashMap;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {
    }

    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words1.length; i++) {
            if (map.containsKey(words1[i])) {
                map.put(words1[i], map.get(words1[i]) + 1);
            } else {
                map.put(words1[i], 1);
            }
        }

        for (String word : words2) {
            if (map.containsKey(word)) {
                if (map.get(word) <= 1) {
                    map.put(word, map.get(word) - 1);
                }
            }
        }
        int count = 0;
        for (String word : words1) {
            if (map.get(word) == 0) {
                count++;
            }
        }
        return count;
    }
}


