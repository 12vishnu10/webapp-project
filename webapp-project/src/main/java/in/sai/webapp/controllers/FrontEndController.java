package in.sai.webapp.controllers;

import io.weblith.core.router.annotations.Controller;
import io.weblith.core.router.annotations.Get;
import io.weblith.freemarker.response.HtmlResult;

@Controller("")
public class FrontEndController {

    @Get("/")
    public HtmlResult home() {
        return new HtmlResult("Main", "home");
    }

}
