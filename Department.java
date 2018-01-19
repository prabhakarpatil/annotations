package annotation;

import lombok.Data;

@Data
public class Department {
	
	int deptNo;
	String deptName, location;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Department dpt = new Department();
		dpt.setDeptNo(1); 
		dpt.setDeptName("Sales");
		dpt.setLocation("Dallas");
		
		System.out.println(dpt);
	}

}
