package sozluk.ruhi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sozluk.ruhi.business.abstracts.TestService;
import sozluk.ruhi.dataAccess.abstracts.TestDao;
import sozluk.ruhi.entities.concretes.dtos.Test;

@Service
public class TestManager implements TestService{
	
	TestDao testDao;
	
	@Autowired
	public TestManager(TestDao testDao) {
		this.testDao=  testDao;
	}
	
	@Override
	public List<Test> getAll(){
		return this.testDao.findAll();
	}

}
