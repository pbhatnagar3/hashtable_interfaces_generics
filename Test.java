import java.util.Scanner;


public class Test {

	public static void main(String[] args){
		
		Student<Integer>[] college = new Student[1000];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of student records that you want to add");
		int num_records = scan.nextInt();
		int i = 0;
		//collecting all the information
		while(num_records>i){
			System.out.println("Enter the name of the student\n");
			String name = scan.next();
			System.out.println("Enter the GTID for the student\n");
			Integer id = scan.nextInt();
			college[i] = new Student<Integer>(name, id);
			i++;
		}
		//adding everything to the hashtable
		HashTable<Integer, Student<Integer>> table = new HashTable<Integer, Student<Integer>>(college);
		
	}
}
