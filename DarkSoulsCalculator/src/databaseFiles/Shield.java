package databaseFiles;

public class Shield extends Equipment {
	// - Base Stats
	Integer physicalAttack;
	Integer magicAttack;
	Integer fireAttack;
	Integer lightningAttack;
	Integer criticalAttackBonus;
	Integer physicalDefense;
	Integer magicDefense;
	Integer fireDefense;
	Integer lightningDefense;
	Integer criticalDefense;

	
	// Requirements
	Integer strengthRequirement;
	Integer dexterityRequirement;
	Integer intelligenceRequirement;
	Integer faithRequirement;
	
	String strengthScaling;
	String dexterityScaling;
	String intelligenceScaling;
	String faithScaling;
	
	// Other stats
	Float durability;
	Float weight;
	String deflection;
	String parrySpeed;
	
	String information;
	
	public Shield(String Class, String Name, Integer PhysicalAttack, Integer MagicAttack, Integer FireAttack, Integer LightningAttack,
			Integer CriticalAttackBonus, Integer PhysicalDefense, Integer MagicDefense, Integer FireDefense, Integer LightningDefense,
			Integer CriticalDefense, Integer StrengthReq, Integer DexReq,
			Integer IntReq, Integer FaithReq, String StrengthScaling, String DexScaling, String IntScaling, String FaithScaling,
			Float Durability, Float Weight, String Deflection, String ParrySpeed, String Information) {
		
			name = Name;
			type = Class;
			physicalAttack = PhysicalAttack;
			magicAttack = MagicAttack;
			fireAttack = FireAttack;
			lightningAttack = LightningAttack;
			criticalAttackBonus = CriticalAttackBonus;
			physicalDefense = PhysicalDefense;
			magicDefense = MagicDefense;
			fireDefense = FireDefense;
			lightningDefense = LightningDefense;
			criticalDefense = CriticalDefense;
			strengthRequirement = StrengthReq;
			dexterityRequirement = DexReq;
			intelligenceRequirement = IntReq;
			faithRequirement = FaithReq;
			strengthScaling = StrengthScaling;
			dexterityScaling = DexScaling;
			intelligenceScaling = IntScaling;
			faithScaling = FaithScaling;
			durability = Durability;
			weight = Weight;
			deflection = Deflection;
			parrySpeed = ParrySpeed;
			information = Information;
	}
	
	@Override
	public String toString() {
		String fullPrintOut = "";
		
		fullPrintOut += "Class: " + type + "\n";
		fullPrintOut += "Name: " + name+ "\n";
		
		fullPrintOut += "Physical Attack: " + physicalAttack + "\n";
		fullPrintOut += "Magic Attack: " + magicAttack + "\n";
		fullPrintOut += "Fire Attack: " + fireAttack + "\n";
		fullPrintOut += "Lightning Attack: " + lightningAttack + "\n";
		fullPrintOut += "Critical Attack Bonus: " + criticalAttackBonus + "\n";
		fullPrintOut += "Physical Defense: " + physicalDefense + "\n";
		fullPrintOut += "Magic Defense: " + magicDefense + "\n";
		fullPrintOut += "Fire Defense: " + fireDefense + "\n";
		fullPrintOut += "Critical Defense: " + criticalDefense + "\n";

		// Requirements
		fullPrintOut += "Strength Requirement: " + strengthRequirement + "\n";
		fullPrintOut += "Dexterity Requirement: " + dexterityRequirement + "\n";
		fullPrintOut += "Intelligence Requirement: " + intelligenceRequirement + "\n";
		fullPrintOut += "Faith Requirement: " + faithRequirement + "\n";

		// Scaling
		fullPrintOut += "Strength Scaling: " + strengthScaling + "\n";
		fullPrintOut += "Dexterity Scaling: " + dexterityScaling + "\n";
		fullPrintOut += "Intelligence Scaling: " + intelligenceScaling + "\n";
		fullPrintOut += "Faith Scaling: " + faithScaling + "\n";

	
		// Other stats
		fullPrintOut += "Durability: " + durability + "\n";
		fullPrintOut += "Weight: " + weight + "\n";
		fullPrintOut += "Deflection: " + deflection + "\n";
		fullPrintOut += "Parry Speed: " + parrySpeed + "\n";
		fullPrintOut += "Information: " + information + "\n";
		
		return fullPrintOut;
	}
}
