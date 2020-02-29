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
 * 产品款式风格
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("product_style")
@ApiModel(value="ProductStyle对象", description="产品款式风格")
public class ProductStyle implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "款式风格id")
    @TableId(value = "style_id", type = IdType.AUTO)
    private Integer styleId;

    @ApiModelProperty(value = "产品款式风格值，唯一")
    @TableField("style_value")
    private String styleValue;

    @ApiModelProperty(value = "排序号，默认0，由小到大降序，优先根据排序号，其次款式风格id")
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
