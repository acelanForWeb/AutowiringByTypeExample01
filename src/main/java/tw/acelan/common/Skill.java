package tw.acelan.common;

public class Skill {
	// �ޯ�W��
	private String skillName;

	// �ޯ൥��
	private String skillLevel;

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getSkillLevel() {
		return skillLevel;
	}

	public void setSkillLevel(String skillLevel) {
		this.skillLevel = skillLevel;
	}

	@Override
	public String toString() {
		return "Skill [skillName=" + skillName + ", skillLevel=" + skillLevel+ "]";
	}
}
