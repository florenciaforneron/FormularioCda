package cda.practica.myrest1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping; 


@Controller
public class MyRest1Controller {
	
	  
	
	
	@GetMapping("/usuario")
	public String greetingForm(Model model) {
		model.addAttribute("usuario", new Users());
		return "usuario";
	}

	@PostMapping("/usuario")
	public String greetingSubmit(@ModelAttribute Users greeting) {
		return "usuario";
	}
	
	  @DeleteMapping("/{userId}")
	    public String deleteUser(@PathVariable String userId)
	    {
	    
	    	System.out.println("borro");
	     return "HTTP DELETE was called";
	    }

	    @PutMapping("/{userId}")
//	    public String updateUser(@PathVariable String userId, @RequestBody UserDetailsRequestModel requestUserDetails)
	    public String updateUser(@PathVariable String userId)
	    {
	    
	    	System.out.println("put");
	     
	     return "HTTP PUT was called";
	    }
	
	
		
}

