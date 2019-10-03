package hxy.print.server.controller

import hxy.print.server.bean.UserBean
import hxy.print.server.bean.response.BasicResponse
import hxy.print.server.service.UserService
import hxy.print.server.service.impl.UserServiceImpl
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class UserController {

    internal var log: Logger = LoggerFactory.getLogger(UserController::class.java)
    @Autowired
    var userService = UserServiceImpl()
    @PostMapping("login")
    @ResponseBody
    fun login(@RequestParam("username") userName: String, @RequestParam("password") passWord: String): BasicResponse {
        //查询数据库
        var userBean = UserBean();
        userBean.userName = userName
        userBean.passWord = passWord
        log.info("{}",userName)

        if (userService.login(userBean)){

        }else
        {

        }
        return  BasicResponse(1, "消息测试", userBean)
//        return basicResponse

    }
    @PostMapping("register")
    @ResponseBody
    fun register(@RequestParam("username") userName: String,@RequestParam("password") passWord: String,@RequestParam("tel") tel:String,@RequestParam("address") address:String):BasicResponse{
        var userBean = UserBean()
        userBean.address=address
        userBean.passWord=passWord
        userBean.userName=userName
        userBean.tel=tel


        return BasicResponse(200,"",userBean)
    }
}