package databaseFiles;

// - this should include physical weapons, bow and crossbows, magic equipment
///* Weapon Class	Name	Atk-PHYS	Atk-Mag	Atk-Fire	
//Atk-Light	Atk-Crit	Def-Phys	Def-Mag	Def-Fire	Def-Light	
//Def-Crit	Bleed	Poison	Divine	Occult	Str-Req	Dex-Req	Int-Req	Faith-Req	
//Str-Scal	Dex-Scal	Int-Scal	Faith-Scal	Weight	Durability	Atk Type	Acquired From

public class physicalWeapon extends Equipment{
	
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
	Integer bleedBonus;
	Integer poisonBonus;
	Integer divineBonus;
	Integer occultBonus;
	
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
	Float weight;
	Float durability; 
	String attackType;
	String information;
	
	public physicalWeapon(String Class, String Name, Integer PhysicalAttack, Integer MagicAttack, Integer FireAttack, Integer LightningAttack,
			Integer CriticalAttackBonus, Integer PhysicalDefense, Integer MagicDefense, Integer FireDefense, Integer LightningDefense,
			Integer CriticalDefense,
			Integer BleedBonus, Integer PoisonBonus, Integer DivineBonus, Integer OccultBonus, Integer StrengthReq, Integer DexReq,
			Integer IntReq, Integer FaithReq, String StrengthScaling, String DexScaling, String IntScaling, String FaithScaling,
			Float Weight, Float Durability, String AttackType, String Information) {
		
		
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
			lightningDefense = FireDefense;
			criticalDefense = CriticalDefense;
			bleedBonus = BleedBonus;
			poisonBonus = PoisonBonus;
			divineBonus = DivineBonus;
			occultBonus = OccultBonus;
			strengthRequirement = StrengthReq;
			dexterityRequirement = DexReq;
			intelligenceRequirement = IntReq;
			faithRequirement = FaithReq;
			strengthScaling = StrengthScaling;
			dexterityScaling = DexScaling;
			intelligenceScaling = IntScaling;
			faithScaling = FaithScaling;
			weight = Weight;
			durability = Durability;
		    attackType = AttackType;
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
		fullPrintOut += "Bleed Bonus: " + bleedBonus + "\n";
		fullPrintOut += "Poison Bonus: " + poisonBonus + "\n";
		fullPrintOut += "Divine Bonus: " + divineBonus + "\n";
		fullPrintOut += "Occult Bonus: " + occultBonus + "\n";

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
		fullPrintOut += "Weight: " + weight + "\n";
		fullPrintOut += "Durability: " + durability + "\n";
		fullPrintOut += "Attack Type: " + attackType + "\n";
		fullPrintOut += "Information: " + information + "\n";
		
		return fullPrintOut;
	}
	

}
