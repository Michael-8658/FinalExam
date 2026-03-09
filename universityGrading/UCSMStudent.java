package universityGrading;

public class UCSMStudent extends Student {
	private int A1,A2,A3;
	
	public UCSMStudent(){
		
	}
	
	public UCSMStudent(String name, String university, int a1, int a2, int a3){
		A1 = a1;
		A2 = a2;
		A3 = a3;
		super.name = name;
		super.university = university;
	}

	@Override
	public double AverageMark() {
		return (A1 + A2 + A3)/3.0;
	}

	@Override
	public void CalculateGrade() {
		int[]arr = {A1,A2,A3};
		for(int i = 0 ; i<arr.length; i++){
			String grade = "";
			if (arr[i] >= 80 && arr[i] <= 100)
				grade = "A";
			else if (arr[i] >= 70 && arr[i] <= 79)
				grade = "B";
			else if (arr[i] >= 60 && arr[i] <= 69)
				grade = "C";
			else if (arr[i] >= 50 && arr[i] <= 59)
				grade = "D";
			else if (arr[i] >= 40 && arr[i] <= 49)
				grade = "E";
			else if (arr[i] >= 0 && arr[i] <= 39)
				grade = "F";
			
			System.out.println("A" + (i + 1) + ":" + grade);
		} 
		System.out.println("");
	}




}
