package io.hel.mapper;

import io.hel.entity.OrderInfo;
import org.apache.ibatis.annotations.Param;

/**
 * helei
 * 2021/12/1 10:52
 * description:
 */
@SuppressWarnings("all")
public interface OrderInfoMapper {
    OrderInfo selectById(@Param("id") int id);
}
