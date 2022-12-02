package cz.czechitas.java2webapps.ukol7.controller;

import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import service.PostService;

import java.awt.print.Pageable;

@Controller
public class PostController {
    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ModelAndView uvodniStranka (@PageableDefault() Pageable pageable) {
        return new ModelAndView("stranka")
                .addObject("stranka", service.seznamPrispevku(pageable));
    }
}
