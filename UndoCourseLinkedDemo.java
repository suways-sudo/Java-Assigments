// This example requires the LinkedStack<T> class from the lecture.

class Registration {

    private LinkedStack<String> courses = new LinkedStack<>();

    public void addCourse(String code) {

        courses.push(code);

        System.out.println(
            "Added " + code + " | top: " + courses.peek()
            + " | size: " + courses.size()
        );
    }

    public void undoLastCourse() {

        if (courses.isEmpty()) {

            System.out.println("Nothing to undo");
            return;
        }

        String removed = courses.pop();

        System.out.println(
            "Removed " + removed + " | size: " + courses.size()
        );
    }
}
