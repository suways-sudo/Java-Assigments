public class Multilevelinheritance {

    static class Person {
        protected String name;
        protected String id;

        public void setDetails(String name, String id) {
            this.name = name;
            this.id = id;
        }

        public String describe() {
            return name + " (Aqoonsi: " + id + ")";
        }
    }

    static class Student extends Person {
        protected double gpa;

        public void setGpa(double gpa) {
            if (gpa >= 0 && gpa <= 4.0) {
                this.gpa = gpa;
            }
        }

        public String studentCard() {
            return "Arday: " + describe() + ", GPA: " + gpa;
        }
    }

    static class Lecturer extends Person {
        private String faculty;

        public void setFaculty(String faculty) {
            this.faculty = faculty;
        }

        public String staffCard() {
            return "Macallin: " + name
                    + " (Aqoonsi: " + id + "), Kulliyadda: " + faculty;
        }
    }

    static class PostgraduateStudent extends Student {
        private String thesisTitle;

        public void setThesisTitle(String thesisTitle) {
            this.thesisTitle = thesisTitle;
        }

        public String postgradCard() {
            return studentCard()
                    + ", Cinwaanka cilmi-baarista: " + thesisTitle;
        }
    }

    static class BankAccount {
        private String accountNumber;
        protected double balance;

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountNumber() {
            return accountNumber;
        }

        public void deposit(double amount) {
            if (amount <= 0) {
                System.out.println(
                    "Waa la diiday: lacagta la dhigayo waa inay ka badan tahay 0");
                return;
            }

            balance += amount;
        }

        public double getBalance() {
            return balance;
        }
    }

    static class SavingsAccount extends BankAccount {
        private double minimumBalance = 50;

        public double getMinimumBalance() {
            return minimumBalance;
        }
    }

    static class CurrentAccount extends BankAccount {
        private double overdraftLimit = 200;

        public double getOverdraftLimit() {
            return overdraftLimit;
        }

        public double availableFunds() {
            return balance + overdraftLimit;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Dadka Jaamacadda ===");

        Student amina = new Student();
        amina.setDetails("Aamina Xasan", "C1210345");
        amina.setGpa(3.6);

        Lecturer abdi = new Lecturer();
        abdi.setDetails("Cabdi Yuusuf", "L0042");
        abdi.setFaculty("Kombiyuutarka iyo IT-ga");

        PostgraduateStudent hodan = new PostgraduateStudent();
        hodan.setDetails("Hodan Cali", "P2300117");
        hodan.setGpa(3.8);
        hodan.setThesisTitle("Kala saarista qoraallada Af-Soomaaliga");

        System.out.println(amina.studentCard());
        System.out.println(abdi.staffCard());
        System.out.println(hodan.postgradCard());

        System.out.println("Hodan ma arday baa? "
                + (hodan instanceof Student));

        System.out.println("Hodan ma qof baa? "
                + (hodan instanceof Person));

        Person p = new Person();

        System.out.println("Qof caadi ah ma arday baa? "
                + (p instanceof Student));

        System.out.println("\n=== Akoonnada Bangiga ===");

        SavingsAccount savings = new SavingsAccount();
        savings.setAccountNumber("SAV-1001");
        savings.deposit(300);
        savings.deposit(-20);

        CurrentAccount current = new CurrentAccount();
        current.setAccountNumber("CUR-2001");
        current.deposit(150);

        System.out.println("Akoonka kaydka: "
                + savings.getAccountNumber()
                + ", Lacagta: " + savings.getBalance()
                + ", Lacagta ugu yar: " + savings.getMinimumBalance());

        System.out.println("Akoonka ganacsiga: "
                + current.getAccountNumber()
                + ", Lacagta: " + current.getBalance()
                + ", Lacagta la heli karo oo xadka dheeraadka leh: "
                + current.availableFunds());

        System.out.println("Akoonka kaydku ma BankAccount baa? "
                + (savings instanceof BankAccount));

        System.out.println("Akoonka kaydku ma Object baa? "
                + (savings instanceof Object));
    }
}
