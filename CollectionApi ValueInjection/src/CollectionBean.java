import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
List<String> list;
Set<String> set;
Map<String,String> map;

public List<String> getList() {
	return list;
}
public void setList(List<String> list) {
	this.list = list;
}
public Set<String> getSet() {
	return set;
}
public void setSet(Set<String> set) {
	this.set = set;
}
public Map<String,String> getMap() {
	return map;
}
public void setMap(Map<String,String> map) {
	this.map = map;
}

}
