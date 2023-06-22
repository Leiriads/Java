package Model;

public class Test {
    private int id;
    private String studentName;
    private String professorName;
    private float grade;
    private String subject;

    
    public void setTest(int id, String studentName, String professorName, float grade, String subject) {
        this.id = id;
        this.studentName = studentName;
        this.professorName = professorName;
        this.grade = grade;
        this.subject = subject;
    }
    
    public void setTestNid( String studentName, String professorName, float grade, String subject) {
        this.studentName = studentName;
        this.professorName = professorName;
        this.grade = grade;
        this.subject = subject;
    }
    
    public int getId() {
       return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
