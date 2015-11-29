
public class BbroncoUGStudent extends Student {

	int testScoreAverage;
	int age;

	public BbroncoUGStudent(String studentName, int age) {
		super(studentName);
		this.age = age;

	}

	String computeCourseGrade(BbroncoUGStudent bbroncoUGStudent) {
		for (int i = 0; i < bbroncoUGStudent.test.length; i++) {
			bbroncoUGStudent.testScoreAverage += test[i];
		}
		bbroncoUGStudent.testScoreAverage /= bbroncoUGStudent.test.length;
		if (bbroncoUGStudent.testScoreAverage >= 70)
			bbroncoUGStudent.CourseGrade = "PASS";
		else
			bbroncoUGStudent.CourseGrade = "FAIL";
		return bbroncoUGStudent.CourseGrade;

	}

	void display( ) {
		computeCourseGrade(this);
		System.out.println(this.name + "is " + this.age
				+ " years old and he is a Under Graduate Student \n" +

		"Average Score for " + this.name + "’s exams is " + this.testScoreAverage+ "\n"+

		"His Course Grade is " + computeCourseGrade(this));
	}
}
