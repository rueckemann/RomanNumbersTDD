package de.rueckemann;

public class RomanNumber {

	public static int toDecimal(String string) {
	  int result = 0; 
	  char[] charArray = string.toCharArray();
	  for(int i=0; i<string.length(); i++) {
		int currentCharValue = getValue(charArray[i]);
		  // check if the next char is higher than the current one
		  if(string.length()>i+1) {
			  int nextCharValue = getValue(charArray[i+1]);
			  if(nextCharValue > currentCharValue) {
				  result-=currentCharValue;
			  } else {
				result+=currentCharValue;  
			  } 
		  } else {
			  result+=currentCharValue;
		  }
		  
	  }
	  return result;
	}

	private static int getValue(char s) {
		switch(s) {
		  case 'I' : return 1;
		  case 'V' : return 5;
		  case 'X' : return 10;
		  case 'L' : return 50;
		  case 'C' : return 100;
		  case 'D' : return 500;
		  case 'M' : return 1000;
		  default : return 0;
		}
	}
 }
