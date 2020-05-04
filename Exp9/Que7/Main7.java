import java.util.HashSet;

public class Main7 {

	public static void main(String[] args) {
		HashSet<Integer> obj= new HashSet();  
obj.add(8);
obj.add(6);      //Adding values to HashSet
obj.add(10);
obj.add(2);
HashSet newone=new HashSet();
newone=(HashSet)obj.clone();   //cloning a object in another new object of HashSet
System.out.println(newone);
//clearing all elements
newone.clear();
System.out.println("After clearing everything : "+ newone);
	System.out.println(obj.contains(3));
	}

}
