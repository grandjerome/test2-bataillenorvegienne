package Moteur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Carte {

	
	
	/*
	 * (non-javadoc)
	 */

	private int valeur;

	/*
	 * (non-javadoc)
	 */
	private String couleur;

	/*
	 * (non-javadoc)
	 */
	
	

	/*
	 * (non-javadoc)
	 */
	private boolean carteJouable;
	public static enum couleurCarte{coeur,carreau,pique,trefle};
	
	
	
	
	@SuppressWarnings("null")
	
		
	
	public Carte(int valeur,String couleurcarte){
		this.couleur=couleurcarte;
		this.valeur=valeur;
		System.out.println("je suis le "+this.valeur+" "+"de"+" "+this.couleur);
		
	}
	public Carte(){
		
	}
	public boolean determinerCarteJouable() {
		boolean cartejouable=true;
		return(cartejouable);

	}

	/**
	 * Getter of the property <tt>valeur</tt>
	 * 
	 * @return Returns the valeur.
	 * 
	 */

	public int getValeur() {
		return valeur;
	}

	/**
	 * Setter of the property <tt>valeur</tt>
	 * 
	 * @param valeur
	 *            The valeur to set.
	 * 
	 */
	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	/**
	 * Getter of the property <tt>couleur</tt>
	 * 
	 * @return Returns the couleur.
	 * 
	 */

	public String getCouleur() {
		return couleur;
	}

	/**
	 * Setter of the property <tt>couleur</tt>
	 * 
	 * @param couleur
	 *            The couleur to set.
	 * 
	 */
	

	/**
	 * Getter of the property <tt>carteJouable</tt>
	 * 
	 * @return Returns the carteJouable.
	 * 
	 */

	public boolean getCarteJouable() {
		return carteJouable;
	}

	/**
	 * Setter of the property <tt>carteJouable</tt>
	 * 
	 * @param carteJouable
	 *            The carteJouable to set.
	 * 
	 */
	public void setCarteJouable(boolean carteJouable) {
		this.carteJouable = carteJouable;
	}
	

}

// /**
// * Getter of the property <tt>tasDeCartes</tt>
// *
// * @return Returns the tasDeCartes.
// *
// */
//
// public TasDeCartes getTasDeCartes() {
// return tasDeCartes;
// }
// /**
// * Setter of the property <tt>tasDeCartes</tt>
// *
// * @param tasDeCartes
// * The tasDeCartes to set.
// *
// */
// public void setTasDeCartes(TasDeCartes tasDeCartes) {
// this.tasDeCartes = tasDeCartes;
// }
// /**
// * Setter of the property <tt>joueur</tt>
// *
// * @param joueur
// * The joueur to set.
// *
// */
// public void setJoueur(Joueur joueur) {
// this.joueur = joueur;
// }
// /**
// * Getter of the property <tt>joueur</tt>
// *
// * @return Returns the joueur.
// *
// */
//
// public Joueur getJoueur() {
// return joueur;
// }

