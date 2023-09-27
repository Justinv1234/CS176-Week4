public class StudentGradeTester {

	public static void main(String[] args) {
		// test constructors
		StudentGrade steph = new StudentGrade("Steph");
		StudentGrade hannah = new StudentGrade("hannah", 99);
		System.out.println(steph.getGrade()); // we expect 60
		System.out.println(hannah.getGrade()); // expect 99
		// test setGrade
		steph.setGrade(-100);
		System.out.println(steph.getGrade()); // we expect 60
		steph.setGrade(1000);
		System.out.println(steph.getGrade()); // we expect 60
		steph.setGrade(88);
		System.out.println(steph.getGrade()); // we expect 88
		//test retGradeLevel
		System.out.println(hannah.getGradeLevel()); // we expect to see “A”
		System.out.println(steph.getGradeLevel()); // see “B”
		steph.setGrade(77);
		System.out.println(steph.getGradeLevel()); // see “C”
		steph.setGrade(54);
		System.out.println(steph.getGradeLevel()); // see “D”

	}

}
