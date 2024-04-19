package databaseFiles;

public class Boss extends Enemy{

	//Name:Location:Physical:Magic:Fire:Lightning:Poison:Toxic:Bleed:Divine:Occult:HP:NG HP:Soul Drop:NG Soul Drop
	
	// Physical, Magic, Fire, Ligtning, Poison, Toxic, Bleed, Divine, Occult
	Float physicalDefense;
	Float magicDefense;
	Float fireDefense;
	Float lightningDefense;
	Float poisonDefense;
	String toxicDefense;
	String bleedDefense;
	String divineDefense;
	String occultDefense;
	
	public Boss(String Name, String Location, Float PhysicalDefense, Float MagicDefense, Float FireDefense, Float LightningDefense,
			Float PoisonDefense, String ToxicDefense, String BleedDefense, String DivineDefense, String OccultDefense, Float HP, Float HPNG,
			Float Souls, Float SoulsNG) {
		name = Name;
		type = "Boss";
		location = Location;
		physicalDefense = PhysicalDefense;
		magicDefense = MagicDefense;
		fireDefense = FireDefense;
		lightningDefense = LightningDefense;
		poisonDefense = PoisonDefense;
		toxicDefense = ToxicDefense;
		bleedDefense = BleedDefense;
		divineDefense = DivineDefense;
		occultDefense = OccultDefense;
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
		
	    fullPrintOut += "Physical Defense: " + physicalDefense + "\n";
	    fullPrintOut += "Magic Defense: " + magicDefense + "\n";
	    fullPrintOut += "Fire Defense: " + fireDefense + "\n";
	    fullPrintOut += "Lightning Defense: " + lightningDefense + "\n";
	    fullPrintOut += "Poison Defense: " + poisonDefense + "\n";
	    fullPrintOut += "Toxic Defense: " + toxicDefense + "\n";
	    fullPrintOut += "Bleed Defense: " + bleedDefense + "\n";
	    fullPrintOut += "Divine Defense: " + divineDefense + "\n";
	    fullPrintOut += "Occult Defense: " + occultDefense + "\n";
		
		
		return fullPrintOut;
	}
	
}
