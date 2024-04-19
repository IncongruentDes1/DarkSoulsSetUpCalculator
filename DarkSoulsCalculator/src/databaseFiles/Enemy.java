package databaseFiles;


// - Base class. Boss as a child

//Type:Name:Location:HP:HP (NG+):Souls:Souls NG+:Respawn
//Name:Location:Physical:Magic:Fire:Lightning:Poison:Toxic:Bleed:Divine:Occult:HP:NG HP:Soul Drop:NG Soul Drop

public class Enemy {
	String type;
	String name;
	String location;
	Float hp;
	Float hpNG;
	Float souls;
	Float soulsNG;
	
	public Enemy() {};
	
	public Enemy(String Type, String Name, String Location, Float HP, Float HPNG, Float Souls, Float SoulsNG) {
		type = Type;
		name = Name;
		location = Location;
		hp = HP;
		hpNG = HPNG;
		souls = Souls;
		soulsNG = SoulsNG;
	}
	@Override
	public String toString() {
		String fullPrintOut = "";
		
		fullPrintOut += "Type: " + type + "\n";
		fullPrintOut += "Name: " + name+ "\n";
		
		
		fullPrintOut += "Location: " + location+ "\n";
		fullPrintOut += "HP: " + hp+ "\n";
		fullPrintOut += "New Game Plus HP: " + hpNG+ "\n";
		fullPrintOut += "Souls: " + souls+ "\n";
		fullPrintOut += "New Game Plus Souls: " + soulsNG+ "\n";
		
		
		return fullPrintOut;
	}
	
	
}
