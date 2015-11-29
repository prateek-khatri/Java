
public class BbroncoGradStudent extends Student {

	int testScoreAverage;
	int age;

	public BbroncoGradStudent(String studentName, int age) {
		super(studentName);
		this.age = age;

	}

	String computeCourseGrade(BbroncoGradStudent BbroncoGradStudent) {
		for (int i = 0; i < BbroncoGradStudent.test.length; i++) {
			BbroncoGradStudent.testScoreAverage += test[i];
		}
		BbroncoGradStudent.testScoreAverage /= BbroncoGradStudent.test.length;
		if (BbroncoGradStudent.testScoreAverage >= 80)
			BbroncoGradStudent.CourseGrade = "PASS";
		else
			BbroncoGradStudent.CourseGrade = "FAIL";
		return BbroncoGradStudent.CourseGrade;

	}

	void display( ) {
		computeCourseGrade(this);
		System.out.println(this.name + "is " + this.age
				+ " years old and he is a Graduate Student \n" +

		"Average Score for " + this.name + "’s exams is " + this.testScoreAverage+ "\n"+

		"His Course Grade is " + computeCourseGrade(this));
	}
}
