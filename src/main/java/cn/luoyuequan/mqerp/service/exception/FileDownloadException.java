package cn.luoyuequan.mqerp.service.exception;

/**
 * <p>
 * 文件下载异常类
 * </p>
 *
 * @author luoyuequan
 * @date 2020/02/25
 * @time 19:22
 */
public class FileDownloadException extends ServiceException {
    public FileDownloadException() {
    }

    public FileDownloadException(String message) {
        super(message);
    }

    public FileDownloadException(String message, Throwable cause) {
        super(message, cause);
    }

    public FileDownloadException(Throwable cause) {
        super(cause);
    }

    public FileDownloadException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
