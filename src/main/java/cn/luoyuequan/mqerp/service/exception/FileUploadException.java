package cn.luoyuequan.mqerp.service.exception;

/**
 * <p>
 * 文件上传异常类
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 19:20
 */
public class FileUploadException extends ServiceException {
    public FileUploadException() {
    }

    public FileUploadException(String message) {
        super(message);
    }

    public FileUploadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileUploadException(Throwable cause) {
        super(cause);
    }

    public FileUploadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
