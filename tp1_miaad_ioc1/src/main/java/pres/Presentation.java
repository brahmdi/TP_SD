package pres;

import ext.DaoImpl2;
import metier.MetierImpl;

public class Presentation {

    public static void main(String[] args) {
        /*
        l'injection des dépendances :
        Par instanciation statique
         */
        DaoImpl2 dao = new DaoImpl2();
        MetierImpl metier = new MetierImpl() ;
        metier.setDao(dao);
        System.out.println("Résultat est : "+metier.calcul());
    }
}
