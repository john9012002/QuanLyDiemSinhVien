public class Transcript {
    private String semester;
    private float gpa;

    public Transcript() {

    }
    public Transcript(String semester, float gpa) {
        this.semester = semester;
        this.gpa = gpa;
    }
    public Transcript(Transcript other) {
        this.semester = other.semester;
        this.gpa = other.gpa;
    }
    public String getSemester() {
        return semester;
    }
    public void setSemester(String semester) {
        this.semester = semester;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
}
