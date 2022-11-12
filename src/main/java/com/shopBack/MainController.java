package com.shopBack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Vladislav Domaniewski
 */

@Controller
public class MainController {

    @RequestMapping("/up")
    public String mainCOnt() {
        return "index";
    }
}
