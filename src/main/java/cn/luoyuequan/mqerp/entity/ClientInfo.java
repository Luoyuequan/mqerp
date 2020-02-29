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
 * 客户信息表
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("client_info")
@ApiModel(value="ClientInfo对象", description="客户信息表")
public class ClientInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "client_id", type = IdType.AUTO)
    private Integer clientId;

    @ApiModelProperty(value = "客户名字")
    @TableField("client_name")
    private String clientName;

    @ApiModelProperty(value = "客户性别")
    @TableField("client_gender")
    private String clientGender;

    @ApiModelProperty(value = "客户电话")
    @TableField("client_tel")
    private String clientTel;

    @ApiModelProperty(value = "客户默认收货地址")
    @TableField("client_default_address")
    private String clientDefaultAddress;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
