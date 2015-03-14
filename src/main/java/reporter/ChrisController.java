package reporter;

/**
 * Created by Chris on 15-03-14.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


    @Controller
    @RequestMapping("/chris")
    public class ChrisController{

        @RequestMapping(method = RequestMethod.GET)
        public String mapShit(Modelmap model) {
            model.addAttribute("chris", "this is a chris");
            model.addAttribute("message", "this is a message");
            return "goddamnit";
        }

    }

