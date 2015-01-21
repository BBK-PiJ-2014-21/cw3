/**
 * Implementation of interface {@see List} as an array of Objects;
 *
 * @author fbarto01 (bbk-pij-2014-21)  
 */
public class ArrayList implements List {
	private Object[] list;
	private int size;
	/**
	 * Initial capacity is set as 10 (it is expanded with method expandArray() if needed);
	 * field size keeps track of the number of elements currently in the list.
 	 */
	public ArrayList() {
		list = new Object[10];
		size = 0;
	}
	
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
	/**
	 * This method checks if the array is almost full;
	 * @return true if there is only one empty space in the array
	 * (and therefore needs to be expanded), false otherwise. 
	 */
	public boolean almostFull() {
		if(size()==list.length-1) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * This method creates a new array with twice as much capacity as the previos one,
	 * and copies all the element of the old one to the new one.
	 */
	public void expandArray() {
		Object[] temp = list;
		list = new Object[temp.length*2];
		for(int i=0; i<size(); i++) {
			list[i] = temp[i];
		}
	}

	public ReturnObject get(int index) {
		if(isEmpty()) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE);
			return wrap;
		} else if(index<0 || index>size()-1) {
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(list[index]);
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
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			if(index<0 || index>size()-1) {
				ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS);
				return wrap;
			} else {
				ReturnObject wrap = new ReturnObjectImpl(null);
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
			ReturnObject wrap = new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT);
			return wrap;
		} else {
			ReturnObject wrap = new ReturnObjectImpl(null);
			if(almostFull()) {
				expandArray();
			}
			list[size()] = item;
			size++;
			return wrap;
		}
	}		
	
}