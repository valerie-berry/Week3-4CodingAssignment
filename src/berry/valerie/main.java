package berry.valerie;

public class main {
	
	// 7
	public static String wordRepeater(String word, int n) {
		
		String repeatedWord = "";
		
		for (int c = 0; c < n; c++) {
			repeatedWord += word;
		}
		
		return repeatedWord;
	}
	
	// 8 
	public static String fullNamifier(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// 9
	public static boolean isGT100(int[] arr) {
		int rt = 0;
		
		for(int b : arr) {
			rt += b;
		}
		return rt > 100;
	}

	// 10
	public static double avgOfDoubles(double[] doublesArr) {
		double rt = 0;
		
		for (double x : doublesArr) {
			rt += x;
		}
				return rt / doublesArr.length;
	}
	
	// 11
	public static boolean isFirstAvgHigher(double[] arr1, double[] arr2) {
		double rt1 = 0;
		double rt2 = 0;
		
		for (double y : arr1) {
			rt1 += y;
		}
		
		for (double z : arr2) {
			rt2 += z;
		}
		return (rt1 / arr1.length) > (rt2 / arr2.length);		
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && (moneyInPocket > 10.5);
	}
	
	// 13
	// This method will calculate my average nightly sleep over a given timeframe given a double
	// array of hours slept over those days.
	// I wrote this to quickly determine if I'm getting a healthy amount of sleep over the past week.
	public static double avgSleep(double[] sleepData) {
		double totalSleep = 0.0;
		for (double hrs : sleepData) {
			totalSleep += hrs;
		}
		return (totalSleep / sleepData.length);
	}
	public static void main(String[] args) {
		
		// 1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		int[] ages2 = new int[ages.length + 1];
		
		for (int i = 0; i < ages.length; i++) {
			ages2[i] = ages[i];
		}

		ages2[ages2.length - 1] = 24;
		
		int rt = 0;
		
		for (int age : ages2) {
			rt += age;
		}
		
		System.out.println(rt / ages2.length);
		
		// 2
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		int total = 0;
		
		for (String name : names) {
			total += name.length();
		}	
		
		System.out.println(total / names.length);
		
		// 3 To get the last item of an array, you would get its length and access the index that is one less than that length.
		// For example, myArray[myArray.length - 1]
		
		
		// 4 To get the first item of an array, you access the 0th index.
		// For example, myArray[0]
		
		
		// 5
		int[] nameLengths = new int[names.length];
		
		for (int a = 0; a < nameLengths.length; a++) {
			nameLengths[a] = names[a].length();	
		}
		
		// 6
		rt = 0;
		
		for (int length : nameLengths) {
			rt += length;
		}
		
		System.out.println(rt);

		// 7 
		System.out.println(wordRepeater("Hello", 10));
		
		// 8
		System.out.println(fullNamifier("Valerie", "Berry"));
		
		// 9
		System.out.println("Is the sum of above array greater than 100?: " + isGT100(ages));
		
		// 10
		double[] myDoubleArray = {3.5, 4.5, 5.5};
		System.out.println("The average of all doubles in myDoubleArray is: " + avgOfDoubles(myDoubleArray));
		
		// 11
		double[] mySecondDoubleArray = {10.5, 11.5, 12.5};
		System.out.println("Is myDoubleArray avg greater than mySecondDoubleArray avg?: " + isFirstAvgHigher(myDoubleArray, mySecondDoubleArray));
		
		// 12
		System.out.println("It's hot outside and I have $12. Will I buy a drink?: " + willBuyDrink(true, 12.0));
		
		// 13
		double[] sleepData = {8.0, 10.5, 6.0, 7.5, 9.0, 5.5, 7.5}; 
		double avgSleepHrs = avgSleep(sleepData);
		String roundedSleep = String.format("%.2f", avgSleepHrs);
		System.out.println("What was the averge time I slept this week?: " + roundedSleep);
	}


	
}
	