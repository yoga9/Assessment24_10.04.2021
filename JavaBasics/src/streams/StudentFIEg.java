package streams;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import streams.Student.Grades1;

class Student{
	
	int Id;
	String name;
	int marks;
	Grades1 grades;
	
	
	enum Grades1{
		Destintion, FirstClass, SecondClass,ThirdClass,Fail; 
	}

	public Student(int id, String name, int marks,Grades1 grades) {
		super();
		Id = id;
		this.name = name;
		this.marks = marks;
	}
}
public class StudentFIEg {
	//@SuppressWarnings("static-access")
	public static void main(String[] args) {
	 
		ArrayList<Student> obj = new ArrayList<Student>();
		
		obj.add(new Student(201, "saran", 80,Student.Grades1.FirstClass));
		obj.add(new Student(204, "Moni", 95,Student.Grades1.Destintion));
		obj.add(new Student(205, "Yalz", 75,Student.Grades1.FirstClass));
		obj.add(new Student(206, "kani", 60,Student.Grades1.SecondClass));
		obj.add(new Student(209, "Parven", 55,Student.Grades1.SecondClass));
		obj.add(new Student(205, "Hema", 50,Student.Grades1.SecondClass));
		obj.add(new Student(208, "Zara", 40,Student.Grades1.ThirdClass));
		obj.add(new Student(202, "Ashma", 35,Student.Grades1.ThirdClass));
		obj.add(new Student(206, "Nila", 30,Student.Grades1.Fail));
		obj.add(new Student(207, "Francy", 15,Student.Grades1.Fail));
		
		Predicate<Student> p = (marksStu) -> {
			if(marksStu.marks >80) {
				//System.out.println("The Student Name : "+marksStu.name+ " "+"Marks : "+marksStu.marks);
				return true;
			}
			else
			{
				return false;
			}
			
		};
		
		for(Student marksStu : obj) {
			if(p.test(marksStu)) {
				System.out.println("Student Name : "+marksStu.name+ " "+"Marks : "+marksStu.marks+" "+"Student Grade :"+marksStu.grades.Destintion);
			}
			
		}
		
		
        BiFunction<Integer,Integer,Boolean> obj1 = (a,b) -> {
        	
        	if(a>80 && b<=100) {
        		return true;
        	}
        	else if(a>70 && b<=80) {
        		return true;
        	}
        		else if (a>60 && b<=50) {
        			return true;
        	}
        		else if (a>=35 && b<50) {
        			return true;
        		}
        		else
        			return false;
        			
        };
        			
    
     	 
        for(Student s: obj)
    		{
        		if(obj1.apply(80,95))
        		{
        			    System.out.println("The Marks and Grade of the Student is " +s.marks+ " "+s.grades.Destintion);
    					return;
        		}
        			
    		 
        		
    		
    }
	
		
	}
}
