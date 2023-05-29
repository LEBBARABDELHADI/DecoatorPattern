//ConcreteDecorator (Décorateur concret) : Ce sont les classes concrètes qui étendent la classe Decorator. 
//Elles ajoutent des fonctionnalités supplémentaires à
//l'objet de base en surchargeant ou en ajoutant des comportements aux méthodes de l'interface Component.
public class BorderDecorator extends ShapeDecorator {
    public BorderDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    
    @Override
    public void draw() {
        super.draw();
        addBorder();
    }
    
    private void addBorder() {
        System.out.println("Ajout de bordures à la forme.");
    }
}