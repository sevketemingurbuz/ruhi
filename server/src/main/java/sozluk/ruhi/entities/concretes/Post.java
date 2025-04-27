package sozluk.ruhi.entities.concretes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "posts")
@AllArgsConstructor
@NoArgsConstructor
public class Post { //Makale olarak değiştirilcek
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "post_id")
	private int postId;
	
	@Column(name= "content")
	private String content;
	
	@Column(name= "title")
	private String title;
	
	@Column(name= "release_date_time")
	private LocalDateTime releaseDateTime = LocalDateTime.now();
	

	public String getReleaseDateTime( ) {
		return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(releaseDateTime);
	}
	
	@ManyToOne
	@JoinColumn(name= "profil_id")
	private Profil profil;


}
