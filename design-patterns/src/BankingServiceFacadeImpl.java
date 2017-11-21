public class BankingServiceFacadeImpl implements BankingServiceFacade {
    @Override
    public void moneyTransfer() {
        if(PaymentService.doPayment()) {
            Account acc1 = AccountService.getAccount("1");
            Account acc2 = AccountService.getAccount("2");
            
            TransferService.transfer(1000, acc1, acc2);
            
        }
    }
}