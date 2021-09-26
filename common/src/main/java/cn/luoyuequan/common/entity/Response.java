package cn.luoyuequan.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author luoyuequan
 * @date 2021.9.25
 */
@Data
@Builder
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Response {
    private Integer code;
    private String msg;
    private Object data;
}
