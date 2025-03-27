public class PracticeProblem {
//	1. Create a function called _calculate_ which takes in 2 integers and a character as parameters. 
//Return the result of the two integers being operated on by the given operator.  Use a switch.  The following operators need to be accepted:
//   - \+ addtion 
//   - \- subtraction 
//   - \* multiplication 
//   - / floor division 
//   - % remainder 
//   - ^ exponent 
static final int MAXIMUM = 10;
public static int calculate(int num1, int num2, char operation) {
	switch (operation) {
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		case '%':
			return num1 % num2;
		case '^':
			return (int) Math.pow(num1, num2);
	}
	return -1;
}

//  2. Create a function called _totalWordsChecker_ that takes in a string as a parameter and returns true if the if the string has less than or as many words than the maximum, 
//false otherwise.  Use a constant called MAXIMUM that has a value of 10 for your function.

public static boolean totalWordsChecker(String words) {
	words = words.replaceAll("'","a");
	String[] words2 = words.split("\\W+");
	// fortnite skibbidi on god i am steve FLINT AND STEEL
	// YIPPIE
	return words2.length <= MAXIMUM;
}

//  3. Create a function called _minStrings_ which takes in 3 Strings as parameters.  Output the String that comes in the earliest alphabetically (casing does not matter)
public static String minString(String str1, String str2, String str3) {
	String min = str1;
        if (str2.compareToIgnoreCase(min) < 0) {
            min = str2;
        }
        if (str3.compareToIgnoreCase(min) < 0) {
            min = str3;
        }
        return min;
}
}
