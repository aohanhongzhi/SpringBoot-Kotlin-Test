package hxy.print.server.service.impl

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import hxy.print.server.bean.UserBean
import hxy.print.server.service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService{

    override fun findUserById(userId: String): UserBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun login(userBean1: UserBean): Boolean {
        //查询数据库比较两者是否相等


        return false
    }

    fun getToken(userBean1: UserBean): String {
        var token = "";
        token = JWT.create().withAudience(userBean1.id.toString())
                .sign(Algorithm.HMAC256(userBean1.passWord));
        return token;
    }
}