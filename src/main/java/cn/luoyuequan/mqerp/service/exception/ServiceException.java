package cn.luoyuequan.mqerp.service.exception;

import cn.luoyuequan.mqerp.common.BaseException;

/**
 * <p>
 * service层 异常类
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 18:44
 */
public class ServiceException extends BaseException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }

    public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
