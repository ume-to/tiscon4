package jp.co.tis.tiscon4.common.code;

public enum InsuranceType implements CodeEnum {

    /** Treat */
    TREAT("treat", "treat", ""),
    /** TreatLady */
    TREATLADY("treatLady", "treatLady", ""),
    /** Future */
    FUTURE("future", "future", "");

    /** 保険タイプのラベル */
    private final String label;
    /** 保険タイプのコード */
    private final String code;
    /** 保険タイプのカテゴリ */
    private final String category;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     * @param category カテゴリ
     */
    InsuranceType(String code, String label, String category) {
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
