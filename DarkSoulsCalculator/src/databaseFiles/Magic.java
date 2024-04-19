package databaseFiles;

public class Magic extends Equipment{
	//Type	:	Name	:	Uses	:	Slots	:	Int Req	:Faith Req	:Description	:	Aquired From	:	Cast Type 
	Integer uses;
	Integer slots;
	Integer intelligenceRequirement;
	Integer faithRequirement;
	String description;
	String castType;
	
	public Magic(String Name, String Type, Integer Uses, Integer Slots, Integer IntelligenceReq, Integer FaithReq, String Description, String CastType) {
		name = Name;
		type = Type;
		uses = Uses;
		slots = Slots;
		intelligenceRequirement = IntelligenceReq;
		faithRequirement = FaithReq;
		description = Description;
		castType = CastType;
		
	}

@Override
public String toString() {
	String fullPrintOut = "";
	
	fullPrintOut += "Class: " + type + "\n";
	fullPrintOut += "Name: " + name+ "\n";
	
	fullPrintOut += "Number of Uses: " + uses + "\n";
	fullPrintOut += "Needed Slots: " + slots + "\n";
	fullPrintOut += "Intelligence Requirement: " + intelligenceRequirement + "\n";
	fullPrintOut += "Faith Requirement: " + faithRequirement + "\n";
	fullPrintOut += "Description: " + description + "\n";
	fullPrintOut += "Cast Type: " + castType + "\n";
	
	
	return fullPrintOut;
}
}


