package sozluk.ruhi.business.abstracts;

import java.util.List;

import sozluk.ruhi.entities.concretes.User;
import sozluk.ruhi.entities.concretes.dtos.UserFullNameDto;

public interface UserService {

	public List<User> getAll();

	List<UserFullNameDto> getByAllFullName();
}
