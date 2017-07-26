import java.util.ArrayList;
import java.util.List;

class User{
	int uid;
	String userName;

public User(int uid,String userName){
	this.uid=uid;
	this.userName=userName;
}
}
public class ListDemo {
public static void main(String[] args){
	List list=new ArrayList();
	list.add("Yusuf");
	list.add("Rahul");
	list.add("Mithun");
	
	for(Object object:list){
		System.out.println(object);
	}
	
}
}
 