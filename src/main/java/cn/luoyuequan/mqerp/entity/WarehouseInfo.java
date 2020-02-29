package cn.luoyuequan.mqerp.entity;

import java.math.BigDecimal;
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
 * 仓库信息表
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("warehouse_info")
@ApiModel(value="WarehouseInfo对象", description="仓库信息表")
public class WarehouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "仓库id")
    @TableId(value = "warehouse_id", type = IdType.AUTO)
    private Integer warehouseId;

    @ApiModelProperty(value = "仓库编号")
    @TableField("warehouse_number")
    private String warehouseNumber;

    @ApiModelProperty(value = "仓库管理员id")
    @TableField("manager_id")
    private Integer managerId;

    @ApiModelProperty(value = "仓库面积")
    @TableField("area")
    private BigDecimal area;

    @ApiModelProperty(value = "仓库位置")
    @TableField("warehouse_address")
    private String warehouseAddress;

    @ApiModelProperty(value = "设置库存产品量低谷值提示，-1关闭提示,全局性")
    @TableField("notice_minimum")
    private Integer noticeMinimum;

    @ApiModelProperty(value = "设置库存产品量低估值警告，-1关闭警告，全局性")
    @TableField("warn_minimum")
    private Integer warnMinimum;

    @ApiModelProperty(value = "仓库描述")
    @TableField("note")
    private String note;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @ApiModelProperty(value = "仓库是否关闭：0未关闭，1已关闭")
    @TableField("is_close")
    private Boolean close;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
