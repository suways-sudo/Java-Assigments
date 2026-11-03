// This example requires the LinkedStack<T> class from the lecture.

class BankAccount {

    private double balance;
    private LinkedStack<Double> history = new LinkedStack<>();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {

        balance = balance + amount;

        history.push(amount);

        System.out.println(
            "Deposit " + amount + " -> balance " + balance
        );
    }

    public void undoLastDeposit() {

        if (history.isEmpty()) {

            System.out.println("Nothing to undo");
            return;
        }

        double last = history.pop();

        balance = balance - last;

        System.out.println(
            "Undo " + last + " -> balance " + balance
        );
    }
}
