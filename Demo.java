class Student{
private int id;
private String name;

Student(int id,String name)
{
this.id=id;
this.name=name;
}
public void print(){
System.out.println("id:"+id);
System.out.println("name:"+name);
}
}
public class Demo{
public static void main(String args[])
{
Student stud1=new Student(45,"mahi");
stud1.print();
Student stud2=new Student(60,"rajesh");
stud2.print();
}
}
