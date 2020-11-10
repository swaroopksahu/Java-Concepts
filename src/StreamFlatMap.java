import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap{
	
	public static void main(String[] args) {
		List<List<String>> mainList = new ArrayList<>();
		
		List<String> colorList = new ArrayList<String>();
		colorList.add("green");
		colorList.add("ping");
		colorList.add("yellow");
		
		List<String> cityList = new ArrayList<String>();
		cityList.add("mumbai");
		cityList.add("delhi");
		cityList.add("bangalore");
		
		List<String> numberList = new ArrayList<String>();
		numberList.add("one");
		numberList.add("two");
		numberList.add("three");
		
		mainList.add(colorList);
		mainList.add(cityList);
		mainList.add(numberList);
		
		System.out.println(mainList+"\n");
		//Output: [[green, ping, yellow], [mumbai, delhi, bangalore], [one, two, three]]
		
		List<String> collect = mainList.stream().flatMap(x -> x.stream()).collect(Collectors.toList());
		
		System.out.println(collect);
		//Output: [green, ping, yellow, mumbai, delhi, bangalore, one, two, three]
		
	}
}