package week05.homework;

public class App {

	public static void main(String[] args) {
		Logger astLog = new AsteriskLogger(); 
		Logger spcLog = new SpacedLogger();
		
		astLog.log("Cats");
		spcLog.log("Cats");
		
		astLog.error("Cats");
		spcLog.error("Cats");
		
		
	}
	
	
}
