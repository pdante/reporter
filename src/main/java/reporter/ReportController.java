package reporter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Pdante on 2015-03-14.
 */
@Controller
public class ReportController {

    @RequestMapping(value = "/rep")
    public String home() {
        System.out.println("HomeController: Passing through...");
        return "webapp.WEB-INF/views/report.jsp";
    }
}
