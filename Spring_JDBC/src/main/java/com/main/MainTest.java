package com.main;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.demo.EmployeerowmMapper;
import com.bean.demo.SpringConfigfile;
import com.bean.demo.Student;

public class MainTest {

	public static void main(String[] args) {
		
		int id=1;
		String name="Sakshi";
		String marks="100";
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the id");
//		int id =sc.nextInt();
//		System.out.println("Enter the name");
//		String name=sc.next();
//		System.out.println("Enter the marks ");
//		int marks =sc.nextInt();
		// TODO Auto-generated method stub
ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigfile.class);
JdbcTemplate template=context.getBean("jdbc",JdbcTemplate.class);
String insertquery="insert into employee1 values(?,?,?)";
int result =template.update(insertquery,id,name,marks);


//String updatequery="update employee1 set marks=? where id=?";
//int result=template.update(updatequery,marks,id);

//String deletequery="delete from employee1 where id=?";
//int result=template.update(deletequery,id);

//String selectquery="select * from employee1";
//List <Student>std=   template.query(selectquery, new EmployeerowmMapper());
//for(Student s:std)
//{
//	System.out.println("Id is"+s.getId());
//	System.out.println("NAme is"+s.getName());
//	System.out.println("Marks is"+s.getMarks());
//	
//}

if(result>0)
{
	System.out.println("Data inserted sucessfully...............");
}
else {
	
	System.out.println("Data not inserted sucessfully.........");
}
	}

}
