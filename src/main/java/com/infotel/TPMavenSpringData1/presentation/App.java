package com.infotel.TPMavenSpringData1.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TPMavenSpringData1.metier.Adresse;
import com.infotel.TPMavenSpringData1.metier.Personne;
import com.infotel.TPMavenSpringData1.service.IService;
import com.infotel.TPMavenSpringData1.service.ServiceImpl;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//1-Charger les fichier de configuration spring
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        //2-3-Recuperer et utiliser les beans service et personne
        
        //Ajouter Personnne
//        Personne p = context.getBean("personne", Personne.class);
//        p.setNom("Durand");
//        p.setPrenom("Jean");
//        p.setAge(25);
      
        
        IService service = context.getBean("service", ServiceImpl.class);
//        System.out.println(p);
//        service.ajouterPersonne(p);
        
//        Personne p1 = context.getBean("personne", Personne.class);
//        p1.setNom("Jean");
//        p1.setPrenom("Jack");
//        p1.setAge(36);
//        System.out.println(p1);
//        service.ajouterPersonne(p1);
        
//        //Modifier Personne
//        Personne p2 = context.getBean("personne", Personne.class);
//        System.out.println(p2);
//        service.modifierPersonne("Marie", "Marie", 15, 1);
//        System.out.println(p2);
        
//        //Supprimer Personne
//        Personne p3 =  context.getBean("personne", Personne.class);
//        p3.setIdPersonne(5);
//        service.supprimerPersonne(p3);
        
        //Chercher par le prénom
        
//        System.out.println(service.chercherParPrenom("Jack"));
        
//        //Contient dans le prénom
//        System.out.println(service.contientDansLePrenom("n"));
//        
//        //Rechercher par mot clé
//        System.out.println(service.rechercherParMc("an"));
//        
//        //Affichage Personne
//        System.out.println(service.affichagePersonne(3));
        
//        //Lister Personne
//        System.out.println(service.findAllPErsonne());
        
        //Adresse
        //Ajouter Adresse
//        Adresse a = context.getBean("adresse", Adresse.class);
//        a.setNomRue("rue de Paris");
//        a.setNumRue("7bis");
//        a.setVille("Paris");
//        a.setCp("75");
//        System.out.println(a);
//        service.ajouterAdresse(a);
        
        Adresse a1 = context.getBean("adresse", Adresse.class);
        a1.setNomRue("rue de la Boulangerie");
        a1.setNumRue("18");
        a1.setVille("Paris");
        a1.setCp("75");
        System.out.println(a1);
        service.ajouterAdresse(a1);
        
//        //Supprimer Adresse
//        Adresse a2 = context.getBean("adresse", Adresse.class);
//        a2.setIdAdresse(3);
//        service.supprimerAdresse(a2);
        
//        //Modifier adresse
//        service.modifierAdresse("rue de la bouiteille", "5", "75002", "Paris", 1);
        
//      //Affichage Adresse
//      System.out.println(service.affichageAdresse(4));
      
//      //Lister Adresse
//      System.out.println(service.findAllAdresse());
        
        //Ajouter une adresse à une personne
        
        service.modifierAdresse(a1, 1);
        
        
        
        
        
    	 //4- fermer le contexte
        context.close();
    }
}
