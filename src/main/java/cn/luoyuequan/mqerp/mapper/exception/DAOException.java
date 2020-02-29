package cn.luoyuequan.mqerp.mapper.exception;

import cn.luoyuequan.mqerp.common.BaseException;

/**
 * <p>
 * dao层 异常类
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 18:44
 */
public class DAOException extends BaseException {
    public DAOException() {
    }

    public DAOException(String message) {
        super(message);
    }

    public DAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public DAOException(Throwable cause) {
        super(cause);
    }

    public DAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
