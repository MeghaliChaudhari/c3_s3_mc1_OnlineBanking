public class SavingAccount {
    private String accountHolderName;
    private long accountNo;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean internetAndMobileBanking;
    private double interestRate;
    private String modeOfOperation;

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public String getAccountOpeningDate() {
        return accountOpeningDate;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setTotalBalance(double availableBalance) {
        totalBalance = availableBalance;
    }

    public double getTotalBalance() {
        return availableBalance;
    }

    public void setInternetAndMobileBanking(boolean internetAndMobileBanking) {
        this.internetAndMobileBanking = internetAndMobileBanking;
    }

    public boolean isInternetAndMobileBanking() {
        return internetAndMobileBanking;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }
    public double retrieveBalance(double availableBalance){
        return getAvailableBalance();
    }
    public double debit(double amount){
        availableBalance = availableBalance - amount;
        return availableBalance;
    }
    public double credit(double amount){
        availableBalance = availableBalance + amount;
        return availableBalance;
    }
    public void display(){
        System.out.println("Account Details");
        System.out.println("Account Holder Name : " + getAccountHolderName());
        System.out.println("Account No : " + getAccountNo());
        System.out.println("Account Opening Date : " + getAccountOpeningDate());
        System.out.println("Account status : " + getAccountStatus());
        System.out.println("Available Balance : " + getAvailableBalance());
        System.out.println("Total Balance : " + getTotalBalance());
        System.out.println("Internet And Mobile Banking : " + isInternetAndMobileBanking());
        System.out.println("Interest Rate : " + getInterestRate());
        System.out.println("Mode Of Operation : " + getModeOfOperation());
    }
}
