package biz.olivight.controller.offshore;

import biz.olivight.model.organisation.Organisation;
import biz.olivight.model.utility.StatisticsExtension;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class OffshoreController {

    @RequestMapping("explore")
    public String show_on_explore(Model model) {
        StatisticsExtension.update();
        model.addAttribute("organisation",new Organisation());
        model.addAttribute("census",StatisticsExtension.get_statistics());
        return "webapp/explorer/explorer";
    }

}
