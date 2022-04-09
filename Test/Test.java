1.How can you create  Constants in java?
ans: 


2.How many type of Datatypes r there in java?
ans: 2 
		primitive and non-primitive

3.Why is specifying datatype in java is manditory in java?
ans. Because in java every data is strictly define

4. What r some naming conversion for java variables ? 
ans : a. Can be alfhabet
	  b. can be number 
	  c. can be _ symbol
	  d. can be $ symbol
	  e. can't start with number
	 
	 
5. what is variable initialization? How it is diff than assignment?
	declaring variable  based on properties wrt datatype and initializing the value

6. what is an array?

	set of homogeneous data grouping in to one data.

7. can you pass the negative numbers in array length?
	no.
	
8. Where does array Stored in jvm?
	heaf.
	
9. what r the advantages of array?
	using single variable can store multiple number of data,
	n nuber of same type data can be stored.
	
10. what is anonymous array in java? give example?
	 array can used for only homogenious type data & array size is fixed in size
	Ex: int a[] = new Int[size]; ( only int type data can be stored)
	
11. WAP to print array values?

	public class ArraY{
		public static void main(String []aa){
			int a[] ={1,2,3,4,5};
			
			for(int i=0; i<a.length; i++){
				System.out.println(a[i]);
			}
		}
		
	}
	
12. Wap to sort an array in java ?

		// reversing 
	public  class ArraY{
		public static void main(String []aa){
			int a[] ={1,2,3,4,5};
			
			for(int i=a.length-1; i<a.length; i++){
				System.out.println(a[i]);
			}
		}
		
	}
13. Wap to check where two arrays are equal, same datatype and length?
		public class ArraY{
		public static void main(String []aa){
			int a[] ={1,2,3,4,5};
			int b[] = {1,2,3,4,5};
			
			for(int i=aa.length-1; a.length<=b.length; i++){
				if(a.length==b.length){
				System.out.println("Array a & b values are "+a[i]+"\t"+ b[i]);
				}
				
				else{
					System.out.println("Array size is not same");
				}
			}
		}
		
	}
	
14. WAP throw Array outofBounds exception ?
public class ArraY{
		public static void main(String []aa){
			int a[] ={1,2,3,4,5};
			
			for(int i=0; i<=a.length; i++){ // at index 5 gives exception
				System.out.println(a[i]);
			}
		}
		
	}
	
15. What will happen if u donot initialize array?
	throws error as array size is not declaired
	
16. find out smallest and largest number in an array ?
		
		public class ArraY{
		public static void main(String []aa){
			
			int m=0;
			int n=0;
			int a[] ={1,2,3,0,5};
			// de
			
		for(int i=0; i<a.length; i++){ // at index 5 gives exception
			
				for(int j=1; j<a.length; j++){
					if(a[i]<a[j]){
						m=a[i];
					}
				}
		}
			System.out.println("Smallest number is "+ m);
			
			
		for(int i=0; i<a.length; i++){ // at index 5 gives exception
			
				for(int j=1; j<a.length; j++){
					if(a[i]<a[j]){
						m=a[j];
					}
				}
		}
			System.out.println("Largest number is "+ m);
		}
		
	}
	
17. What is static keyword, static variable, static methods?

	A predefined keyword in java,  variable declaired with keyword static also called class level variable, method which is declaired with static keyword, static member load at the time of compilation
18. can we overload and override static methods?
	
	Yes, but exept main method which can be override but can be overload.	
	
19. Why main() is declaired static ?
		because static member are load at the time of compilation, if we dond provide static then jvm cannot find main() method while runtime/execution and throws error main() method cannod find.
	
20.What is static block ?
		A block which is declaired with static keyword.
		
21.can constructor be static in java?
	No, because constructor are used to initialize the instance variables, if static then instance variable cannot be access inside the constructor.
 		
22. Can interface have static method in it?
	Yes
	
23.	What is constructor chaining?
	calling the one constructor inside another constructor it could be from same class(this();) or from parent(super();) class .
24. what is constructor ?
	It is special type of methods which has no return type, but name must be same as Class name.
	
25. What happens if you keep return type to constructor?
	Then it becomes method.
	
26. can we call sub class constructor from super class constructor?
	Yes. upcasting concept.
	
27. how can you create a instance of child class with a parent type?
	object creation with  upcasting concept;
	
28. difference between instance and class?
	instance is nothing but object , whis have its data members and member functions.
	class is a blueprint of object, whatever object has class is also have the same members.
29. How many ways can instance  is created?
	2 ways 
		by using new keyword and one instance pointing to another instance/object.
	
30. what happens if you created a instance of class?

	It aqueris/create space in heaf memory.
	
	
	
	