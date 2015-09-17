package MainPackage;


public class MyInteger {
	
	//only property is a private integer
	private int value;
	
	
	
	public MyInteger(int val){
		//takes the initial value as the only arguement
		value = val;
	
	}
	
	public boolean isEven(){
		//returns true if the instance's value is even
		if (this.value % 2 == 1)
			return false;
		else
			return true;
		
	}
	
	public boolean isOdd(){
		//returns true if the instance's value is odd
		if (this.value % 2 == 1)
			return true;
		else
			return false;
		
	}
	
	public boolean isPrime(){
		//returns true if the instance's value is a prime number
		int b = this.value;
		int a = b-1;
		
		while (a > 1){
			if (b % a == 0)
				return false;
			a--;
						
		}
		
		return true;
		
		
	}
	public static boolean isEven(int a)
	{
		//returns true if the given integer's value is even
		if(a % 2 == 1)
			return false;
		
		else 
			return true;
				
		
	}
	
	public static boolean isOdd(int a)
	{
		//returns true if the given integer's value is odd
		if(a % 2 == 0)
			return false;
		
		else 
			return true;
				
		
	}
	
	
	public static boolean isPrime(int c){
		//returns true if the given integer's value is a prime number
		int b = c;
		int a = b-1;
		
		while (a > 1){
			if (b % a == 0)
				return false;
			a--;
						
		}
		
		return true;
		
		
	}
	
	public static boolean isEven(MyInteger num){
		//static isEven
		if (num.value % 2 == 1)
			return false;
		else
			return true;
		
	}
	
	public static boolean isOdd(MyInteger num){
		//static isOdd
		if (num.value % 2 == 1)
			return true;
		else
			return false;
		
	}
	
	public static boolean isPrime(MyInteger num){
		//static isPrime
		int b = num.value;
		int a = b-1;
		
		while (a > 1){
			if (b % a == 0)
				return false;
			a--;
						
		}
		
		return true;
		
		
	}
	
	public boolean equals(int a)
	{
		//checks if the given int has the same value as the instance's value
		if (this.value == a)
				return true;
		else
			return false;
	}
	
	public boolean equals(MyInteger a)
	{
		//checks if another instance has the same value as the the other instance's value
		if (this.value == a.value)
				return true;
		else
			return false;
	}
	
	public static int parseInt(char[] numlist){
		//static method which converts lists of numerical chars to a single large integer
		int size = numlist.length;
		int parseval = 0;
		for(int i = 0; i < size; i++){
			for(int q = 0; q < 10; q++)
				if(numlist[i] == (char)q)
					parseval = parseval + (int)numlist[i];
				
		}
		
		return (int)parseval;
		
	}
	
	public static int parseInt(String numlist){
		//static method which converts a number string to an integer
		int size = numlist.length();
		int parseval = 0;
		for(int i = size; i>=0; i--){
			for(int q = 0; q < 10; q++)
				if(numlist.charAt(i) == (char)q)				
					parseval = parseval + (int)numlist.charAt(i);
				
		}
		
		return (int)parseval;
		
	}
	
	
	
	
}



