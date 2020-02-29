package cn.luoyuequan.mqerp.entity;

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
 * 货运单信息
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("freight_info")
@ApiModel(value="FreightInfo对象", description="货运单信息")
public class FreightInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "freight_id", type = IdType.AUTO)
    private Long freightId;

    @ApiModelProperty(value = "货运单编号由日期+时间组成，date_format(now(3),'%Y%m%d%H%i%s%f')精确到毫秒")
    @TableField("freight_number")
    private String freightNumber;

    @ApiModelProperty(value = "货运单内产品信息，例如[{'product_id':1,'quantity':5}]")
    @TableField("product_info")
    private String productInfo;

    @ApiModelProperty(value = "客户id")
    @TableField("client_id")
    private Integer clientId;

    @ApiModelProperty(value = "订单编号")
    @TableField("order_number")
    private String orderNumber;

    @ApiModelProperty(value = "物流中心id")
    @TableField("logistics_center_id")
    private Integer logisticsCenterId;

    @ApiModelProperty(value = "货运单收货地址【优先依据】订单收货地址，可二次更改")
    @TableField("shipping_address")
    private String shippingAddress;

    @ApiModelProperty(value = "发货日期")
    @TableField("shipping_date")
    private LocalDate shippingDate;

    @ApiModelProperty(value = "货运单是否已删除：0未，1已")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @ApiModelProperty(value = "货运单是否已取消：0未，1已")
    @TableField("is_cancel")
    private Boolean cancel;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "乐观锁")
    @TableField("version")
    @Version
    private Long version;


}
