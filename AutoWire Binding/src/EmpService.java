
public class EmpService {
Emp emp1;
Emp emp2;
public void setEmp1(Emp emp1) {
	this.emp1 = emp1;
}
public void setEmp2(Emp emp2) {
	this.emp2 = emp2;
}

void test(){
	
	System.out.println(emp1.geteId());
	System.out.println(emp2.geteId());
}
}
