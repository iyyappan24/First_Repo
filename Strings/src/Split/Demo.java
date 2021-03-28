package Split;

public class Demo {

	
	public static void main(String[] args){
		
		String s ="iyyappan ably";
		
		String[] arr = s.split(" ");
		
		for(String str : arr ){
			System.out.println(str);
		}
		
		
		//output ---> iyyappan
		//              ably
	}
	
	
}
