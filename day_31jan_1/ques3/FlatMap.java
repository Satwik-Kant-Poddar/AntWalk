package day_31jan;
import java.util.*;
import java.util.stream.Collectors;
public class FlatMap {

	public static void main(String[] args) {
		List<String> productList1 = new ArrayList();
		productList1.add("hp_laptop");
		productList1.add("accer_laptop");
		productList1.add("samsung");
		List<String> productList2 = new ArrayList();
		productList2.add("hp_phone");
		productList2.add("acer");
		productList2.add("samsung");
		List<String> productList3 = new ArrayList();
		productList3.add("camera");
		productList3.add("acer");
		productList3.add("samsung s20fe");
		List<List<String>> productList = new ArrayList();
		productList.add(productList1);
		productList.add(productList2);
		productList.add(productList3);
		List<String> list = new ArrayList();
		list=productList.stream().flatMap(each->each.stream()).collect(Collectors.toList());
		System.out.println(productList);
		System.out.println(list);
		

	}

}
