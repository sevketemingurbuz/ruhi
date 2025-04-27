package sozluk.ruhi.entities.concretes;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "profils")
@AllArgsConstructor
@NoArgsConstructor
public class Profil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name=" id")
	private int id;
	
	@Column(name= "full_name") //kaldırılcak
	private String fullName;
	
	@Column(name= "gender")
	private String gender;
	
	@Column(name= "image_url")
	private String imageUrl;
	
	@OneToOne
	@JoinColumn(name= "user_id")
	private User user;
	
	@OneToMany(mappedBy = "profil")
	private List<Post> posts;
	

}
