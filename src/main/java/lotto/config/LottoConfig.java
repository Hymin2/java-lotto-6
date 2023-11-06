package lotto.config;

public enum LottoConfig {
    LOTTO_BUYING_UNIT(1000),

    LOTTO_NUMBER_SIZE(6),
    LOTTO_NUMBER_MIN_VALUE(1),
    LOTT0_NUMBER_MAX_VALUE(45),

    LOTTO_FIRST_PRIZE(2000000000),
    LOTTO_SECOND_PRIZE(30000000),
    LOTTO_THIRD_PRIZE(1500000),
    LOTTO_FOURTH_PRIZE(50000),
    LOTTO_FIFTH_PRIZE(5000);

    private int value;

    LottoConfig(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
