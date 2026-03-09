package universityGrading;

public class TUStudent extends Student{
	
	private int B1,B2,B3,B4;
	
	public TUStudent(){
		
	}
	
	public TUStudent(String name, String university, int b1, int b2, int b3, int b4){
		B1 = b1;
		B2 = b2;
		B3 = b3;
		B4 = b4;
		super.name = name;
		super.university = university;
		
	}

	@Override
	public double AverageMark() {
		return (B1 + B2 + B3 + B4)/4.0;
	}

	@Override
	public void CalculateGrade() {
		int[]arr = {B1,B2,B3,B4};
		for(int i = 0 ; i<arr.length; i++){
			String grade = "";
			if (arr[i] >= 81 && arr[i] <= 100)
				grade = "A";
			else if (arr[i] >= 66 && arr[i] <= 80)
				grade = "B";
			else if (arr[i] >= 50 && arr[i] <= 65)
				grade = "C";
			else if (arr[i] >= 40 && arr[i] <= 49)
				grade = "D";
			else if (arr[i] >= 0 && arr[i] <= 39)
				grade = "F";
			
			
			System.out.println("B" + (i + 1) + ":" + grade);
		} 
		System.out.println("");
		
	}

}
