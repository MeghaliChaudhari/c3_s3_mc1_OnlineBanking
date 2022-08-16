public class SavingAccountImpl {
    public static void main(String[] args) {
        SavingAccount obj = new SavingAccount();

        obj.setAccountHolderName("Meghali");
        obj.setAccountNo(12345678901L);
        obj.setAccountOpeningDate("12/3/2020");
        obj.setAccountStatus("active");
        obj.setAvailableBalance(20000);
        obj.setTotalBalance(20000);
        obj.setInternetAndMobileBanking(true);
        obj.setInterestRate(5.5);
        obj.setModeOfOperation("self-operated");

        obj.retrieveBalance(obj.getAvailableBalance());

        obj.display();
        System.out.println();

        obj.debit(500);
        System.out.println("After Debit amount Balance is : " + obj.getAvailableBalance());
        obj.credit(8000);
        System.out.println("After credit amount Balance is : " + obj.getAvailableBalance());
        System.out.println();
        System.out.println("Updated Available Balance : "+obj.getAvailableBalance());
        System.out.println("Updated Total Balance : " + obj.getAvailableBalance());

    }
}
