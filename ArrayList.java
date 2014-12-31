
public class ArrayList implements List {
	private Object[] list = new Object[5];
	private int size = 0;
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	} 
	
	public boolean almostFull() {
		if(size()==list.length-1) {
			return true;
		} else {
			return false;
		}
	}
	
	public void expandArray() {
		Object[] temp = list;
		list = new Object[temp.length*2];
		for(int i=0; i<size(); i++) {
			list[i] = temp[i];
		}
	}

	public ReturnObject get(int index) {
		if(isEmpty()) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.EMPTY_STRUCTURE);
			return wrap;
		} else if(index<0 || index>size()-1) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(list[index], ErrorMessage.NO_ERROR);
			return wrap;
		}
	}
	
	public ReturnObject remove(int index) {
		ReturnObject wrap = get(index);
		if(!wrap.hasError()) {
			if(index==size()-1) {
				list[index] = null;
			} else {
				for(int i=index; i<size(); i++) {
					list[i] = list[i+1];
				}
			}
			size--;
		}
		return wrap;
	}
	
	public ReturnObject add(int index, Object item) {
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			if(index<0 || index>size()-1) {
				ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INDEX_OUT_OF_BOUNDS);
				return wrap;
			} else {
				ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.NO_ERROR);
				if(almostFull()) {
					expandArray();
				}
				for(int i=size()-1; i>=index; i--) {
					list[i+1] = list[i];
				}
				list[index] = item;
				size++;
				return wrap;
			}
		}
	}
	
	public ReturnObject add(Object item) {
		if(item==null) {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(null, ErrorMessage.NO_ERROR);
			if(almostFull()) {
				expandArray();
			}
			list[size()] = item;
			size++;
			return wrap;
		}
	}		
		
	public void printList() {	// for tests
		if(isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for(int i=0; i<size(); i++) {
				System.out.println("index " + i + ": " + get(i).getReturnValue());
			}
		}
	}
}