public class Matango{
	private int hp = 50;
	public int getHp(){
		return this.hp;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

}
