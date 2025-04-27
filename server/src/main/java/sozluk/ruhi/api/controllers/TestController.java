package sozluk.ruhi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sozluk.ruhi.business.abstracts.TestService;
import sozluk.ruhi.entities.concretes.dtos.Test;

@RestController
@RequestMapping("api/test")
public class TestController {
	
	TestService testService;
	
	@Autowired
	TestController(TestService testService){
		this.testService= testService;
	}
	
	@GetMapping("getAll")
	public List<Test> getAll(){
		return this.testService.getAll();
	}

}
