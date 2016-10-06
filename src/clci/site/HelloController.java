package clci.site;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

@Controller
public class HelloController {

    @Inject
    private GreetingService greetingService;

    @ResponseBody
    @RequestMapping(value = "/test", params = {"name"})
    public String helloName(@RequestParam("name") String name) {
        return this.greetingService.getGreeting(name);
    }

}
