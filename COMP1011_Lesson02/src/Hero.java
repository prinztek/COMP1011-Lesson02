
public class Hero extends Entity {
	// PRIVATE PROPERTIES ============================================================
	protected int strength;
	protected int speed;
	private int health;
	
	// PUBLIC PROPERTIES =============================================================
	public String name;
	
	// GETTERS ========================================================================
	public int getStrength() {
		return strength;
	}

	public int getSpeed() {
		return speed;
	}
	
	public int getHealth() {
		return health;
	}
	
	// CONSTRUCTOR ========================================================================
	public Hero(String name) {
		this.name = name;
		this.generateAbilities();
	}
	
	// PUBLIC METHODS ======================================================================
	public void showAbilities() {
		System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
		System.out.println("+++++++++++++++++++++++++++++");
	}
	
	// PRIVATE METHODS ====================================================================
	private void generateAbilities() {
		this.strength = (int)(Math.random() * 100 + 1);
		this.speed = (int)(Math.random() * 100 + 1);
		this.health = (int)(Math.random() * 100 + 1);
	}
	
	
	public void fight() {
		System.out.println("The " + this.name + " is Fighting");
	}
	 
	public void run() {
		System.out.println("The " + this.name + " is Running");
	}

} 
