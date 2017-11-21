public class WithdrawEventObserver extends EventObserver {
    
    public WithdrawEventObserver(WithdrawEvent event) {
    	this.event = event;
    	this.event.attach(this); //this adds the WithdrawEventObserver to the List
    }
    
    @Override
    public void update() {
        System.out.println("Found message::" + event.getMessage());
    }
}