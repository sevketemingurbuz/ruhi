package sozluk.ruhi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sozluk.ruhi.business.abstracts.ProfilService;
import sozluk.ruhi.dataAccess.abstracts.ProfilDao;
import sozluk.ruhi.entities.concretes.Profil;

@Service
public class ProfilManager implements ProfilService{
	
	ProfilDao profilDao;
	
	@Autowired
	ProfilManager(ProfilDao profilDao){
		this.profilDao= profilDao;
	}
	
	@Override
	public List<Profil> getAll(){
		return this.profilDao.findAll();
	}

}
