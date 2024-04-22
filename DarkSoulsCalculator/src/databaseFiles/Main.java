package databaseFiles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("test");
		
		// - Reading in all Data from textfiles
		ArrayList<Equipment> curEquip = new ArrayList<Equipment>();
		ArrayList<Enemy> enemyList = new ArrayList<Enemy>();
		SaveFile test = new SaveFile("Leon", "no Covenant", 45,1,45,0,0,0,0,0);
		System.out.println(test.hp);
		

		
		
	}



}
