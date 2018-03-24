package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public interface Account {
    void withdraw(long money) throws AccountException;
}
