package jp.co.tis.tiscon4.common.code;

public enum MarriedType implements CodeEnum {

    /** 配偶者あり */
    MARRIED("1", "配偶者あり",""),
    /** 配偶者なし */
    UNMARRIED("0", "配偶者なし","");

    /** 配偶者有無のラベル */
    private final String label;
    /** 配偶者有無のコード */
    private final String code;
    /** 配偶者有無のカテゴリ */
    private final String category;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     * @param category カテゴリ
     */
    MarriedType(String code, String label, String category) {
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
