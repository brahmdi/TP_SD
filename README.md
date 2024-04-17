# Partie 1: Mise en place des interfaces et des implémentations

## Objectif
Cette partie du projet vise à mettre en place des interfaces et des implémentations selon les principes de la programmation orientée objet et à explorer différentes méthodes d'injection de dépendances.

## Étapes réalisées

1. **Création de l'interface IDao avec une méthode getDate**
    - L'interface `IDao` a été créée avec une méthode `getDate` qui permet de récupérer la date courante.

2. **Implémentation de l'interface IDao**
    - Une implémentation de l'interface `IDao` a été créée pour fournir une fonctionnalité concrète de récupération de la date.

3. **Création de l'interface IMetier avec une méthode calcul**
    - L'interface `IMetier` a été créée avec une méthode `calcul` pour effectuer des calculs spécifiques.

4. **Implémentation de l'interface IMetier en utilisant le couplage faible**
    - Une implémentation de l'interface `IMetier` a été réalisée en utilisant le principe du couplage faible pour favoriser la modularité et la réutilisabilité du code.

5. **Injection des dépendances**
    - Injection par instanciation statique :
        - Les dépendances ont été instanciées directement dans la classe, ce qui peut entraîner un couplage fort entre les classes.
    - Injection par instanciation dynamique :
        - Les dépendances ont été instanciées dynamiquement à l'exécution, ce qui permet une plus grande flexibilité dans le remplacement des implémentations.
    - Injection en utilisant le Framework Spring :
        - Version XML :
            - Les dépendances ont été configurées dans un fichier XML de configuration Spring, offrant une approche déclarative.
        - Version annotations :
            - Les dépendances ont été configurées à l'aide d'annotations Spring, offrant une approche plus concise et basée sur les annotations.


