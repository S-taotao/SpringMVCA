package springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rest")
public class ResController {

	@RequestMapping("/user")
	public User index() {	
		User u = new User();
		u.setAge(11);
		u.setName("tao");
		return u;
	}

}
