package esp.irt.courriers.entites;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;



@Entity
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_dep;

    private String nom_dep;

    @ManyToOne
    private Cabinet cabinet;

    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL)
    private List<Direction> directions;

    public Departement(){
    }

	public Long getId_dep() {
		return id_dep;
	}

	public void setId_dep(Long id_dep) {
		this.id_dep = id_dep;
	}

	public String getNom_dep() {
		return nom_dep;
	}

	public void setNom_dep(String nom_dep) {
		this.nom_dep = nom_dep;
	}

	public Cabinet getCabinet() {
		return cabinet;
	}

	public void setCabinet(Cabinet cabinet) {
		this.cabinet = cabinet;
	}

	public List<Direction> getDirections() {
		return directions;
	}

	public void setDirections(List<Direction> directions) {
		this.directions = directions;
	}


}
