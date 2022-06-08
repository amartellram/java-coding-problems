package arrayCollectionsDS.arrays;

public class ReverseArray {

  /**
   * Write a program that reverses the given array.
   */
  public static void main(String[] args) {

    int a[] = {1, 2, 3, 4, 5};

    print(a);
    reverse(a);
    print(a);
  }

  static void reverse(int[] a) {
    int n = a.length;
    for (int i = 0; i < n / 2; i++) {
      int temp = a[i];
      a[i] = a[n - 1 - i];
      a[n - 1 - i] = temp;
    }
  }

  static void print(int[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + " ");
    }
    System.out.println();
  }
}
