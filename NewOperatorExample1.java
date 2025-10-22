class Employee
{
int id=1;
String name="Ashwini Kadakanchi";
double salary=50000.0;
public void work()
{
System.out.println("Working..");
}
}
public class NewOperatorExample1
{
public static void main(String[] args)
{
Employee obj1=new Employee();
Employee obj2=new Employee();
System.out.println(obj1);
System.out.println(obj2);
System.out.println(obj1.id+"-"+obj1.name+"-"+obj1.salary);
System.out.println(obj2.id+"-"+obj2.name+"-"+obj2.salary);
obj1.work();
obj2.work();
obj1.id=2;
obj1.name="Ashu";
obj1.salary=55000.0;
System.out.println(obj1.id+"-"+obj1.name+"-"+obj1.salary);
}
}


