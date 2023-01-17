package mannnD5;

public class accountservices {
    String name;
    int accountNO;
    double balance;

    public accountservices(String name, int accountNO, double balance) {
        this.name = name;
        this.accountNO = accountNO;
        this.balance = balance;
    }

    public void withDraw(int amount) {
        balance -= amount;
        if (balance < 0) {
            System.out.println("Low balance");
        } else {
            System.out.println("remaining balance is " + balance);
        }
    }

    public void diposite(int amount) {
        balance += amount;
        System.out.println("total amount is " + balance);
    }

}

