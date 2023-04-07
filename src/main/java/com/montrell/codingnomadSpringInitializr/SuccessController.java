package com.montrell.codingnomadSpringInitializr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class SuccessController {
    private final SuccessService successService;

    public SuccessController(SuccessService successService) {
        this.successService = successService;
    }

    @GetMapping("/success")
    public String saySuccess() {
        return successService.processSuccessStatus(true);
    }
}
