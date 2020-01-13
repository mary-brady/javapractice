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
}