package hxy.print.server.bean

import java.sql.Timestamp

class OrderBean(
        var id: Int,
        var orderId: String,
        var userId: Int,
        var fileName: String,
        var filePath: String,
        var pageNumber: Int,
        var paperNumber:Int,
        var documentType: Int,
        var instruct: String,
        var status: Int,
        var createTime: Timestamp,
        var updateTime: Timestamp,
        var shopId:Int,
        var payBool:Int
)