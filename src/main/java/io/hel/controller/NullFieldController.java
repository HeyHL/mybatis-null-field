package io.hel.controller;

import cn.hutool.core.exceptions.ExceptionUtil;
import io.hel.entity.OrderInfo;
import io.hel.mapper.OrderInfoMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * helei
 * 2021/12/1 10:53
 * description:
 */
@SuppressWarnings("all")
@RestController
@Slf4j
public class NullFieldController {

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @PostMapping(value = "testNullFiled")
    public OrderInfo testNullFiled() {
        OrderInfo orderInfo = null;
        try {
            orderInfo = orderInfoMapper.selectById(1);
            log.info("######NullFieldController.testNullFiled.orderInfo->{}", orderInfo);
            log.info("######NullFieldController.testNullFiled.orderInfo.detail->{}", orderInfo.getOrderDetail());
        } catch (NullPointerException e) {
            log.error("########NullFieldController.testNullFiled.exception->{}",  ExceptionUtil.stacktraceToString(e));
        }
        return orderInfo;
    }
}
