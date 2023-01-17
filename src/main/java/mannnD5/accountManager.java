package mannnD5;

public class accountManager {
    public static void main(String[] args) {
        accountservices user1 = new accountservices("mani",50001,60000);
        accountservices user2 = new accountservices("ravi",45001,90000);
        user1.diposite(20000);
        user2.withDraw(30000);


    }
}
