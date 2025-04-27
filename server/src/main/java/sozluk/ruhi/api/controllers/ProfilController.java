package sozluk.ruhi.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sozluk.ruhi.business.abstracts.ProfilService;

@RestController
@RequestMapping("/api/profil")
public class ProfilController {
	
	ProfilService profilService;
	
	@Autowired
	ProfilController(ProfilService profilService){
		this.profilService= profilService;
	}
	
	/*@GetMapping("getAll")
	public List<Profil> getAll(){
		return this.profilService.getAll();
	}*/

}
