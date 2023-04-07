package com.montrell.codingnomadSpringInitializr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StatusController {

    private final StatusService statusService;

    //This has to happen. It's like empathy...Code EMPATHY. Getting another's point of view
    public StatusController(StatusService statusService) {//putting on the shoes of another man-- ;) to call his methods
        this.statusService = statusService;
    }

    @GetMapping("/arrival")
    public String sayHello () {
        return statusService.processStatus(true);
    }

    @GetMapping("/departure")
    public String sayGoodbye () {
        return statusService.processStatus(false);
    }
}
