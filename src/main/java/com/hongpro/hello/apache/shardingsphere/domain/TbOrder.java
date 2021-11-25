package com.hongpro.hello.apache.shardingsphere.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * tb_order_0
 * @author 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TbOrder implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer orderId;

    private static final long serialVersionUID = 1L;
}