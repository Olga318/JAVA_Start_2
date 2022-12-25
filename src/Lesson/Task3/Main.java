package Lesson.Task3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    }

    public void sortEven(ArrayList<Integer> nums) {
        ArrayList<Integer> evenNums = new ArrayList<>();
        for (int elem : nums) {
            if (elem % 2 == 0) {
                evenNums.add(elem);
            }
        }
        Collections.sort(evenNums);
        int j = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.set(i, evenNums.get(j));
                j += 1;
            }

        }
    }


}


