package arrayCollectionsDS.queue;

import java.util.ArrayDeque;

public class Queue {

  public static void main(String[] args) {
    ArrayDeque<String> list = new ArrayDeque<>();

    list.add("s1");
    list.add("s2");
    list.add("s3");

    System.out.println(list);

    list.pop();

    System.out.println(list);

  }
}
