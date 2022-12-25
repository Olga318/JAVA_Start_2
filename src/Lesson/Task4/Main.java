package Lesson.Task4;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// ArrayList<Integer> удалите из него четные числа (на итератор)
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 4, 6, 1, 2, 8, 3);
        ArrayList<Integer> arrayList = new ArrayList<>(nums);
        Iterator<Integer> iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
        }

    }
}

