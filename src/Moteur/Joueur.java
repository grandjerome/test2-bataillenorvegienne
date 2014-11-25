package Moteur;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class Joueur {

	/*
	 * (non-javadoc)
	 */
	
	private int nbCartes;


	private String nomJoueur;
	
	
	private ArrayList<Carte> main;
	private ArrayList<Carte> faceCachee;
	private ArrayList<Carte> faceVisible;
	private ArrayList<Carte> carteaposer;
	public Joueur(){
		
	}
	public Joueur(String nom){
		this.nomJoueur=nom;
			
	}
	
	public void echangerCarte() {

	}
	public void creerList(){
		main = new ArrayList<Carte>();
		faceCachee = new ArrayList<Carte>();
		faceVisible = new ArrayList<Carte>();
	}
	public void piocher(int nbCarte){
		main.add((Carte) Partie.partie.getTasDeCarte().getpioche().remove());
	}
	public ArrayList<Carte> getfaceCachee(){
		return(faceCachee);
	}
	public ArrayList<Carte> getmain(){
		return(main);
	}
	public ArrayList<Carte> getfaceVisible(){
		return(faceVisible);
	}
	public void poserCarte(ArrayList<Carte> carteaposer) { 
		 boolean cartejouable=carteaposer.get(0).determinerCarteJouable();
		 if (cartejouable){
			 
		 }
		
	}

	

	public int getNbCartes() {
		return nbCartes;
	}

	
	public void setNbCartes(int nbCartes) {
		this.nbCartes = nbCartes;
	}
	
	public void jouerCarte(){
		if (!(main.isEmpty())){
			System.out.println("quelle carte voulez vous poser parmi : ");
			System.out.println("main :");
			int i;
			for (i=0;i<main.size();i++){
			System.out.println("numero "+ (i+1) +" "+ main.get(i).getCouleur() + " " + main.get(i).getValeur());
			}
			Scanner sc = new Scanner(System.in);
			System.out.println("combien de cartes à poser ?");
			int nombrecarteaposer=sc.nextInt();
			carteaposer = new ArrayList<Carte>();
			for(i=0;i<nombrecarteaposer;i++){
			System.out.println("numéro de la carte n° "+(i+1)+" :");
			
			int numerocarte = sc.nextInt();
			carteaposer.add(main.get(numerocarte-1));
			}
			//System.out.println(carteaposer.size());
			if(carteaposer.size()>1){
			boolean identique=verifierCarteIdentique(carteaposer);
			}
			//->exception identique=false
			poserCarte(carteaposer);
		}
		}
	public boolean verifierCarteIdentique(ArrayList<Carte> carteacomparer){
		boolean carteidentique=true;
		ListIterator<Carte> it = carteacomparer.listIterator();
		Carte elementreference=null;
		if (it.hasNext()){
			elementreference = it.next();
		}
		while(it.hasNext()){
			Carte elementacomparer = it.next();
			if (elementacomparer.getValeur()!=elementreference.getValeur()){
				carteidentique=false;
				
			}
			
		}
		return(carteidentique);
		
	}
	public ArrayList<Carte> getCarteAPoser(){
		return(carteaposer);
	}

	


	

}

// /**
// * Ensures that this collection contains the specified element (optional
// * operation).
// *
// * @param element
// * whose presence in this collection is to be ensured.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean addCarte(Carte carte) {
// return this.carte.add(carte);
// }
// /**
// * Setter of the property <tt>carte</tt>
// *
// * @param carte
// * the carte to set.
// *
// */
// public void setCarte(Collection<Carte> carte) {
// this.carte = carte;
// }
// /**
// * Removes a single instance of the specified element from this
// * collection, if it is present (optional operation).
// *
// * @param element
// * to be removed from this collection, if present.
// * @see java.util.Collection#add(Object)
// *
// */
// public boolean removeCarte(Carte carte) {
// return this.carte.remove(carte);
// }
// /**
// * Getter of the property <tt>carte</tt>
// *
// * @return Returns the carte.
// *
// */
//
// public Collection<Carte> getCarte() {
// return carte;
// }
// /**
// * Returns the number of elements in this collection.
// *
// * @return the number of elements in this collection
// * @see java.util.Collection#size()
// *
// */
// public int carteSize() {
// return carte.size();
// }
// /**
// * Setter of the property <tt>partie</tt>
// *
// * @param partie
// * The partie to set.
// *
// */
// public void setPartie(Partie partie) {
// this.partie = partie;
// }
// /**
// * Getter of the property <tt>partie</tt>
// *
// * @return Returns the partie.
// *
// */
//
// public Partie getPartie() {
// return partie;
// }

