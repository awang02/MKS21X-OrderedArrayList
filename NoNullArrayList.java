import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public T set(int index, T element){
    T object;
    if (element == null) {
      throw new IllegalArgumentException("Null element invalid");
    }
    else{
      object = this.get(index);
      super.set(index,element);
    }
    return object;
  }

  public boolean add (T element) {
    if (element == null) {
      throw new IllegalArgumentException("Null element invalid");
    }
    else {
      super.add(element);
    }
    return true;
  }

  public void add (int index, T element){
    if (element == null) {
      throw new IllegalArgumentException("Null element invalid");
    }
    else {
      super.add(index,element);
    }
  }
}
