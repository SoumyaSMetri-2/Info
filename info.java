package employee;
public class info {
    public static void sopln(Object o){
        System.out.println(o);
    }
    public static void main(String[] args){
        Employee obj1 = new Employee("Robert",1994,"64C-WallsStreet");
        Employee obj2 = new Employee("Sam",2000,"68D-WallsStreet");
        Employee obj3 = new Employee("John",1999,"26B-WallsStreet");
        sopln("Name       "+"  Year of joining     "+"     Address        ");
        sopln(obj1.getName() + "             "  +obj1.getYear() + "           " + obj1.getAddress() + "      ");
        sopln(obj2.getName() + "                "  +obj2.getYear() + "           " + obj2.getAddress() + "      ");
        sopln(obj3.getName() + "               "  +obj3.getYear() + "           " + obj3.getAddress() + "      ");
    }
}
