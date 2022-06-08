package arrayCollectionsDS.arrays;

public class ArraysEqual {

  /**
   * Write a program that checks whether the two given arrays are equals or whether there is a
   * mismatch.
   */
  public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5};
    int b[] = {1, 2, 3, 4, 5, 10};

    System.out.println("equals : " + equals(a, b));
  }

  static boolean equals(int[] a, int[] b) {
    if (a.length != b.length) {
      return false;
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] != b[i]) {
        return false;
      }
    }

    return true;
  }
}
