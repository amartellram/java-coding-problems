package arrayCollectionsDS.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class SortingArray {

  /**
   * Write several programs that exemplify different sorting algorithms for arrays. Also, write a
   * program for shuffling arrays.
   */
  public static void main(String[] args) {

    Melon[] melons = new Melon[]{new Melon("melon 1", 5), new Melon("melon 2", 4)};

    Arrays.sort(melons, new Comparator<Melon>() {
      @Override
      public int compare(Melon o1, Melon o2) {
        return Integer.compare(o1.weight, o2.weight);
      }
    });

    print(melons);

    melons = new Melon[]{new Melon("melon 1", 10), new Melon("melon 2", 4),
        new Melon("melon 3", 8)};
    Arrays.sort(melons,
        (melon1, melon2) -> Integer.compare(melon1.getWeight(), melon2.getWeight()));

    print(melons);


  }

  static void print(Melon[] a) {
    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i] + ", ");
    }
    System.out.println();
  }

  static class Melon {

    private final String type;
    private final int weight;

    public Melon(String type, int weight) {
      this.type = type;
      this.weight = weight;
    }

    public String getType() {
      return type;
    }

    public int getWeight() {
      return weight;
    }

    @Override
    public String toString() {
      return "Melon{" +
          "type='" + type + '\'' +
          ", weight=" + weight +
          '}';
    }
  }
}
