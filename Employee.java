package employee;
public class Employee {
    String x = "Robert";
    String a = "Sam" ;
    String b = "John" ;
    int y[] = {1994,2000,1999} ;
    String z = "64C- WallsStreet" ; 
    String c = "68D- WallsStreet" ; 
    String d = "26B- WallsStreet" ; 
    public static void main(String[] args) {
        Employee obj1 = new Employee() ;
        Employee obj2 = new Employee() ;
        Employee obj3 = new Employee() ;
        System.out.println("Name          Year of joining         Address");
        System.out.print(obj1.x + "              "  +obj2.y[0] + "           " + obj3.z + "      ");
        System.out.println();
        System.out.print(obj1.a + "                 "  +obj2.y[1] + "           " + obj3.c + "      ");
        System.out.println();
        System.out.print(obj1.b + "                "  +obj2.y[2] + "           " + obj3.d + "      ");
        System.out.println();
    }
}    