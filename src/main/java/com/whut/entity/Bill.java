package com.whut.entity;

import lombok.*;

import java.util.Date;

/**
 * 账单实体类
 * */
@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bill {

    /** 账单主键id */
    private Integer id;

    /** 账单创建时间 */
    private Date createTime;

    /** 账单总价 */
    private Double totalPrice;

    /** 账单编码 */
    private String code;

    /** 外键：售货员id */
    private Integer user_id;


}
