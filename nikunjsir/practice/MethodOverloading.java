class MethodOverloading{


	static void breakFast(){
		
		System.out.println("It's a default call");
	}

	static void breakFast(String name){
		
		System.out.println("It's a single parameter method"+"\n"+ "name  "+name);
	}

	static void breakFast(int price){
		
		System.out.println("price  "+price+" Rs");
	}

	static void breakFast(String name , float price){
		
		System.out.println("It's a double parameter method"+"\n"+name + " is "+ price+" Rs");
	}

	static void breakFast(float price , String name ){
		
		System.out.println(price+" Rs"+ "  for  " + name);
	}

		
	static void breakFast(String name , float price , String isItTasty){
		
		System.out.println(name +" is   " + price+" Rs " +"  but  " + isItTasty);
	}
	
	
	static float breakFast(String name , float price , int quantity ){
		
		
		float total = price*quantity;
		System.out.println("It's a double parameter method"+"\n"+name + " is "+ price+" Rs" + "  with members of "+ quantity +"  amount of ");
		return total;
		
		
	}
	
	static float breakFast(String name , float price , int quantity , int noOfPeople ){
		
		
		float total = price*quantity;
		float avg = total/noOfPeople;
		System.out.println(name + " is "+ price+" Rs" + "  with members of "+ quantity + " per person of " );
		return avg;
		
		
	}




	public static void main(String []mo){
	
		breakFast();
		System.out.println(" ");
		breakFast("Idly");
		System.out.println(" ");
		breakFast(24.99);
		System.out.println(" ");
		System.out.println(" ");
		breakFast("Idly" , 24.99f);
		System.out.println(" ");
		breakFast( 30 , "Idly" );
		System.out.println(" ");
		breakFast("Idly", 24.99f , "Not so good");
		System.out.println(" ");
		float sum = breakFast("Idly" , 24.99f , 10);
		System.out.println(sum +" Rs");
		System.out.println(" ");
		float perHead = breakFast("Idly" , 24.99f , 10 , 12);
		System.out.println(perHead + " Rs");
		
	}
}