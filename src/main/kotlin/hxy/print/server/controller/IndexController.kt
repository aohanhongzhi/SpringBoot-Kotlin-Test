package hxy.print.server.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HtmlController {

    @GetMapping("/index")
    fun index(): String {
        return "index"
    }

}
