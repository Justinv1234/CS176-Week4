public class StudentGrade {
	private String name;
	private int grade;
	final int DEFAULT_GRADE = 60;
	final int MAXIMUNGRADE = 100;
	final int MINMUMGRADE = 0;
	final int AGRADE = 90;
	final int BGRADE = 80;
	final int CGRADE = 70;
	
	public StudentGrade(String name) {
		this.name = name;
		this.grade = DEFAULT_GRADE;
	}
	
	public StudentGrade(String name, int grade){
		this.name = name;
		this.grade = grade;
	}
	
	public void setGrade(int grade) {
		if (grade > MINMUMGRADE && grade < MAXIMUNGRADE) {
			this.grade = grade;
		}
		else {
			this.grade = DEFAULT_GRADE;
		}
	}
	
	public int getGrade() {
		return grade;
	}
	
	public String getGradeLevel() {
		if (grade > AGRADE)
			return "A";
		else if (grade >= BGRADE)
			return "B";
		else if (grade >= CGRADE)
			return "C";
		return "D";
	}
}
