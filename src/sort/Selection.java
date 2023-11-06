package sort;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Selection s = new Selection();
        System.out.println(Arrays.toString(s.selectSort()));
    }

    public int[] selectSort() {
        int index = 0, temp;
        int min;
        int[] array = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        for (int i = 0; i < array.length; i++) {
            min = Integer.MAX_VALUE;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        return array;
    }


}
