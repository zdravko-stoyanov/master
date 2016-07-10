
public class Student extends Person {
	private double score;
	

	public Student(String name, int age, boolean isMale, double score) {
		super(name, age, isMale);
		setScore(score);
	}
	
	protected void showStudentInfo(){
		showPersonInfo();
		System.out.println(", grade: " + getScore());
	}

	public double getScore() {
		return score;
	}


	public void setScore(double score) {
		if (score>=2 && score<=6){
		this.score = score;
		} else {
			if (score>6){
			this.score = 6;
			} else {
				if (score<2){
					this.score=2;
				}
			}
		}
	}


}
