package pertemuan_6.quiz.no_7;

class SavingsAccount extends BankAccount {

    @Override
    void deposit() {
        System.out.println("Deposit successful");
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawal successful");
    }

}
