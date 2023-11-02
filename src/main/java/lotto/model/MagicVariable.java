package lotto.model;

public enum MagicVariable {
    NUMBERS_SIZE(6),
    NUMBERS_MIN_RANGE(1),
    NUMBERS_MAX_RANGE(45),
    NON_PURCHASE_PRICE(0),
    LOTTO_PRICE(1000);

    private final int number;

    MagicVariable(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
