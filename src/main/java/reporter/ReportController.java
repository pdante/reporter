package reporter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pdante on 2015-03-14.
 */
@Controller
public class ReportController {

    @RequestMapping("/rep")
    public String report() {
        return "report";
    }
}