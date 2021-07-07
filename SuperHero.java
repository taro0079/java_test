public class SuperHero extends Hero {
	private boolean flying;

	public SuperHero() {
		System.out.println("I'm a super hero !");
	}

	public void fly() {
		this.flying = true;
		System.out.println("flying !");
	}

	public void land() {
		this.flying = false;
		System.out.println("landing !");
	}

	public void run() {
		System.out.println("run run run!");
	}

	public void attack(Matango m) {
		super.attack(m);
		if (this.flying) {
			super.attack(m);
		}
	}
}
