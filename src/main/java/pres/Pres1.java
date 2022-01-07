package pres;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Pres1 {

	public static void main(String[] args) throws Exception {
		/*
		 * Injection des dépendances par instanciation statique
		 */
		DaoImpl dao=new DaoImpl();
		MetierImpl metier=new MetierImpl();
		metier.setDao(dao);
		System.out.println(metier.calcul());

		
	}
}


