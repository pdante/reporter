package reporter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.ModelMap;


/**
 * Created by Pdante on 2015-03-14.
 */
@Controller
@RequestMapping("/rep")
public class RepController{

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(Modelmap model) {
        model.addAttribute("message", "this is a message that chris made");
        return "chris's hello";
    }

}


