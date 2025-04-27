interface Animal{
	public void sound();
	public void sleep();
}

class Dog implements Animal{
	public void sound(){
		System.out.println("Bhaawww Bhaawww");
	}

	public void sleep(){
		System.out.println("Depends on dogs");
	}
}


class InterfaceMain{
	public static void main(String args[]){
		Dog d1 = new Dog();

		d1.sound();
		d1.sleep();
	}
}