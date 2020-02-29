package cn.luoyuequan.mqerp.common;

/**
 * <p>
 * base exception
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 18:24
 */
public class BaseException extends Throwable {
    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }

    public BaseException(Throwable cause) {
        super(cause);
    }

    public BaseException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
