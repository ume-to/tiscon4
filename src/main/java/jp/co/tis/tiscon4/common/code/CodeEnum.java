package jp.co.tis.tiscon4.common.code;

/**
 * コード値を定義したEnumが実装するインタフェース。
 */
public interface CodeEnum {
    /**
     * ラベルを返却する。
     *
     * @return ラベル
     */
    String getLabel();

    /**
     * コード値を返却する。
     *
     * @return コード値
     */
    String getCode();

    /**
     * カテゴリを返却する。
     *
     * @return カテゴリ
     */
    String getCategory();

}