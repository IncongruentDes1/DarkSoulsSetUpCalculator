package databaseFiles;

public class Ring extends Equipment{

	String effects;
	String location;
	
	public Ring(String Name, String Effects, String Location) {
		
		name = Name;
		type = "Ring";
		effects = Effects;
		location = Location;
	}
	
	@Override
	public String toString() {
		String fullPrintOut = "";
		
		fullPrintOut += "Class: " + type + "\n";
		fullPrintOut += "Name: " + name+ "\n";
		
		fullPrintOut += "Effects: " + effects + "\n";
		fullPrintOut += "Location: " + location + "\n";
		
		return fullPrintOut;
	}
}
