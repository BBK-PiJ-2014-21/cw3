
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
		