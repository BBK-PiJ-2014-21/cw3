/**
 * Implementation of interface {@see ReturnObject} 
 * 
 * @author fbarto01 (bbk-pij-2014-21) 
 */
public class ReturnObjectImpl implements ReturnObject {
	private Object value;
	private ErrorMessage message;
	/**
	 * Constructor for invalid operations
	 * @param message the {@see ErrorMessage} wrapping the Object returned (which is always null)
	 */
	public ReturnObjectImpl(ErrorMessage message) {
		this.value = null;
		this.message = message;
	}
	/**
	 * Constructor for valid operations
	 * @param value the Object returned.
	 */
	public ReturnObjectImpl(Object value) {
		this.value = value;
		this.message = ErrorMessage.NO_ERROR;
	}
	
	public boolean hasError() {
		if(message==ErrorMessage.NO_ERROR) {
			return false;
		} else {
			return true;
		}
	}
	
	public ErrorMessage getError() {
		return message;
	}
	
	public Object getReturnValue() {
		if(hasError()) {
			return null;
		} else {
			return value;
		}
	}
	
}

