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
 * 产品种类/类型
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product_category")
@ApiModel(value="ProductCategory对象", description="产品种类/类型")
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "产品类型id")
    @TableId(value = "category_id", type = IdType.AUTO)
    private Integer categoryId;

    @ApiModelProperty(value = "产品上级分类id，默认0根级别")
    @TableField("category_p_id")
    private Integer categoryPId;

    @ApiModelProperty(value = "产品种类名称，唯一性")
    @TableField("category_name")
    private String categoryName;

    @ApiModelProperty(value = "排序号，默认0，由小到大降序，优先根据排序号，其次种类id")
    @TableField("queue_number")
    private Integer queueNumber;

    @ApiModelProperty(value = "产品种类/类型图片访问路径")
    @TableField("category_img")
    private String categoryImg;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "0未删除,1已删除")
    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;


}
