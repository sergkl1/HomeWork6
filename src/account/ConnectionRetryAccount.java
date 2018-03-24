package account;

/**
 * Created by sergey.kliepikov on 3/22/18.
 */
public class ConnectionRetryAccount implements Account {

    private final Account account;
    private final int retries;

    public ConnectionRetryAccount(Account account, int retries) {
        this.account = account;
        this.retries = retries;
    }


    @Override
    public void withdraw(long money) throws AccountException {
        int numberOfAttempts = 0;
        while (numberOfAttempts < retries) {
            try {
                account.withdraw(money);
            } catch (AccountConnectionException e) {
                numberOfAttempts++;
                if (numberOfAttempts == retries) {
                    System.out.println("Bad connection");
                }
            }
        }

    }
}
