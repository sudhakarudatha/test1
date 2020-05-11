package hellok8s.hellok8s.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.seec.insurance;

@RestController
public class DockerController {

	@GetMapping("/hello")
	public String getMyName() {
		
		return "Welcome to K8s application";
	}
}
