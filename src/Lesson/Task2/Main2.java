package Lesson.Task2;

import java.util.ArrayList;

//На вход методу приходят два ArrayList<Integer> и целое число num. Проверьте, что число
// num встречается в обоих массивах одинаковое кол-во раз.
public class Main2 {
    public static void main(String[] args) {

    }

    public boolean isNumCountEquals(ArrayList<Integer> nums1, ArrayList<Integer> nums2, int num) {

        int count = 0;

        for (int elem : nums1) {
            if (elem == num) {
                count++;
            }
        }

        for (int elem : nums2) {
            if (elem == num) {
                count--;
            }
        }
        return count == 0;
    }
}


