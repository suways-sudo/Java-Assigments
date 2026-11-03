class Box<T> {

    // declarations and code that refer to T

}

class GenericsExample {

    public static void main(String[] args) {

        int age = 25;
        String name = "Ali";
        double price = 15.5;

        Box<Integer> box1 = new Box<Integer>();
        Box<String> box2 = new Box<String>();

    }
}
