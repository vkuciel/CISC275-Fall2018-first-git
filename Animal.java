// Victor Kuciel
// CISC - 275

public class Animal implements Comparable<Animal>{
	String name;
	int legs;
	
	public int getLegs(){
		return legs;
		
	}
	public String toString() {
		return name;
	}
	@Override
	public int compareTo(Animal a) {
		return this.toString().compareTo(a.toString());
	}
}
