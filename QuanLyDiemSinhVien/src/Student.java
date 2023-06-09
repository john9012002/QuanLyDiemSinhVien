import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Student {
    private String id;
    private String name;
    private Date dob;
    private int year;
    private float admissionScore;
    private List<Transcript> transcripts;

    public Student() {
        
    }
    public Student(String id, String name, Date dob, int year, float admissionScore) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.year = year;
        this.admissionScore = admissionScore;
    }
    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.dob = other.dob;
        this.year = other.year;
        this.admissionScore = other.admissionScore;
        this.transcripts = new ArrayList<>();
        for (Transcript t : other.transcripts) {
            this.transcripts.add(new Transcript(t));
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public float getAdmissionScore() {
        return admissionScore;
    }
    public void setAdmissionScore(float admissionScore) {
        this.admissionScore = admissionScore;
    }
    public List<Transcript> getTranscripts() {
        return transcripts;
    }
    public void setTranscripts(List<Transcript> transcripts) {
        this.transcripts = transcripts;
    }

    public float getAverageGrade(String semester) {
        float sum = 0;
        int count = 0;
        for (Transcript t : transcripts) {
            if (t.getSemester().equals(semester)) {
                sum += t.getGpa();
                count++;
            }
        }
        return (count == 0) ? 0 : (sum / count);
    }
    public boolean isRegular() {
        return false;
    }
    
}