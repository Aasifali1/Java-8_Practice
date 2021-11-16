package learn.java.projects.HCM_System;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
    String name, email, mobile;
    int id,departmentAssignedTo;
    Employee(int id, String name, String email, String mobile,int departmentAssignedTo)
    {
        this.name = name ;
        this.email=email;
        this.id = id;
        this.mobile = mobile;
        this.departmentAssignedTo = departmentAssignedTo;
    }
    public String getName()
    {
        return this.name;
    }
    public int getDepartment(){
        return this.departmentAssignedTo;
    }

}
class Department {
    int depId;
    String name;
//    ArrayList<Employee> employees;
    Employee emp;
    ArrayList<Employee> employees = new ArrayList<Employee>();

    Department(int depId,String name)
    {
        this.name = name;
//        this.employees = employees;
        this.depId= depId;
    }
    public void assignEmployee(Employee emp)
    {
        employees.add(emp);
        emp.departmentAssignedTo = this.depId;
    }
    public ArrayList<Employee> getEmployees()
    {
       return this.employees;
    }
}
//class DepartmentFinder{
//    Department dep3=new Department(3, "React Studio");
//    Department dep4=new Department(4, "PHP Studio");
//    public static Department find(int depId){
//        if()
//    }
//
//}
class Main{
    public static void print(ArrayList employees){
        Iterator itr= employees.iterator();
        while (itr.hasNext()){
            Employee e=((Employee) itr.next());
            System.out.println("Name: "+e.name+"\nDep ID: "+e.departmentAssignedTo+"\nemail: "+e.email+"\n====================");
        }
    }
    public static void main(String[] args) {
//        ArrayList<Employee> employees=new ArrayList<Employee>();

        Employee emp =new Employee(1, "Aasif","aasif@gmail.com","8394057878",1);
        Employee emp2 =new Employee(2, "Sadik","sadik@gmail.com","8394057878",2);
        Employee emp3 =new Employee(3, "Azeem","azeem@gmail.com","8394057878",3);

        Department dep2=new Department(2, "DevOps Studio");
        dep2.assignEmployee(emp2);

        Department dep=new Department(1, "Java Studio");
        dep.assignEmployee(emp);
        dep.assignEmployee(emp3);

        print(dep2.getEmployees());
        print(dep.getEmployees());
    }
}