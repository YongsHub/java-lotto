package lotto.domain;

import camp.nextstep.edu.missionutils.Console;

public class Buyer {

    private Lottos lottos;


    public String inputMoney() {
        return Console.readLine();
    }

    public void buyLottos(Lottos lottos) {
        this.lottos = lottos;
    }
}
