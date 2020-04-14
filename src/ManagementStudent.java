import java.util.ArrayList;

public class ManagementStudent {
    ArrayList<Student> listStudents = new ArrayList<>();
    public boolean add(Student student){
        listStudents.add(student);
        return true;
    }
}
