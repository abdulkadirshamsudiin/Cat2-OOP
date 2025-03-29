// Question 1 (a):



public class Student {
    private String name;
    private int grade;

    public String getname() { //This is called getters because they get the value of the private attributes.
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int g) {
        if (g >= 0 && g <= 100) {
            grade = g;
        } else {
            grade = 0;
        }
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Shamsudin Abdulkadir");
        s.setGrade(120);
        System.out.println("Name: " + s.getname());
        System.out.println("Grade: " + s.getGrade());
    }
}

