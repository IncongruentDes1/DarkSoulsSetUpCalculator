package databaseFiles;


// Reading in Armor
public class Armor extends Equipment {
	//Name	Durability	Weight	Def-PHYS	Def-Strike	Def-Slash	Def-Thrust	Def-Mag	Def-Fire	Def-Light	Poise	Def-Bleed	Def-Poison	Def-Curse
	Float durability;
	Float weight;
	Float physicalDefense;
	Float strikeDefense;
	Float slashDefense;
	Float thrustDefense;
	Float magicDefense;
	Float fireDefense;
	Float lightningDefense;
	Float poise;
	Float bleedDefense;
	Float poisonDefense;
	Float curseDefense;
	
	
	public Armor(String Name, Float Durability, Float Weight, Float PhysicalDefense, Float StrikeDefense, Float ThrustDefense, Float MagicDefense, Float FireDefense,
			Float LightningDefense, Float Poise, Float BleedDefense, Float PoisonDefense, Float CurseDefense) {
		
		name = Name;
		type = "Armor";
		durability = Durability;
        weight = Weight;
        physicalDefense = PhysicalDefense;
        strikeDefense = StrikeDefense;
        thrustDefense = ThrustDefense;
        magicDefense = MagicDefense;
        fireDefense = FireDefense;
        lightningDefense = LightningDefense;
        poise = Poise;
        bleedDefense = BleedDefense;
        poisonDefense = PoisonDefense;
        curseDefense = CurseDefense;
		
	}
	@Override
	public String toString() {
	    String fullPrintOut = "";

	    fullPrintOut += "Class: " + type + "\n";
	    fullPrintOut += "Name: " + name + "\n";

	    fullPrintOut += "Durability: " + durability + "\n";
	    fullPrintOut += "Weight: " + weight + "\n";
	    fullPrintOut += "Physical Defense: " + physicalDefense + "\n";
	    fullPrintOut += "Strike Defense: " + strikeDefense + "\n";
	    fullPrintOut += "Slash Defense: " + slashDefense + "\n";
	    fullPrintOut += "Thrust Defense: " + thrustDefense + "\n";
	    fullPrintOut += "Magic Defense: " + magicDefense + "\n";
	    fullPrintOut += "Fire Defense: " + fireDefense + "\n";
	    fullPrintOut += "Lightning Defense: " + lightningDefense + "\n";
	    fullPrintOut += "Poise: " + poise + "\n";
	    fullPrintOut += "Bleed Defense: " + bleedDefense + "\n";
	    fullPrintOut += "Poison Defense: " + poisonDefense + "\n";
	    fullPrintOut += "Curse Defense: " + curseDefense + "\n";


	    return fullPrintOut;
	}
}
