package com.jt.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Auther WangHai
 * @Date 2019/12/9
 * @Describle what
 */
@Data
@TableName("tb_order_item")
@Accessors(chain = true)
public class OrderItem extends BasePojo {
    @TableId
    private String itemId;

    @TableId
    private String orderId;

    private Integer num;

    private String title;

    private Long price;

    private Long totalFee;

    private String picPath;
}
