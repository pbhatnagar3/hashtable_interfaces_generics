import java.util.HashMap;


public class HashTable<k, t extends IDinterface<k>> {

	HashMap<k,t> map = new HashMap<k,t>();
	
	HashTable(t[] records){
		for(t temp : records)
			map.put(temp.getID(), temp);
		
	}	
}
