package cn.luoyuequan.mqerp.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @author luoyuequan
 * @date 2020/01/05
 * @time 下午 04:49
 */
@Component
public class TimeFieldFillConfig implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        /*
         * do nothing
         * */
    }

    /**
     * 执行update语句时，并同时修改"updateTime"
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        // TODO: 2020/02/25 待检查，自动修改的时间是否成功
///        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
///        formatter.format(now);
        this.setFieldValByName("updateTime", now, metaObject);
    }
}
