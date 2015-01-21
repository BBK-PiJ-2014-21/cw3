/**
 * Implementation of interface {@see FunctionalList} which extends the array of Objects {@see ArrayList}
 * 
 * @author fbarto01 (bbk-pij-2014-21)
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	public FunctionalArrayList() {
		super();
	}
	/**
	 * The get(index) method in the superclass is already handling a possible EMPTY_STRUCTURE {@see ErrorMessage}
	 */
	public ReturnObject head() {
		ReturnObject copyHead = get(0);
		return copyHead;
	}
	
	public FunctionalList rest() {
		FunctionalList funkList = new FunctionalArrayList();
		if (!isEmpty()) {
			for (int i = 0; i < size(); i++) {
				funkList.add(get(i).getReturnValue());
			}
			funkList.remove(0);
		}
		return funkList;
	}
	
}
		