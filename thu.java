/*
public class thu {
    public static void main(String[] args) {
        java_vonglap a1 = new java_vonglap("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        java_vonglap a2 = new java_vonglap("A102", "Kumar"); // default balance
        System.out.println(a2);

        // Test Getters
        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.getCredit(100);
        System.out.println(a1);
        a1.getdebit(50);
        System.out.println(a1);
        a1.getdebit(500);  // debit() error
        System.out.println(a1);
//
        // Test transfer()
    //    a1.gettranferTo(a2, 100);  // toString()
  //      System.out.println(a1);
    //    System.out.println(a2);

    }
}
*/
public class thu {
    public static void main(String[] args) {

        Account a1 = new Account("A101", "Tan Ah Teck", 88);
        System.out.println(a1);  // toString();
        Account a2 = new Account("A102", "Kumar"); // default balance
        System.out.println(a2);

        System.out.println("ID: " + a1.getId());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Test credit() and debit()
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);  // debit() error
        System.out.println(a1);

        // Test transfer()
        a1.transferTo(a2, 100);  // toString()
        System.out.println(a1);
        System.out.println(a2);
    }
}
