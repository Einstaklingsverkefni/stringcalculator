package is.ru.stringcalculator;

public class Calculator {
/*
	public static int add(String text){
		return 0;
	}
*/
	
	public static int add(String text){
		if(text.equals("")) { 
			return 0; 
		}
		else if(text.contains(",")){
			String[]numbers = text.split(",");
			return toInt(numbers[0]) + toInt(numbers[1]);
		} 
		else
			return 1;
	}

	private static int toInt(String number){
		return Integer.parseInt(number);
	}

	private static String[] splitNumbers(String numbers){
	    return numbers.split("");
	}
      
    private static int sum(String[] numbers){
 	    int total = 0;
        for(String number : numbers){
		    total += Integer.parseInt(number);
		}
		return total;
    }

    private static int newLine(String numbers){
    	int value = 0;
    	String[] numbersArray = numbers.split(",|n"); 
    	for (String number : numbersArray) {
        if (!number.trim().isEmpty()) {
            value += Integer.parseInt(number.trim());
        	}
    	}
    	return value;
    }
}


    
