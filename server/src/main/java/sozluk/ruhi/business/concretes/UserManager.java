package sozluk.ruhi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sozluk.ruhi.business.abstracts.UserService;
import sozluk.ruhi.dataAccess.abstracts.UserDao;
import sozluk.ruhi.entities.concretes.Post;
import sozluk.ruhi.entities.concretes.Profil;
import sozluk.ruhi.entities.concretes.User;
import sozluk.ruhi.entities.concretes.dtos.UserFullNameDto;

@Service
public class UserManager implements UserService{
	
	UserDao userDao;
	List<User> users;
	List<UserFullNameDto> usersFullNameDto;
	
	
	@Autowired
	public UserManager(UserDao userDao, List<User> users, List<UserFullNameDto> usersFullNameDto) {
		this.userDao= userDao;
		this.usersFullNameDto= usersFullNameDto;
		this.users= users;
	}
	
	@Override
	public List<User> getAll(){
		return this.userDao.findAll();
	}
	
	@Override
	public List<UserFullNameDto> getByAllFullName(){
		users= userDao.findAll();
		UserFullNameDto userFullNameDto = new UserFullNameDto() ;
		for(User user : users) {
			
			Profil profil= user.getProfil();
			List<Post> posts = profil.getPosts();
			userFullNameDto.setFullName(user.getName() + " " + user.getLastName());
			for (Post post : posts) {
				userFullNameDto.setTitle(post.getTitle());
				userFullNameDto.setContent(post.getContent());
			}
			usersFullNameDto.add(userFullNameDto);
		}
		
		return usersFullNameDto;

	}

}
