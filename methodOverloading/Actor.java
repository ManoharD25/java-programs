package MethodOverloading;

public class Actor {
	     
	 	static void Movies(String intro) {
	 		
	 		System.out.println("Actor name :  " + "Kichha Sudeep");
	 	}

	 	static void Movies(String name, int date ) {
	 		
	 		String movie = "Vikrant Rona";
	 		int releasing = 2022;
	 		System.out.println("Latest movie:  " + movie );
	 		System.out.println("Releasing  in :  " + releasing);
	 	}
	 	
	 	static void Movies(String name, String place, int NoOfMovies ) {
	 		String actor = "Kichha Sudeep";
	 		String birtPlace = "Bengaluru";
	 		int movieNors = 45;
	 		System.out.println("Actor Name : " + actor);
	 		System.out.println("Staying in : " +  birtPlace);
	 		System.out.println("Number of Movies : " + movieNors);
	 	}
	 	
	 	static void Movies(String actor, int activeYears, String lastMovie) {
	 		
	 		String released = "Kotigobba 3";
	 		int releasedYear = 2022;
	 		String latest = "Vikrant Rona";
	 		System.out.println("Released movie:  " + released);
	 		System.out.println("Released in:  " + releasedYear);
	 		System.out.println("Latest movie:  " + latest);
	 	}
	 	  
	 	static void Movies(String kannada, String telagu, String hindi, String malayalam, String tamil ) {
	 		
	 		String sandalwood= "Vikrant Rona";
	 		String tollywood= "Saira NarasihmaReddy";
	 		String bollywood= "Dabaang 3";
	 		String mollywood = "Not yet acted";
	 		String kollywood= "Puli";
	 		System.out.println("kannada fan india movie  :  " + sandalwood);
	 		System.out.println("Telagu fan india movie :  " + tollywood );
	 		System.out.println("Hindi fan india movie :  " + bollywood);
	 		System.out.println("Malayalam fan india movie :  " +  mollywood);
	 		System.out.println("Tamil fan india movie :  " + kollywood);
	 	}
}
