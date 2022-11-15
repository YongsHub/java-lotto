package lotto.service;

import lotto.Lotto;
import lotto.domain.NumberGenerator;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LottoService {
    public NumberGenerator numberGenerator;
    public static final int STANDARD_WON = 1000;
    public static final int ZERO_WON = 0;
    public static final String NOT_MOD_ZERO_MESSAGE = "[ERROR] 1000으로 나누어지는 금액이 아닙니다.";
    public static final String REJECT_ZERO = "[ERROR] 구입 금액에 0을 입력할 수 없습니다.";
    public static final String REJECT_NOT_NUMBERS = "[ERROR] 구입 금액에 숫자를 제외한 다른 입력이 올 수 없습니다.";
    
    public LottoService() {
        this.numberGenerator = new NumberGenerator();
    }

    public void validateMoney(int money) {
        if(Math.floorMod(Math.round(money), STANDARD_WON) != 0) { throw new IllegalArgumentException(NOT_MOD_ZERO_MESSAGE); }
    }

    public void validateConsistOfNumbers(String input) {
        boolean result = Pattern.matches("^[0-9]*$", input);
        if(!result) { throw new IllegalArgumentException(REJECT_NOT_NUMBERS); }
    }

    public void validateMoneyZero(int money) {
        if(money == ZERO_WON) { throw new IllegalArgumentException(REJECT_ZERO); }
    }

    public List<Lotto> publishLotto(int cnt) {
        return IntStream.range(0, cnt)
                .mapToObj(i -> new Lotto(this.numberGenerator.createDuplicateNumbers()))
                .collect(Collectors.toList());
    }
}
