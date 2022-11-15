package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class Buyer {

    private Lottos lottos;
    private Money money;


    public String inputMoney() {
        return Console.readLine();
    }

    public void buyLottos(Lottos lottos) {
        this.lottos = lottos;
    }

    public Lottos getLottos() {
        return this.lottos;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    public int getMoney() {
        return this.money.getMoney();
    }

    public int getLottoCount() {
        return this.money.getLottoCount();
    }
}
