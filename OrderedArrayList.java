import java.util.ArrayList;
import java.util.List;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
	public OrderedArrayList(){
		super();
	}
	public OrderedArrayList(int startingCapacity){
		super(startingCapacity);
	}

	public boolean add(T element){
		if (element == null){
			throw new IllegalArgumentException("Null element invalid");
		}
		else {
			int i = this.getIndex(element);
			super.add(i, element);
		}
		return true;
	}
	// helper method
	public int getIndex(T element){
		int index = 0;
		for(int i = 0; i < this.size(); i++){
			if (element.compareTo(this.get(i)) <= 0){
				return i;
			}
			index++;
		}
		return index;
	}

	public void add(int index, T element){
		add(element);
	}

	public T set(int index, T element){
		if (element == null){
			throw new IllegalArgumentException("Can't set to null");
		}
		else {
			T x = remove(index);
			add(element);
			return x;
		}
	}

}
