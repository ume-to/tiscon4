package jp.co.tis.tiscon4.common.code;

public enum GenderType implements CodeEnum {

    /** 男性 */
    MALE("male", "男性", ""),
    /** 女性 */
    FEMALE("female", "女性", "");

    /** 性別のラベル */
    private final String label;
    /** 性別のコード */
    private final String code;
    /** 性別のカテゴリ */
    private final String category;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     * @param category カテゴリ
     */
    GenderType(String code, String label, String category) {
        this.label = label;
        this.code = code;
        this.category = category;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getCategory() {
        return category;
    }
}
