package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt")) ;
        String daoCIassName=scanner.nextLine();
        Class cDao = Class.forName(daoCIassName);
        IDao dao = (IDao) cDao.newInstance();

//        System.out.println( dao.getData());
        String metierClassName= scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod( "setDao" , IDao.class) ;
        method.invoke(metier,dao);

        System.out.println("Résultat : "+metier.calcul());

    }
}
