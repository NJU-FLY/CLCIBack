package clci.site.controller;

import clci.site.entities.CiLysy;
import clci.site.repositories.interfaces.LysyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;
import java.util.List;

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
//       List<CiLysy> lysy = lysyRepository.groupByRegion();
        System.out.println();
        lysyRepository.test(new CiLysy());
        return new CiLysy();
    }
}
