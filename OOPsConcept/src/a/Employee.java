package a;

public class Employee {
int id;
String name;
float salary;

//Employee(){
//	System.out.println("object created");
//	id=3;
//}

//parameter constructor
Employee(int id1, String name1, float salary1){
	System.out.println("object created");
	id=id1;
	name=name1;
	salary=salary1;
}



void setValue(int id1, String name1,float salary1)
{
	id=id1;
	name=name1;
	salary=salary1;
}
void display() {
	System.out.println("id is"+id);
	System.out.println("name is"+name);
	System.out.println("salary is"+salary);
}
}
