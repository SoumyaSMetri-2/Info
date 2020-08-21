package employee;
public class Employee {
    String name, address ;
    int year;
    public Employee(String n,int y, String add){
        name = n;
        year = y;
        address = add;
    }
    public String getName(){
        return name;
    }
    public int getYear(){
        return year;
    }
    public String getAddress(){
        return address;
    }
}    