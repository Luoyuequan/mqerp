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
 * 职工
 * </p>
 *
 * @author luoyuequan
 * @since 2020-02-26
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("staff")
@ApiModel(value="Staff对象", description="职工")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "staff_id", type = IdType.AUTO)
    private Integer staffId;

    @ApiModelProperty(value = "职工名字")
    @TableField("staff_name")
    private String staffName;

    @TableField("staff_gender")
    private String staffGender;

    @ApiModelProperty(value = "职工电话")
    @TableField("staff_tel")
    private String staffTel;

    @ApiModelProperty(value = "职工邮件")
    @TableField("staff_email")
    private String staffEmail;

    @ApiModelProperty(value = "职工居住地址")
    @TableField("staff_address")
    private String staffAddress;

    @ApiModelProperty(value = "职工所属部门id")
    @TableField("dept_id")
    private Integer deptId;

    @TableField("is_deleted")
    @TableLogic
    private Boolean deleted;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;


}
