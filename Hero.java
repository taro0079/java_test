public class Hero {
	String name = "おちんちん";
	private int hp = 100;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getHp() {
		return this.hp;
	}

	public void attack(Matango m) {
		System.out.println(this.name + "s attack !");
		m.setHp(m.getHp() - 5);
		System.out.println("5 points damage !");
	}

	public void run() {
		System.out.println(this.name + "runs away !");
	}
}
