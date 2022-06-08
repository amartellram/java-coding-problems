package arrayCollectionsDS.arrays;

public class FindElement {

  /**
   * Write several programs that exemplify how to find the given element (primitive and object) in
   * a given array. Find the index and/or simply check whether the value is in the array.
   */
  public static void main(String[] args) {

    int a[] = {1,2,3,4,5};

    System.out.println("index of element :"+find(a, 10));

  }

  /**
   *
   * @param array
   * @param e
   * @return index of element, -1 if not found
   */
  static  int find(int[] array, int e) {

    for (int i=0; i< array.length; i++){
      if(array[i] == e)
        return i;
    }

    return -1;
  }
}
