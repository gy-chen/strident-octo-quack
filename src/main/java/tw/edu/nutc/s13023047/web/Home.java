package tw.edu.nutc.s13023047.web;

import javax.servlet.http.Part;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;

@Controller
@RequestMapping(path="/")
public class Home {

	@RequestMapping(method=RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String home(@RequestPart("yourimage") Part yourimage, String yourname, Model model) {
		System.out.println(yourimage.getName());
		model.addAttribute("yourname", yourname);
		return "home";
	}
}
