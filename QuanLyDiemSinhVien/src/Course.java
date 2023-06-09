public class Course {
    private String name;
    private float credits;

    public Course() {}
    public Course(String name, float credits) {
        this.name = name;
        this.credits = credits;
    }
    public Course(Course other) {
        this.name = other.name;
        this.credits = other.credits;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getCredits() {
        return credits;
    }
    public void setCredits(float credits) {
        this.credits = credits;
    }
    
}
