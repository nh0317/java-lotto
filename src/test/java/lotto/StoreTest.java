package lotto;

import lotto.domain.user.User;
import lotto.view.Store;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StoreTest {
    Store store = new Store();

    @Test
    @DisplayName("금액 입력 테스트")
    void getMoney(){
        System.out.println(store.sellingLotto());

        int money = Integer.parseInt("8000");
        User user = new User(money);

        assertThat(user.getMoney()).isEqualTo(money);
    }

    @Test
    @DisplayName("금액 입력 예외 테스트")
    void getMoneyException(){
        System.out.println(store.sellingLotto());

        int money = Integer.parseInt("8100");

        assertThatThrownBy(() -> new User(money))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
