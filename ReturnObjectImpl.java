
public class ReturnObjectImpl implements ReturnObject {
	private Object value;
	private ErrorMessage message;
	
	public ReturnObjectImpl(Object value, ErrorMessage message) {
		this.value = value;
		this.message = message;
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

