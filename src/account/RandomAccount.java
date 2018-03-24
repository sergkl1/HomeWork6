package account;

/**
 * Created by sergey.kliepikov on 3/23/18.
 */
public class RandomAccount implements Account {

    private long money;
    private final double notEnoughFundsProbability;
    private final double accountExpiredProbability;
    private final double lostConnectionProbability;

    public RandomAccount(long money, double notEnoughFundsProbability, double accountExpiredProbability, double lostConnectionProbability) {
        this.money = money;
        this.notEnoughFundsProbability = notEnoughFundsProbability;
        this.accountExpiredProbability = accountExpiredProbability;
        this.lostConnectionProbability = lostConnectionProbability;
    }


    @Override
    public void withdraw(long money) throws AccountException {
        double n = Math.random();
        if (0 <= n && n <= notEnoughFundsProbability) {
            throw new NotEnoughFundsException("Not enough money: " + money);
        }
        else if (notEnoughFundsProbability < n && n < notEnoughFundsProbability + accountExpiredProbability) {
            throw new AccountExpiredException("Account has expired");
        }
        else if (notEnoughFundsProbability + accountExpiredProbability < n && n < notEnoughFundsProbability + accountExpiredProbability + lostConnectionProbability) {
            throw new AccountConnectionException("Please try again later");
        }
        else {
            this.money -= money;
            System.out.println("Successful operation. Money left: " + this.money);
            System.exit(-1);
        }
    }

    public long getMoney() {
        return money;
    }
}
