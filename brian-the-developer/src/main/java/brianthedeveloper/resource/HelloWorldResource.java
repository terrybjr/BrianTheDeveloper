package brianthedeveloper.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello-world")
public class HelloWorldResource {

	@GetMapping(path = "hello")
	public String hello() {
		return "hello";
	}
}
