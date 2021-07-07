public class Dancer extends Character {
	public void dance(){
		System.out.println(this.name + " dancing");
	}

	public void attack(Matango m){
		System.out.println(this.name + " attack !");
		System.out.println("damage to enemy !");
		m.setHp(m.getHp() - 3);
	}

}
