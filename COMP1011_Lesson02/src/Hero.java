
public class Hero {
	// PRIVATE PROPERTIES ============================================================
	private int strength;
	private int speed;
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
		generateAbilities();
	}
	
	// PRIVATE METHODS ========================================================================
	private void generateAbilities() {
		
	}
	
	
	public void fight() {
		
	}
	 
	public void run() {
		
	}

} 
