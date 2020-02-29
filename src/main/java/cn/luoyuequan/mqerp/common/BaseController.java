package cn.luoyuequan.mqerp.common;

import java.io.Serializable;

/**
 * <p>
 * base controller
 * M：Entity
 * K：ID
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 17:31
 */
public abstract class BaseController<M, K extends Serializable> {

//    public

    public VO get(M m) {
        return null;
    }

    public VO list() {
        return null;
    }

    public VO save(M m) {
        return null;
    }

    public VO update(M t) {
        return null;
    }

    public VO delete(M t) {
        return null;
    }
}
