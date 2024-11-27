package member;
public class Inheritance_2 {

    public static void main(String[] args) {
        Account currentAccount1 = new CurrentAccount(106, "Talha", "Main Branch", 1000.00, "current account");
        Account currentAccount2 = new CurrentAccount(302, "Rumaisa", "Main Branch", 1000.00, "current account");
        Account savingAccount = new SavingAccount(102, "Umar", "City Branch", 5000.00, "saving account");

        Member member1 = new Member("Talha", 106, "0324567890", currentAccount1);
        Member member2 = new Member("Rumaisa", 302, "0396454578", currentAccount2);
        Member member3 = new Member("Umar", 102, "0321143210", savingAccount);

        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
    }
}
