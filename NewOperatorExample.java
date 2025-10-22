class Employee
{
int id=1;
String name="Ashwini.K";
double salary=50000.0;
public void work()
{
System.out.println("Working..");
}
}
public class NewOperatorExample
{
public static void main(String[] args)
{
Employee obj=new Employee();
System.out.println(obj);
System.out.println(obj.id);
System.out.println(obj.name);
System.out.println(obj.salary);
obj.work();
}
}