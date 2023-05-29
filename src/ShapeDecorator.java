//Decorator : C'est la classe abstraite qui implémente l'interface Component et contient une référence à un objet de type Component. 
//Cette classe sert de base pour les décorateurs concrets et fournit une implémentation 
//par défaut des méthodes de l'interface Component en déléguant les appels à l'objet de base.
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }
    
    @Override
    public void draw() {
        decoratedShape.draw();
    }
}