package com.aicrowdfunding.bean;

public class TMemberCert {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_cert.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_cert.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer memberid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_cert.certid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer certid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_member_cert.iconpath
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String iconpath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_cert.id
     *
     * @return the value of t_member_cert.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_cert.id
     *
     * @param id the value for t_member_cert.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_cert.memberid
     *
     * @return the value of t_member_cert.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_cert.memberid
     *
     * @param memberid the value for t_member_cert.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_cert.certid
     *
     * @return the value of t_member_cert.certid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getCertid() {
        return certid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_cert.certid
     *
     * @param certid the value for t_member_cert.certid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setCertid(Integer certid) {
        this.certid = certid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_member_cert.iconpath
     *
     * @return the value of t_member_cert.iconpath
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getIconpath() {
        return iconpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_member_cert.iconpath
     *
     * @param iconpath the value for t_member_cert.iconpath
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setIconpath(String iconpath) {
        this.iconpath = iconpath == null ? null : iconpath.trim();
    }
}