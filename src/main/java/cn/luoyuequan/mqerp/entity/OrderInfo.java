package cn.luoyuequan.mqerp.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单信息表
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("order_info")
@ApiModel(value="OrderInfo对象", description="订单信息表")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "订单id")
    @TableId(value = "order_id", type = IdType.AUTO)
    private Long orderId;

    @ApiModelProperty(value = "订单编号由日期+时间组成，精确到毫秒")
    @TableField("order_number")
    private String orderNumber;

    @ApiModelProperty(value = "订购日期")
    @TableField("order_date")
    private LocalDate orderDate;

    @ApiModelProperty(value = "收货地址")
    @TableField("shipping_address")
    private String shippingAddress;

    @ApiModelProperty(value = "客户id")
    @TableField("client_id")
    private Integer clientId;

    @ApiModelProperty(value = "预付金额")
    @TableField("prepayment_amount")
    private BigDecimal prepaymentAmount;

    @ApiModelProperty(value = "应付金额")
    @TableField("amounts_payable")
    private BigDecimal amountsPayable;

    @ApiModelProperty(value = "未付金额")
    @TableField("unpaid_amount")
    private BigDecimal unpaidAmount;

    @ApiModelProperty(value = "订单内产品信息，例如[{'product_id':1,'price':75.5,'quantity':5,'discount_percentage':5}]")
    @TableField("order_product_info")
    private String orderProductInfo;

    @ApiModelProperty(value = "订单类型(零售，批发)")
    @TableField("order_type")
    private String orderType;

    @ApiModelProperty(value = "销售人员id")
    @TableField("salesperson_id")
    private Integer salespersonId;

    @ApiModelProperty(value = "订单是否取消：0未取消，1已取消")
    @TableField("is_cancel")
    private Boolean cancel;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "乐观锁")
    @TableField("version")
    @Version
    private Long version;


}
