package jmk_pjk_ch013_game;

public class Fire extends Character {
	
	public Fire() {
		hp = 20;
		energy = 90;
		System.out.println("파이리가 생성되었습니다.");
		printInfo();
	}
	
	@Override
	public void eat() {
		energy += 5;
	}

	@Override
	public void sleep() {
		energy += 20;
	}

	@Override
	public boolean play() {
		energy -= 30;
		hp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 20;
		hp += 30;
		levelUp();
		return checkEnergy();
	}
	
	@Override
	public void levelUp() {
		if (40 <= hp) {
			level++;
			hp -= 40;
		}
	}

}
