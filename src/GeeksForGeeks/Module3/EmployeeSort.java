package GeeksForGeeks.Module3;

import GeeksForGeeks.FastReader;

import java.util.Arrays;
import java.util.Comparator;

class Employee //Employee class
{
    //attributes of an employee
    String name;
    int salary;
    int id;
    public Employee(String name, int salary,int id) //setter using constructor
    {
        this.name=name;
        this.salary=salary;
        this.id=id;

    }
}
public class EmployeeSort {
    public static void main(String[] args) {
        FastReader fs = new FastReader();
        int t = fs.nextInt();
        while(t-- > 0){
            int n = fs.nextInt();
            Employee arr[]=new Employee[n]; //array of employees

            for(int i=0;i<n;i++)
            {
                String name;
                int salary;
                int id;
                name=fs.next();
                salary=fs.nextInt();
                id=fs.nextInt();
                Employee e=new Employee(name,salary,id); //object with the attributes
                arr[i]=e; //put in array

            }
            Arrays.sort(arr, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    int result = Integer.compare(o2.salary,o1.salary);
                    if(result!=0){
                        return result;
                    }
                    return Integer.compare(o2.id,o1.id);
                }
            });

            for(int i =0;i<n;i++){
                System.out.println(arr[i].name+" "+arr[i].salary +" "+arr[i].id);
            }
        }
    }
}
