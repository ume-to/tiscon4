package jp.co.tis.tiscon4.common.code;

public enum TreatedType implements CodeEnum {

    /** 治療歴あり */
    TREATED("1", "はい","show"),
    /** 治療歴なし */
    UNTREATED("0", "いいえ","hide");

    /** 治療歴有無のラベル */
    private final String label;
    /** 治療歴有無のコード */
    private final String code;
    /** 治療歴有無のカテゴリ */
    private final String category;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     * @param category カテゴリ
     */
    TreatedType(String code, String label, String category) {
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
