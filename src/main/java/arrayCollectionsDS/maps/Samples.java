package arrayCollectionsDS.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Samples {

  public static void main(String[] args) {
    computeIfAbsent();
    merge();
    remove();
  }

  static void computeIfAbsent() {
    Map<String, String> map = new HashMap<>();

    map.put("postgresql", "127.0.0.1");
    map.put("mysql", "192.168.0.50");

    BiFunction<String, String, String> jdbcUrl = (k, v) -> "jdbc:" + k + "://" + v
        + "/customers_db";

    // accepts bi-function
    String mySqlJdbcUrl = map.computeIfPresent("mysql", jdbcUrl);
    System.out.println(mySqlJdbcUrl);

  }

  private static void merge() {

    Map<String, String> map = new HashMap<>();
    map.put("postgresql", "9.6.1 ");
    map.put("mysql", "5.1 5.2 5.6 ");

    //BiFunction<String, String, String> jdbcUrl = String::concat;
    BiFunction<String, String, String> jdbcUrl = (vold, vnew) -> vold.concat(vnew);

    String mysqlVersion = map.merge("mysql", "8.0 ", jdbcUrl);

    System.out.println("Merge sample: " + mysqlVersion);
  }

  private static void remove() {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "postgresql");
    map.put(2, "mysql");
    map.put(3, "derby");

    String r1 = map.remove(1);

    map.entrySet().removeIf(e -> e.getValue().equals("mysql"));

    System.out.print("remove : ");
    System.out.println(map);
  }

}
