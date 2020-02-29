package cn.luoyuequan.mqerp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 库存清单
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("inventory")
@ApiModel(value="Inventory对象", description="库存清单")
public class Inventory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品id")
    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;

    @ApiModelProperty(value = "产品所属仓库id")
    @TableField("warehouse_id")
    private Integer warehouseId;

    @ApiModelProperty(value = "库存数量")
    @TableField("stock_quantity")
    private Integer stockQuantity;

    @ApiModelProperty(value = "库存产品冻结数量")
    @TableField("frozen_quantity")
    private Integer frozenQuantity;

    @ApiModelProperty(value = "库存此产品是否开启缺货通知,0关闭,1开启，个体性")
    @TableField("is_out_stock_notice")
    private Boolean outStockNotice;

    @ApiModelProperty(value = "乐观锁")
    @TableField("version")
    @Version
    private Long version;


}
