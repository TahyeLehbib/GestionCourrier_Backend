package esp.irt.courriers.entites;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Courrier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long numero ;
    private String nom_emeteur;
    private String nom_destinateur;
    private String type;
    private String statut;

    public Courrier(){
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNom_emeteur() {
		return nom_emeteur;
	}

	public void setNom_emeteur(String nom_emeteur) {
		this.nom_emeteur = nom_emeteur;
	}

	public String getNom_destinateur() {
		return nom_destinateur;
	}

	public void setNom_destinateur(String nom_destinateur) {
		this.nom_destinateur = nom_destinateur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}


}
