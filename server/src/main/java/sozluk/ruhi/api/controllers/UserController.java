package sozluk.ruhi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sozluk.ruhi.business.abstracts.UserService;
import sozluk.ruhi.entities.concretes.User;
import sozluk.ruhi.entities.concretes.dtos.UserFullNameDto;

@RestController
@RequestMapping("api/user")
public class UserController {
	
	UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService= userService;
	}
	
	/*@Deprecated
	@GetMapping("/getAll")
	public List<User> getAll(){
		return this.userService.getAll();
	}*/
	
	@GetMapping("/getByAllFullName")
	public List<UserFullNameDto> getByAllFullName() {
		return this.userService.getByAllFullName();
	}

}
