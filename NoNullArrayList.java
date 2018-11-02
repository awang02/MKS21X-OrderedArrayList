import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {
  public NoNullArrayList(){
    super();
  }
  public NoNullArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public Object set(int index, Object element){
    if (element == null) {
      throw new IllegalArgumentException();
    }
    else{
      super.set(index,element);
    }
  }

  public boolean add (Object o){

  }
  public void add (int index, Object element){

  }
}
