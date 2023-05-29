
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Shape shape = new ConcreteShape();
	        Shape decoratedShape = new BorderDecorator(shape);
	        
	        decoratedShape.draw();
	}

}
