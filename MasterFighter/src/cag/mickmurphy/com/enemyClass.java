package cag.mickmurphy.com;

public class enemyClass {

	private int health = 100;
	private int strenght = 0;
	private int defence = 0;
	private int agility = 0;
	
	private String arenaType = "";
	

	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}

	public int getStrenght() {
		return strenght;
	}
	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

	public int getDefence() {
		return defence;
	}
	public void setDefence(int defence) {
		this.defence = defence;
	}

	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}

	public String getArenaType() {
		return arenaType;
	}
	public void setArenaType(String arenaType) {
		this.arenaType = arenaType;
	}

}
