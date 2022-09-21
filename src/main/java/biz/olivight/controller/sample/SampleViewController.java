package biz.olivight.controller.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("view")
public class SampleViewController {

    @RequestMapping("demo")
    public String showIndex() {
        return "../sample/sample";
    }

    
}