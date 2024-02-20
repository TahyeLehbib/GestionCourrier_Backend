package esp.irt.courriers.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Cabinet")

public class Cabinet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_cab;

    private String nom_cab;
    @OneToMany(mappedBy = "cabinet", cascade = CascadeType.ALL)
    private List<Departement> departements;
    public Cabinet(){

    }
	public Long getId_cab() {
		return id_cab;
	}
	public void setId_cab(Long id_cab) {
		this.id_cab = id_cab;
	}
	public String getNom_cab() {
		return nom_cab;
	}
	public void setNom_cab(String nom_cab) {
		this.nom_cab = nom_cab;
	}
	public List<Departement> getDepartements() {
		return departements;
	}
	public void setDepartements(List<Departement> departements) {
		this.departements = departements;
	}
    

}