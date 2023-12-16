package week05.homework;

public class SpacedLogger implements Logger{

	@Override
	public void log(String string) {
		String output = addSpaces(string);
		System.out.println(output);
	}

	@Override
	public void error(String string) {
		String output = addSpaces(string);
		System.out.println("ERROR: " + output);

	}
	
	//inserts a space between each character in input string 
	private String addSpaces(String string) {
		StringBuilder output = new StringBuilder();
		//loop through char array and use string builder to append with spaces.
		for (char x : string.toCharArray()) {
			//add a space before adding the character
			 output.append(" ");
			 output.append(x);
		}
		//remove first space
		output.deleteCharAt(0);

		return output.toString();
	}
}
