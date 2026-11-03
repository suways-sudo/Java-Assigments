public class students {

    private String name;
    private int age;
    private double gpa;

    public students(String name, int age, double gpa) {
        this.name = name;
        setAge(age);
        setGpa(gpa);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println(
                "Rejected: age must be positive (" + age + ")");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println(
                "Rejected: GPA must be 0.0-4.0 (" + gpa + ")");
        }
    }
}
