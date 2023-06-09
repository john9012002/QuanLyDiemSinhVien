import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Student> students;
    
    public Department() {
        students = new ArrayList<>();
    }
    public Department(String name) {
        this.name = name;
        students = new ArrayList<>();
    }
    public Department(Department other) {
        this.name = other.name;
        students = new ArrayList<>();
        for (Student s : other.students) {
            if (s instanceof RegularStudent) {
                students.add(new RegularStudent((RegularStudent)s));
            } else {
                students.add(new PartTimeStudent((PartTimeStudent)s));
            }
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public int getRegularStudentCount() {
        int count = 0;
        for (Student s : students) {
            if (s.isRegular()) {
                count++;
            }
        }
        return count;
    }

    public Student getStudentWithHighestAdmissionScore() {
        if (students.size() == 0) {
            return null;
        }
        Student result = students.get(0);
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getAdmissionScore() > result.getAdmissionScore()) {
                result = students.get(i);
            }
        }
        return result;
    }

    public List<PartTimeStudent> getPartTimeStudentsByAffiliation(String affiliation) {
        List<PartTimeStudent> result = new ArrayList<>();
        for (Student s : students) {
            if (!s.isRegular() && ((PartTimeStudent)s).getAffiliation().equals(affiliation)) {
                result.add((PartTimeStudent)s);
            }
        }
        return result;
    }
    public List<Student> getStudentsWithHighLatestGrade() {
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.isRegular()) {
                List<Transcript> transcripts = s.getTranscripts();
                if (transcripts.size() > 0 && transcripts.get(transcripts.size()-1).getGpa() >= 8.0f) {
                    result.add(s);
                }
            }
        }
        return result;
    }
}
