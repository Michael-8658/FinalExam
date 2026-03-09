package universityGrading;

public class Main {

	public static void main(String[] args) {
		Student s1 = new UCSMStudent("Mg Kyaw","UCSM",70,68,77);
		Student s2 = new TUStudent("Ma Mya","TUM",80,70,80,60);
		
		
		System.out.println(s1.getName()+"\n"+s1.getUniversity()+"\nAverageMarks: "+s1.AverageMark()+"\nGrade: " );s1.CalculateGrade();
		System.out.println(s2.getName()+"\n"+s2.getUniversity()+"\nAverageMarks: "+s2.AverageMark()+"\nGrade: " );s2.CalculateGrade();

	}

}
