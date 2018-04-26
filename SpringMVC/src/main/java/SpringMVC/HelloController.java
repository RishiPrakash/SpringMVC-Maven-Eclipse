package SpringMVC;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

@RequestMapping("/hello")
public ModelAndView sayHelloMethod(){
System.out.println("I am inside sayHelloMethod");
ModelAndView mnv = new ModelAndView();
mnv.setViewName("sayHello");
Actor actor = new Actor();
actor.setname("Shahrukh Khan");
actor.setfavMovie("DDLJ");
mnv.addObject("Actor", actor);
//Alternatively we could have written return new ModelAndView("hellopage", "message", message);
return mnv;

}

}


