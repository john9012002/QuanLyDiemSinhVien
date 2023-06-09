import java.util.Date;

public class RegularStudent extends Student {
    public RegularStudent() {
        super();
    }
    public RegularStudent(String id, String name, Date dob, int year, float admissionScore) {
        super(id, name, dob, year, admissionScore);
    }
    public RegularStudent(RegularStudent other) {
        super(other);
    }
}
