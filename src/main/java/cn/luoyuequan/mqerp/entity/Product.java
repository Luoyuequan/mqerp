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
 * 产品
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product")
@ApiModel(value="Product对象", description="产品")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "product_id", type = IdType.AUTO)
    private Long productId;

    @ApiModelProperty(value = "产品型号")
    @TableField("product_model")
    private String productModel;

    @ApiModelProperty(value = "种类/类型id")
    @TableField("category_id")
    private Integer categoryId;

    @TableField("color_id")
    private Integer colorId;

    @TableField("size_id")
    private Integer sizeId;

    @ApiModelProperty(value = "材质id，0无")
    @TableField("material_id")
    private Integer materialId;

    @ApiModelProperty(value = "款式风格id，0无")
    @TableField("style_id")
    private Integer styleId;

    @ApiModelProperty(value = "产品展示图片访问路径")
    @TableField("product_img")
    private String productImg;

    @ApiModelProperty(value = "产品零售价")
    @TableField("retail_price")
    private BigDecimal retailPrice;

    @ApiModelProperty(value = "产品批发价")
    @TableField("wholesale_price")
    private BigDecimal wholesalePrice;

    @ApiModelProperty(value = "0不可定制,1可定制")
    @TableField("is_custom_made")
    private Boolean customMade;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
