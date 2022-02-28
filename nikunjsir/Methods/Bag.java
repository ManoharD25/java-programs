class Bag{
	
		
		public static void main(String [] args){
		
		collegeBag(" HP ");
		collegeBag(" HP ", 10);
		collegeBag();
		float result = getMrp();
		System.out.println(result);
		}
		
		
		
		  // METHOD WITHOUT USING PARAMETERS //
		  
		  
		static void collegeBag(){
			
			System.out.println("Easy to carry");

			System.out.println("portable");
			System.out.println("Can carry books");
			System.out.println("can keep Bottel");
			System.out.println("laptop ");
			
		
		}
		
		// METHOD USING  RETURN TYPE //
		
		
		
		static float getMrp(){
			
			float p=1299.5f;
			return p;
		}
		
		// METHOD USING single PARAMETERS //
		
		static void collegeBag(String brand){
			
			System.out.println(brand+ "bag has "+" Good in quality");

			System.out.println("Long life cycle");
			System.out.println("light in weight");
			
		
		}


		static void collegeBag(int price){
			
			System.out.println(price+ "is price of bag");

			System.out.println("Long life cycle");
			System.out.println("light in weight");
			
		
		}

		// METHOD USING diff type PARAMETERS //
		
		static void collegeBag(String brand,int in){
			
			System.out.println(brand+ "bag has "+" Good in quality");

			System.out.println("Long life cycle");
			System.out.println(in + "KG in weight");
			
		
		}
		
		

}