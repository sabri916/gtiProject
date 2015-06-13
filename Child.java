public class Child extends Parent{

	public void display(){
		System.out.println("I am a Child");
		System.out.print("This is what my Parent has to say: ");
		super.display();
	}

	public void run(){
		System.out.println("I am running");
	}

	public void walk(){
		System.out.println("I am walking");
	}
}