package day30jan;
import java.util.*;
import java.util.stream.Collectors;
public class Filter_assignment {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		List<String> newList = new ArrayList();
		list.add("satwik");
		list.add("sita");
		list.add("swarik dey");
		list.add("saxena");
		newList=
				list.stream().filter(n->(n.length()<=8&&n.length()>=5))
				.collect(Collectors.toList());
		System.out.println(list);
		System.out.println(newList);
	}

}
