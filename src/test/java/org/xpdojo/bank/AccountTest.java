package org.xpdojo.bank;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    @Test
    public void depositAnAmountToIncreaseTheBalance() throws Exception {
         Account account = new Account();
         account.deposit(10);
         assertThat(account.balance()).isEqualTo(10);

         account.deposit(10);
         assertThat(account.balance()).isEqualTo(20);
    }

    @Test
    public void depositIntMax() throws Exception {
        Account account = new Account();
        account.deposit(Integer.MAX_VALUE);
        assertThat(account.balance()).isEqualTo(Integer.MAX_VALUE );

    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() throws Exception {
        Account account = new Account();
        account.deposit(10);
        account.withdraw(10);
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void checkZeroBalance() {
        Account account = new Account();
        assertThat(account.balance()).isEqualTo(0);
    }

    @Test
    public void withdrawInvalidAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Account account = new Account();
            account.withdraw(10);
        });
    }

    @Test
    public void depositInvalidAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Account account = new Account();
            account.deposit(-10);
        });
    }

}
