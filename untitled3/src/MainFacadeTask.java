class AccountSystem {
    void manageAccount() {
        System.out.println("Managing account...");
    }
}

class LoanSystem {
    void processLoan() {
        System.out.println("Processing loan...");
    }
}

class TransactionSystem {
    void makeTransaction() {
        System.out.println("Making transaction...");
    }
}

class BankFacade {
    private AccountSystem accountSystem;
    private LoanSystem loanSystem;
    private TransactionSystem transactionSystem;

    public BankFacade() {
        this.accountSystem = new AccountSystem();
        this.loanSystem = new LoanSystem();
        this.transactionSystem = new TransactionSystem();
    }

    public void performBankOperations() {
        accountSystem.manageAccount();
        loanSystem.processLoan();
        transactionSystem.makeTransaction();
    }
}

public class MainFacadeTask {
    public static void main(String[] args) {
        BankFacade bankFacade = new BankFacade();
        bankFacade.performBankOperations();
    }
}
