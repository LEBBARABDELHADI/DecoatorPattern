# DecoatorPattern


Dans cet exemple, le BorderDecorator ajoute des bordures à l'objet de base ConcreteShape en utilisant l'approche de composition. Ainsi, nous pouvons ajouter dynamiquement des fonctionnalités supplémentaires à nos objets sans modifier leur structure de base.

Component (Composant) : C'est l'interface commune ou la classe abstraite qui définit les opérations de base que les décorateurs et les objets concrets doivent implémenter. C'est le point d'entrée pour toutes les opérations.

ConcreteComponent (Composant concret) : C'est la classe concrète qui implémente l'interface Component. Elle représente l'objet de base auquel nous souhaitons ajouter des fonctionnalités supplémentaires.

Decorator : C'est la classe abstraite qui étend l'interface Component et contient une référence à un objet de type Component. Cette classe sert de base pour les décorateurs concrets et fournit une implémentation par défaut des méthodes de l'interface Component en déléguant les appels à l'objet de base.

ConcreteDecorator (Décorateur concret) : Ce sont les classes concrètes qui étendent la classe Decorator. Elles ajoutent des fonctionnalités supplémentaires à l'objet de base en surchargeant ou en ajoutant des comportements aux méthodes de l'interface Component.
