package com.bp.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by behzad.pirvali on 12/5/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index(
            @RequestParam(value="name", required=false, defaultValue="User") String name,
            Model model) {
        model.addAttribute("name", name);
        return "index";
    }
    @RequestMapping(value = "/bootstrap-test")
    public String bootstrapTest(
            @RequestParam(value="name", required=false, defaultValue="User") String name,
            Model model) {
        if (name!=null)
            model.addAttribute("name", name);
        return "bootstrap-test";
    }
}
