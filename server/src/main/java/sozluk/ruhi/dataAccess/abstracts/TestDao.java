package sozluk.ruhi.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import sozluk.ruhi.entities.concretes.dtos.Test;

public interface TestDao extends JpaRepository<Test, Integer>{
	
	

}
