package jp.co.tis.tiscon4.form;

import jp.co.tis.tiscon4.common.code.JobType;
import jp.co.tis.tiscon4.common.code.TreatedType;
import jp.co.tis.tiscon4.common.code.IndustryType;
import nablarch.core.util.StringUtil;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 漢字 （姓） */
    @Required
    @Domain("kanjiName")
    private String kanjiFamilyName;

    /** 漢字 （名） */
    @Required
    @Domain("kanjiName")
    private String kanjiFirstName;

    /** カナ氏名（姓） */
    @Required
    @Domain("kanaName")
    private String kanaFamilyName;

    /** カナ氏名（名） */
    @Required
    @Domain("kanaName")
    private String kanaFirstName;

    /** 英字氏名（姓） */
    @Required
    @Domain("alphabetName")
    private String alphabetFamilyName;

    /** 英字氏名（名） */
    @Required
    @Domain("alphabetName")
    private String alphabetFirstName;

    /** 性別 */
    @Required
    @Domain("gender")
    private String gender;

    /** 生年月日 */
    @Required
    @Domain("dateOfBirthyear")
    private String dateOfBirthyear;

    /** 生年月日 */
    @Required
    @Domain("dateOfBirthmonth")
    private String dateOfBirthmonth;

    /** 生年月日 */
    @Required
    @Domain("dateOfBirthday")
    private String dateOfBirthday;

    /** 郵便番号 */
    @Required
    @Domain("zipCode")
    private String zipCode;

    /** 住所 */
    @Required
    @Domain("address")
    private String address;

    /** 自宅電話番号 */
    @Required
    @Domain("homePhoneNumber")
    private String homePhoneNumber;

    /** 携帯電話番号 */
    @Required
    @Domain("mobilePhoneNumber")
    private String mobilePhoneNumber;

    /** メールアドレス */
    @Required
    @Domain("emailAddress")
    private String emailAddress;

    /** 配偶者有無 */
    @Required
    @Domain("married")
    private String married;

    /** 所得金額 */
    @Required
    @Domain("income")
    private String income;

    /** 職業 */
    @Required
    @Domain("job")
    private String job;

    /** その他の職業 */
    @Domain("otherJob")
    private String otherJob;

    /** 治療歴有無 */
    @Required
    @Domain("treated")
    private String treated;

    /** 既往歴 */
    @Domain("medicalHistory")
    private String medicalHistory;

    /** 勤務先 */
    @Domain("employerName")
    private String employerName;

    /** 勤務先郵便番号 */
    @Domain("employerZipCode")
    private String employerZipCode;

    /** 勤務先住所 */
    @Domain("employerAddress")
    private String employerAddress;

    /** 勤務先電話番号 */
    @Domain("employerPhoneNumber")
    private String employerPhoneNumber;

    /** 業種 */
    @Domain("industryType")
    private String industryType;

    public String getKanjiFamilyName() {
        return kanjiFamilyName;
    }

    public void setKanjiFamilyName(String kanjiFamilyName) {
        this.kanjiFamilyName = kanjiFamilyName;
    }

    public String getKanjiFirstName() {
        return kanjiFirstName;
    }

    public void setKanjiFirstName(String kanjiFirstName) {
        this.kanjiFirstName = kanjiFirstName;
    }

    public String getKanaFamilyName() {
        return kanaFamilyName;
    }

    public void setKanaFamilyName(String kanaFamilyName) {
        this.kanaFamilyName = kanaFamilyName;
    }

    public String getKanaFirstName() {
        return kanaFirstName;
    }

    public void setKanaFirstName(String kanaFirstName) {
        this.kanaFirstName = kanaFirstName;
    }

    public String getAlphabetFamilyName() {
        return alphabetFamilyName;
    }
    public void setAlphabetFamilyName(String alphabetFamilyName) {
        this.alphabetFamilyName = alphabetFamilyName;
    }

    public String getAlphabetFirstName() {
        return alphabetFirstName;
    }
    public void setAlphabetFirstName(String alphabetFirstName) {
        this.alphabetFirstName = alphabetFirstName;
    }

    public String getDateOfBirthyear() {
        return dateOfBirthyear;
    }

    public void setDateOfBirthyear(String dateOfBirthyear) {
        this.dateOfBirthyear = dateOfBirthyear;
    }

    public String getDateOfBirthmonth() {
        return dateOfBirthmonth;
    }

    public void setDateOfBirthmonth(String dateOfBirthmonth) {
        this.dateOfBirthmonth = dateOfBirthmonth;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhoneNumber() {
        return homePhoneNumber;
    }

    public void setHomePhoneNumber(String homePhoneNumber) {
        this.homePhoneNumber = homePhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOtherJob() {
        return otherJob;
    }

    public void setOtherJob(String otherJob) {
        this.otherJob = otherJob;
    }

    public String getTreated() {
        return treated;
    }

    public void setTreated(String treated) {
        this.treated = treated;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getEmployerZipCode() {
        return employerZipCode;
    }

    public void setEmployerZipCode(String employerZipCode) {
        this.employerZipCode = employerZipCode;
    }

    public String getEmployerAddress() {
        return employerAddress;
    }

    public void setEmployerAddress(String employerAddress) {
        this.employerAddress = employerAddress;
    }

    public String getEmployerPhoneNumber() {
        return employerPhoneNumber;
    }

    public void setEmployerPhoneNumber(String employerPhoneNumber) {
        this.employerPhoneNumber = employerPhoneNumber;
    }

    public String getIndustryType() {
        return industryType;
    }

    public void setIndustryType(String industryType) {
        this.industryType = industryType;
    }


    /**
     * その他の職業欄が正しく入力されているかどうか判定する。
     * 職業で「その他（有職）」を選択し、その他の職業欄に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return その他の職業欄に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueOtherJob}")
    public boolean hasValueOtherJob() {
        if (StringUtil.isNullOrEmpty(job)) {
            // 職業が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (JobType.EMPLOYED.getCode().equals(job) && StringUtil.isNullOrEmpty(otherJob)) {
            return false;
        }
        return true;
    }

    /**
     * 既往歴が正しく入力されているかどうか判定する。
     * 治療有無で「はい」を選択し、既往歴に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return 既往歴に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueMedicalHistory}")
    public boolean hasValueMedicalHistory() {
        if (StringUtil.isNullOrEmpty(treated)) {
            // 治療有無が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (TreatedType.TREATED.getCode().equals(treated) && StringUtil.isNullOrEmpty(medicalHistory)) {
            return false;
        }
        return true;
    }

}
