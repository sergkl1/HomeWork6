package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public class AccountExpiredException extends AccountException {

    public AccountExpiredException(String messsage) {
        super(messsage);
    }

    public AccountExpiredException(String message, Throwable cause) {
        super(message,cause);
    }
}
