public class Dog extends Animal implements Comparable <Animal> {

	public Dog(String n, int l) {
		this.name = n;
		this.legs = l;
	}
	
	public String toString() {
		return name + ", " + legs;
	}

        public int compareTo(Animal b) {
		if (this.legs - b.legs == 0) {
			return (this.toString().compareToIgnoreCase(b.toString()));
		}
		
		return (this.legs- b.legs);
	}
}
