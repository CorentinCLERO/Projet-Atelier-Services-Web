package service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import metier.Compte;

//Initialement nous avons une Classe Java Classique
//Si on veut que cela devienne un webservice, on utilise les annotations Jax WS
@WebService(name="BanqueWS")
public class BanqueServices {
	// Methode pour réaliser une conversion
	// On peut spécifier le nom de la méthode du webservice avec "operationName"
	@WebMethod(operationName="ConversionEuroToRouble")
	// On utilise l'annotation WebParam pour définir le nom du paramètre dans le webservice
	public double conversion(@WebParam(name="montant")double mt) {
		return mt*100;
	}
	
	@WebMethod
	// Methode pour récupérer un seul compte
	public Compte getCompte(@WebParam(name="code")Long code) {
		return new Compte(code, Math.random()*8000, new Date());
	}
	
	// Methode pour récupérer les comptes
	@WebMethod
	public List<Compte> getComptes() {
		List<Compte> comptes = new ArrayList<Compte>();
		comptes.add(new Compte(1L, Math.random()*80000, new Date()));
		comptes.add(new Compte(2L, Math.random()*80000, new Date()));
	
		return comptes;
	}
}