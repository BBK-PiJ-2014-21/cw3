/**
 * Implementation of interface {@see FunctionalList} which extends the array of Objects {@see ArrayList}
 * 
 * @author fbarto01 (bbk-pij-2014-21)
 */
public class FunctionalArrayList extends ArrayList implements FunctionalList {
	
	public FunctionalArrayList() {
		super();
	}
	
	public ReturnObject head() {
		return get(0);
	}
	
	public FunctionalList rest() {
		FunctionalList funkList = this;
		funkList.remove(0);
		return funkList;
	}
	
}
		