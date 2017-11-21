import java.util.ArrayList;
import java.util.List;

public class WithdrawEvent {
	
    protected String message;
    List<EventObserver> observers = new ArrayList<>();
    
    public void attach(EventObserver observer) {
    	observers.add(observer);
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }
    
    
    public void notifyAllObservers() {
    	for(EventObserver observer: observers) {
    		observer.update();
    	}
    }
}