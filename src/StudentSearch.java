import java.util.ArrayList;

public class StudentSearch {
    public boolean studentExists(ArrayList<Student> students, String id) throws Exception {

        if (students.size() == 0) {
            throw new Exception("Students array should not be empty!");
        }
        for (Student student: students)
            if (student.getId().equals(id))
                return true;

        return false;
    }
}

//comment to commit 
public ArrayList<Student> findAll(ArrayList<Student> students, String name) throws
Exception {
ArrayList<Student> result = new ArrayList<Student>();
for (Student student: students)
if (student.getName().equals(name)) {
result.add(student);
}
if (result.isEmpty()) {
throw new Exception("There is no student with the given name!");
}
return result;
} 