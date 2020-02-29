package cn.luoyuequan.mqerp.manager.exception;

import cn.luoyuequan.mqerp.common.BaseException;

/**
 * <p></p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 18:45
 */
public class ManagerException extends BaseException {
    public ManagerException() {
    }

    public ManagerException(String message) {
        super(message);
    }

    public ManagerException(String message, Throwable cause) {
        super(message, cause);
    }

    public ManagerException(Throwable cause) {
        super(cause);
    }

    public ManagerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
