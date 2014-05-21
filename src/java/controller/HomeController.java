package controller;

import util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    //bien lay duong dan tra ve cho view
    final ViewPath viewPath = new ViewPath();

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(ModelMap m) {

        //Duong dan toi view (key de mac dinh la viewname).
        m.put("viewTitle", "Home");//Tieu de cua trang
        m.put("viewName", "home/index");//Duong dan toi trang
        return "share/layout_guest";
    }

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(ModelMap m) {

        //Duong dan toi view (key de mac dinh la viewname).
        m.put("viewTitle", "Admin");//Tieu de cua trang
        m.put("viewName", "home/index");//Duong dan toi trang
        return viewPath.getAdminLayout();
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String user(ModelMap m) {

        //Duong dan toi view (key de mac dinh la viewname).
        m.put("viewTitle", "User");//Tieu de cua trang
        m.put("viewName", "home/index");//Duong dan toi trang
        return viewPath.getUserLayout();
    }
}
