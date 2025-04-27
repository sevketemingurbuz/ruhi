package sozluk.ruhi.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sozluk.ruhi.entities.concretes.Post;

public interface PostDao extends JpaRepository<Post, Integer>{
	

}
