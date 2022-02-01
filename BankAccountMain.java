public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setMyname("田中太郎");
        acc.setBalance(120000);
        acc.showAccount();
    }
}
