
public class BbroncoTestStudent {
public static void main(String[] args) {
	
	BbroncoGradStudent bbroncoGradStudent = new BbroncoGradStudent("Peter", 23);
	bbroncoGradStudent.setTestScore(1, 70);
	bbroncoGradStudent.setTestScore(2, 70);
	bbroncoGradStudent.display();
	
	BbroncoUGStudent bbroncoUGStudent = new BbroncoUGStudent("Helen", 19);
	bbroncoUGStudent.setTestScore(1, 80);
	bbroncoUGStudent.setTestScore(2, 80);
	bbroncoUGStudent.display();
	
	
}
}
