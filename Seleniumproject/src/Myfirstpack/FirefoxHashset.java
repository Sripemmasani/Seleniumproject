package Myfirstpack;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FirefoxHashset {

	public static void main(String[] args) {

		
		Set <String> value=new HashSet<>();
		
		value.add("TEsting");
		value.add("200");
		value.add("&*");
		value.add("200");
		System.out.println(value.size());
		
		
		Iterator<String> i=value.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
		
	}

}


// listen day42 for hashsets