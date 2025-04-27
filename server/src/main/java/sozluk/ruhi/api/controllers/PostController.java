package sozluk.ruhi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sozluk.ruhi.business.abstracts.PostService;
import sozluk.ruhi.entities.concretes.Post;

@RestController
@RequestMapping("/api/post")
public class PostController {

	PostService postService;
	
	@Autowired
	public PostController(PostService postService) {
		this.postService= postService;
	}
	

	/*@DeleteMapping("/getAll")
	public List<Post> getAll(){
		return this.postService.getAll();
	}*/
}
