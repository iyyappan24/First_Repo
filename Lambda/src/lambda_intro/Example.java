package lambda_intro;

interface Fruit{
	void show();     // functional interface
}



public class Example {

	
	public static void get(Fruit fg){
		
		fg.show();
	}
	
	
	
	public static void main(String[] args){
		
		
		Fruit f = () -> System.out.println("This is a fruit");  // implementation of functional interface
		
		f.show(); // calling the method for execution 
		
		          // normally we can call functions and we will pass values but with the help of lambda expression
		          //  we can pass the function body itself
		
		
         Example.get(f);
                
                
                
                
		
		
		
	}
	
	
	
	
}
