package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public class AccountException extends Exception {
    public AccountException(String messsage) {
        super(messsage);
    }

    public AccountException(String message, Throwable cause) {
        super(message,cause);
    }
}
