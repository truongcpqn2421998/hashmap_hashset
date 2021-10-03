import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student HS1=new Student("Quang Anh",23,"Ha Noi");
        Student HS2=new Student("Truong",23,"Cam Pha");
        Student HS3=new Student("Beng",26,"Ha Noi");

        Map<Integer, Student> studentMap= new HashMap<Integer,Student>();
        studentMap.put(1,HS1);
        studentMap.put(2,HS2);
        studentMap.put(3,HS3);
        studentMap.put(4,HS3);
        for (Map.Entry<Integer,Student> a:studentMap.entrySet()
             ) {
            System.out.println(a.toString());
        }

        System.out.println("...........Set");
        Set<Student> students = new HashSet<Student>();
        students.add(HS1);
        students.add(HS2);
        students.add(HS3);
        students.add(HS3);
        for(Student b : students){
            System.out.println(b.toString());
        }


    }
}
