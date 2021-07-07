public abstract class Character {
	String name;
	int hp;

	public void run(){
		System.out.println(this.name + " run away !");
	}

	public abstract void attack(Matango m);
}
