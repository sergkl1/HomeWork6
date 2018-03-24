package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public class AccountConnectionException extends AccountException {

    public AccountConnectionException(String messsage) {
        super(messsage);
    }

    public AccountConnectionException(String message, Throwable cause) {
        super(message,cause);
    }
}
