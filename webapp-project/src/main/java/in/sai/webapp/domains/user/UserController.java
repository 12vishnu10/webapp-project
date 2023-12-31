package in.sai.webapp.domains.user;

import java.util.Date;

import javax.inject.Inject;

import io.weblith.core.request.RequestContext;
import io.weblith.core.router.annotations.Controller;
import io.weblith.core.router.annotations.Get;
import io.weblith.freemarker.response.HtmlResult;
import io.weblith.freemarker.template.FreemarkerTemplate;

@Controller
public class UserController {

    @Inject
    RequestContext context;
    
    @Inject
    FreemarkerTemplate list;

    @Get
    public HtmlResult list() {
        
        String lastVisit = context.session().get("last-visit");
        context.session().put("last-visit", new Date().toString());
        
        return list.render("Users", User.listAll());
    }

}
