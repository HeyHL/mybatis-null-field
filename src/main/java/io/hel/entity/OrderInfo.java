package io.hel.entity;

import lombok.Data;

import java.util.Date;

/**
 * helei
 * 2021/12/1 10:52
 * description:
 */
@SuppressWarnings("all")
@Data
public class OrderInfo {
    private Integer id;

    private String orderId;

    private String orderName;

    private Date createTime;

    private Integer orderStatus;

    private String orderDetail;
}
