package com.aicrowdfunding.bean;

public class TMessage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private Integer memberid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_message.senddate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    private String senddate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.id
     *
     * @return the value of t_message.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.id
     *
     * @param id the value for t_message.id
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.memberid
     *
     * @return the value of t_message.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public Integer getMemberid() {
        return memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.memberid
     *
     * @param memberid the value for t_message.memberid
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setMemberid(Integer memberid) {
        this.memberid = memberid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.content
     *
     * @return the value of t_message.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.content
     *
     * @param content the value for t_message.content
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_message.senddate
     *
     * @return the value of t_message.senddate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public String getSenddate() {
        return senddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_message.senddate
     *
     * @param senddate the value for t_message.senddate
     *
     * @mbg.generated Sun Jul 21 17:38:05 CST 2019
     */
    public void setSenddate(String senddate) {
        this.senddate = senddate == null ? null : senddate.trim();
    }
}