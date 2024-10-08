/*
public class java_vonglap {
    private String id;
    private String name;
    private int balance = 0;
    public java_vonglap(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public java_vonglap(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getCredit(int credit) {
        return balance;
    }
     public int setCredit(int amount) {
        balance = balance + amount;
     }

     public void setdebit(int amount) {
        balance = balance - amount;
     }
     public int getdebit(int amount) {
        return balance;
     }
     public int settranferTo(int amount) {
        balance = balance + amount;
     }
     public int gettranferTo() {
        return balance;
     }
     public String toString() {
        return "id: " + id + ", name: " + name + ", balance: " + balance;
     }
}
*/
class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance =0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return this.balance = this.balance + amount;
    }


    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return this.balance;
    }


    public void transferTo(Account anotherAccount, int amount) {
        if (amount <= this.balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }


    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }

}