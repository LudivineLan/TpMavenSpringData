package com.infotel.TPMavenSpringData1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TPMavenSpringData1.dao.AdresseRepository;
import com.infotel.TPMavenSpringData1.dao.PersonneRepository;
import com.infotel.TPMavenSpringData1.metier.Adresse;
import com.infotel.TPMavenSpringData1.metier.Personne;


@Service(value="service")
public class ServiceImpl implements IService {

	@Autowired
	PersonneRepository personneRepository;
	@Autowired
	AdresseRepository adresseRepository;
	
	

	public AdresseRepository getAdresseRepository() {
		return adresseRepository;
	}

	public void setAdresseRepository(AdresseRepository adresseRepository) {
		this.adresseRepository = adresseRepository;
	}

	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public int modifierPersonne(String nom, String prenom,int age,int  idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.modifierPersonne(nom, prenom, age, idPersonne);
		
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		 personneRepository.delete(p);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.getOne(idPersonne);
	}

	@Override
	public Iterable<Personne> findAllPErsonne() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Optional<Personne> affichagePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.findById(idPersonne);
	}
	
	@Override
	public int modifierAdresse(Adresse adresse, int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.modifierAdresse(adresse, idPersonne);
	}

	@Override
	public List<Personne> chercherParPrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenom(prenom);
	}

	@Override
	public List<Personne> contientDansLePrenom(String prenom) {
		// TODO Auto-generated method stub
		return personneRepository.findByPrenomContaining(prenom);
	}

	@Override
	public List<Personne> rechercherParMc(String nom) {
		// TODO Auto-generated method stub
		return personneRepository.rechercherParMc("%"+nom+"%");
	}


	//Adresse
	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public int modifierAdresse(String nomRue, String numRue, String cp, String ville, int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.modifierAdresse(nomRue, numRue, cp, ville, idAdresse);
		
	}

	@Override
	public void supprimerAdresse(Adresse a) {
		// TODO Auto-generated method stub
		adresseRepository.delete(a);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.getOne(idAdresse);
	}

	@Override
	public Iterable<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public Optional<Adresse> affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(idAdresse);
	}

	

}
