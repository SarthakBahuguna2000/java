package com.practice;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
public class StreamEmployee {
public static void main(String[] args)
{
	Employee emp1=new Employee(101,"kabir",30000);
	Employee emp2=new Employee(102,"Ajay",500000);
	Employee emp3=new Employee(103,"Rohit",60000);
	Employee emp4=new Employee(104,"Manish",200000);
	Employee emp5=new Employee(105,"Jyoti",38000);
	List<Employee> listEmployee=new ArrayList<Employee>();
	listEmployee.add(emp1);
	listEmployee.add(emp2);
	listEmployee.add(emp3);
	listEmployee.add(emp4);
	listEmployee.add(emp5);
	List<Employee> list=listEmployee.stream().sorted().collect(Collectors.toList());
	listEmployee.stream().filter(emp->emp.getSalary() > 70000).forEach(System.out::println);
	Double lowestSalary = listEmployee.stream()
			.min(Comparator.comparing(Employee::getSalary))
			.map(Employee::getSalary).get();

			List<Employee> employeesWithLowestSalary = listEmployee.stream()
			.filter(e -> e.getSalary() == lowestSalary)
			.collect(Collectors.toList());
	System.out.println(list);
	
}
}
