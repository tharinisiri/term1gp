class Product{
private int weight;
private String name;

Student(int wt,String name)
{
this.wt=wt;
this.name=name;
}
public void print(){
System.out.println("wt:"+id);
System.out.println("name:"+name);
}
}
public class Demo1{
public static void main(String args[])
{
Product stud1=new Product(1,"pen");
stud1.print();
 Product stud2=new Product(2,"pencil");
stud2.print();
}
}
