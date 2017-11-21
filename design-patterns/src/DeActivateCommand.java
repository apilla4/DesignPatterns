public class DeActivateCommand implements Command {
    
    protected Account account;
    
    public DeActivateCommand(Account account) {
        this.account = account;
    }
    
    @Override
    public void execute() {
        AccountService.deactivate(account);
    }
    
    
}