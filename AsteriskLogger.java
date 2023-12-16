package week05.homework;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String string) {
		
		System.out.println("***" + string + "***");
	}

	
	
	@Override
	public void error(String string) {
		System.out.println("**********");
		System.out.println("*** Error: " + string + " ***");
		System.out.println("**********");
		
		
	}

}
