package com.yusufjk;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

@Autowired
Emp emp;
void doTask(){
	
	System.out.println("doTask()......");
	emp.sleeping();
}
}
