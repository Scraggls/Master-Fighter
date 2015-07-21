/**
 * 
 */
package cag.mickmurphy.com;

import java.util.Scanner;

/**
 * @author Mick Murphy & Craig McGarry
 *
 */
public class TheFight {
		String fighterA = "";
		Fighters fight = new Fighters();
	public static void main(String[] args) {
		TheFight fi = new TheFight();
		fi.setFighterDetail();
		// TODO Start Fight
		//set Abilities 
		//set fighter names , Gear and styles
		//Set Area 
	}

	public void setFighterDetail(){
		
		System.out.println("Please Pick a Fighter Name");
		Scanner scan = new Scanner(System.in);
		fight.setFighterName(scan.nextLine());
		fighterA = fight.getFighterName();
		System.out.println(fighterA);
		
	}
}
