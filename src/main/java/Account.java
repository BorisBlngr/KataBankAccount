public class Account {
    private Money money;

    Account(Money money) {
        this.money = money;
    }

    void deposit(Money money) {

        this.money = money.add(this.money);
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        return money != null ? money.equals(account.money) : account.money == null;

    }

    @Override
    public int hashCode() {
        return money != null ? money.hashCode() : 0;
    }
}
