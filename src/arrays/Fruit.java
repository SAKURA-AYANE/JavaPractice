package arrays;
import java.util.Comparator;

public class Fruit {
String name;
int cost;


public Fruit(String n1, int c1){
	name = n1;
	cost = c1;
}


public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getCost() {
	return cost;
}


public void setCost(int cost) {
	this.cost = cost;
}


public String toString(){
	return name+"," + cost;
}




static class nameComparator implements Comparator<Fruit>{
	public int compare(Fruit f1, Fruit f2){
		return f1.getName().compareTo(f2.getName());
	}
}

static class costComparator implements Comparator<Fruit>{
	public int compare(Fruit f1, Fruit f2){
		return ((Integer) f1.getCost()).compareTo((Integer) f2.getCost());
	}
}



}


