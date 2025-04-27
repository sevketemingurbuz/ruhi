package sozluk.ruhi.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sozluk.ruhi.entities.concretes.Profil;

public interface ProfilDao extends JpaRepository<Profil, Integer>{

}
