package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public class NotEnoughFundsException extends AccountException {

    public NotEnoughFundsException(String message) {
        super(message);
    }

    public NotEnoughFundsException(String message, Throwable cause) {
        super(message,cause);
    }
}
