public class OOP {

    static class Student {
        int id;
        String name;
        String major;

        // Constructor
        Student(int sId, String sName, String sMajor) {
            id = sId;
            name = sName;
            major = sMajor;
        }

        // Method
        void printInfo() {
            System.out.println(id + " - " + name + " (" + major + ")");
        }
    }

    public static void main(String[] args) {

        // Creating objects
        Student first = new Student(
                1001,
                "Hawa",
                "Computer Science"
        );

        Student second = new Student(
                1002,
                "Ali",
                "Information Technology"
        );

        // Print students' information
        first.printInfo();
        second.printInfo();

        // Change only Ali's major
        second.major = "Computer Science";

        // Print Ali's updated information
        second.printInfo();
    }
}
