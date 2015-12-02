package tw.edu.nutc.s13023047.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/")
public class Home {

	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String home(String yourname, Model model) {
		model.addAttribute("yourname", yourname);
		return "home";
	}
}
