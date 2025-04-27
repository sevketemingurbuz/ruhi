package sozluk.ruhi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sozluk.ruhi.business.abstracts.PostService;
import sozluk.ruhi.dataAccess.abstracts.PostDao;
import sozluk.ruhi.entities.concretes.Post;

@Service
public class PostManager implements PostService{

	PostDao postDao;
	
	@Autowired
	public PostManager(PostDao postDao) {
		this.postDao= postDao;
	}
	
	@Override
	public List<Post> getAll(){
		return this.postDao.findAll();
	}
}
