import java.util.Date;

public class PartTimeStudent extends Student {
    private String affiliation;
    public PartTimeStudent() {
        super();
    }
    public PartTimeStudent(String id, String name, Date dob, int year, float admissionScore, String affiliation) {
        super(id, name, dob, year, admissionScore);
        this.affiliation = affiliation;
    }
    public PartTimeStudent(PartTimeStudent other) {
        super(other);
        this.affiliation = other.affiliation;
    }
    public String getAffiliation() {
        return affiliation;
    }
    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }
    public boolean isRegular() {
        return false;
    }
}
