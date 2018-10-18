package tw.acelan.common;

public class Person {
	private Skill ability;

	public Skill getAbility() {
		return ability;
	}

	public void setAbility(Skill ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Person [ability=" + ability + "]";
	}

}
