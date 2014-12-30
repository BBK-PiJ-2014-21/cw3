
public class ArrayList implements List {
	private Object[] list = new Object[10];
	private int size = 0;
	
	public boolean isEmpty() {gi5t 
		if(size()==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isFull() {
		if(list.length==size()) {
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
				if(isFull()) {
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
			if(isFull()) {
				expandArray();
			}
			list[size()] = item;
			size++;
			return wrap;
		}
	}
	
	public void printList() {
		if(isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for(int i=0; i<size(); i++) {
				System.out.println("index " + i + ": " + list[i]);
			}
			System.out.println("size: " + size());
		}
	}			
		
}