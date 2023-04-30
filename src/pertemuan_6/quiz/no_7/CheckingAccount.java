package pertemuan_6.quiz.no_7;

class CheckingAccount extends BankAccount {

    @Override
    void deposit() {
        System.out.println("Deposit successful");
    }

    @Override
    void withdraw() {
        System.out.println("Withdrawal successful");
    }

}
