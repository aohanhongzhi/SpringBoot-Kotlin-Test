package hxy.print.server.service

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import hxy.print.server.bean.UserBean
import org.springframework.stereotype.Service

@Service
interface UserService {
    fun findUserById(userId: String): UserBean;

}