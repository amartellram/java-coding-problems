package arrayCollectionsDS.arrays;

import java.util.Arrays;

public class ArraysCompare {

  public static void main(String[] args) {

    int[] integers1 = {3, 4, 5, 6, 1, 5};
    int[] integers2 = {3, 4, 5, 6, 1, 5};
    int[] integers3 = {3, 4, 5, 6, 1, 3};

    int i12 = Arrays.compare(integers1, integers1);

    System.out.println("comparing array 1 and array 2 : " + i12);

  }
}
