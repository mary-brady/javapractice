public Class EdabitChallenges {
    public static int convert(int minutes) {
		int hours = (minutes*60);
		return hours;
    }

    public static boolean lessThanOrEqualToZero(int num) {
        boolean lessThanZero = false;
        if(num <= 0) {
            lessThanZero = true;
        } else {
            lessThanZero = false;
        }
        return lessThanZero;
    }

    public static int addition(int num) {
		int nextNum = num + 1;
		return nextNum;
    }    
    
    public static int howManySeconds(int hours) {
		int seconds = hours * 60 * 60;
		return seconds;	
    }

    public static boolean divisibleByFive(int num) {
		boolean divByFive = false;
		if(num % 5 == 0) {
			divByFive = true;
		} else {
			divByFive = false;
		}
		return divByFive;
    }
    
    public static int sum(int a, int b) {
        int sum = (a + b);
              return sum;
      }

    public static int animals(int chickens, int cows, int pigs) {
		int legs = ((chickens * 2) + ((cows + pigs) * 4);
		return legs;
    }
    
    public static boolean reverse(boolean b) {
		return(!b);
    }
    
    public static int convert(int hours, int minutes) {
		int seconds = (((hours*60) * 60) + (minutes * 60));
		return seconds;
    }

    public static boolean divisible(int num) {
		boolean div = true;
		if(num % 100 == 0) {
			div = true;
		} else {
			div = false;
		}
		return div;
    }
    
    public static boolean equalSlices(int total, int people, int each) {
		boolean pieForEveryone = true;
		if (people == 0) {
			pieForEveryone = true;
		}
		if(people * each > total) {
			pieForEveryone = false;
		} else {
			pieForEveryone = true;
		}
		return pieForEveryone;
    }
    
    public static int nextEdge(int side1, int side2) {
		int nextEdge = (side1 + side2 -1);
		return nextEdge;
    }

    public static boolean comp(String str1, String str2) {
		boolean sames;
		if(str1.length() == str2.length()) {
			sames = true;
		} else {
			sames = false;
		}
		return sames;
    }
    
    public static String helloName(String name) {
		return "Hello " + name + "!";
    }
    
    public static int length(String str) {
		return str.length();
    }
    
    public static boolean match(String str1, String str2) {
		return str1.equalsIgnoreCase(str2);
	}
}