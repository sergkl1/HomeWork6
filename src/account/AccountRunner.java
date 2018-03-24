package account;

/**
 * Created by sergey.kliepikov on 3/23/18.
 */
public class AccountRunner {

    public static void main(String[] args) {

        RandomAccount randomAccount = new RandomAccount(3000, 0.2, 0.3, 0.4);
        ConnectionRetryAccount connectionRetryAccount = new ConnectionRetryAccount(randomAccount, 5);

        try {
            connectionRetryAccount.withdraw(1000);
        } catch (NotEnoughFundsException e) {
            System.out.println("Not enough money");
            System.exit(-1);
        } catch (AccountExpiredException e) {
            System.out.println("Account has expired");
            System.exit(-1);
        } catch (AccountException e) {
        }

        System.out.println("Money are not withdrawn: " + randomAccount.getMoney());

    }
}
