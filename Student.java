public class Student<k> implements IDinterface<k> {

	String name;
	k gtID;
	
	Student(String name,k value){
		this.name = name;
		this.gtID = value;
	}
	
	public String getName(){
		return name;
	}
	
	public k getID(){
		return gtID;		
	}
}
