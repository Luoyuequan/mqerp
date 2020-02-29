package cn.luoyuequan.mqerp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * 物流中心
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("logistics_center")
@ApiModel(value="LogisticsCenter对象", description="物流中心")
public class LogisticsCenter implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "logistics_center_id", type = IdType.AUTO)
    private Integer logisticsCenterId;

    @TableField("logistics_center_name")
    private String logisticsCenterName;

    @TableField("logistics_center_address")
    private String logisticsCenterAddress;

    @ApiModelProperty(value = "途径范围：例如['成都','北京']")
    @TableField("route_range")
    private String routeRange;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
