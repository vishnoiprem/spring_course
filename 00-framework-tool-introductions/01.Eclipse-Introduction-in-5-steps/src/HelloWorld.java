import java.util.HashMap;
import java.util.Map;


public class HelloWorld {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("key", "value");
        map.put("key", "value");

        System.out.print(map);

        Map <String, Long> maplong= new HashMap<String, Long>();
        maplong.put("1", (long) 10);
        System.out.print(maplong);

        Person person=new Person("prem","vis","1p");
        System.out.print(person);
        System.out.print(person.hashCode());

	}
}