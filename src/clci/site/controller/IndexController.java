package clci.site.controller;

import clci.site.entities.CiLysy;
import clci.site.repositories.interfaces.LysyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by fly on 2016/10/8.
 */

@Controller
public class IndexController {
    @Inject
    private LysyRepository lysyRepository;

    @ResponseBody
    @RequestMapping(value = "/test", params = {"name"})
    public CiLysy helloName(@RequestParam("name") String name) {
       CiLysy lysy = lysyRepository.get("11A001199801001");
        System.out.println();
        return lysy;
    }
}
