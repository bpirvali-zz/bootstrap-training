package com.bp.samples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by behzad.pirvali on 12/5/16.
 */
@Controller
public class HomeController {

    @RequestMapping(value = {"/", "index", "index.html"})
    public String index() { return "index"; }

    @RequestMapping(value = {"about", "about.html"})
    public String about() { return "about"; }

    @RequestMapping(value = {"contact", "contact.html"})
    public String contact() { return "contact"; }

    @RequestMapping(value = "/bootstrap-test")
    public String bootstrapTest() { return "bootstrap-test"; }

}
