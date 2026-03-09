package universityGrading;

public abstract class Student {
	protected String name;
	protected String university;
	
	public abstract double AverageMark();
	public abstract void CalculateGrade();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUniversity() {
		return university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	
	
}
