package sozluk.ruhi.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name= "spirits")
@AllArgsConstructor
@NoArgsConstructor
public class Spirit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private long id;
	
	@Column(name= "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "discussion_id")
	private Discussion discussion;
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	private User user;
	

}
