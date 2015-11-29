public class Student {
	public final static int NumOfTests = 2;
	protected String name;
	protected int test[];
	protected String CourseGrade;
	
	/**Default Constructor*/
	public Student(){
		this("No Name");
	}
	
	/**Parameterized Constructor*/
	public Student(String studentName){
		name = studentName;
		test = new int[NumOfTests];
		CourseGrade = "****";
	}
	
	/**Saves the test score in the array*/
	public void setTestScore(int testNumber, int testScore){
		test[testNumber-1] = testScore;
	}
}