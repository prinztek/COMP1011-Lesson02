
public class Project {

	public static void main(String[] args) {
		
		// Instantiate Hero
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		
		// Instantiate Villain
		Villain villain = new Villain("Sly Man");
		villain.run();
		villain.steals();
		villain.showAbilities();
	}

}
