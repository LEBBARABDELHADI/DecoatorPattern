//ConcreteComponent (Composant concret) : C'est la classe concrète qui implémente l'interface Component.
//Elle représente l'objet de base auquel on peut ajouter des fonctionnalités supplémentaires.
public class ConcreteShape implements Shape {
    @Override
    public void draw() {
        System.out.println("Dessin de la forme de base.");
    }
}