package jp.co.tis.tiscon4.common.code;

public enum JobType implements CodeEnum {

    /** 経営自営 */
    MANAGER("経営自営", "経営・自営業","job"),
    /** 会社員 */
    EMPLOYEE("会社員", "会社員","job"),
    /** 契約派遣 */
    TEMPORARY("契約派遣", "契約・派遣社員","job"),
    /** 公務員 */
    PUBLICWORKER("公務員", "公務員","job"),
    /** 民間団体 */
    NGO("民間団体", "民間団体","job"),
    /** 主婦 */
    HOUSEWIFE("主婦", "主婦",""),
    /** 学生 */
    STUDENT("学生", "学生",""),
    /** 年金受給 */
    PENSIONER("年金受給", "年金受給者の方",""),
    /** パートアルバイト */
    PERTTIMEWORKER("パートアルバイト", "パート・アルバイト",""),
    /** 他有職 */
    EMPLOYED("他有職", "その他 (有職）","otherjob"),
    /** 他無職 */
    UNEMPLOYED("他無職", "その他 (無職）","");

    /** 職業のラベル */
    private final String label;
    /** 職業のコード */
    private final String code;
    /** 職業のカテゴリ */
    private final String category;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル]
     * @param category カテゴリ
     */
    JobType(String code, String label, String category) {
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
