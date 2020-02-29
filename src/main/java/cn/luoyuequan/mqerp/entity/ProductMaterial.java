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
 * 产品材质
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product_material")
@ApiModel(value="ProductMaterial对象", description="产品材质")
public class ProductMaterial implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "材质id")
    @TableId(value = "material_id", type = IdType.AUTO)
    private Integer materialId;

    @ApiModelProperty(value = "产品材质名称，唯一")
    @TableField("material_value")
    private String materialValue;

    @ApiModelProperty(value = "排序号，默认0，由小到大降序，优先根据排序号，其次材质id")
    @TableField("queue_number")
    private Integer queueNumber;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "0未删除,1已删除")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
