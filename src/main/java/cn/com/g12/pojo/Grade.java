package cn.com.g12.pojo;

import java.util.Date;

public class Grade {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.gNO
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    private Integer gno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.studid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    private String studid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.courseid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    private String courseid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.grade
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    private Float grade;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column grade.testtime
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    private Date testtime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.gNO
     *
     * @return the value of grade.gNO
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public Integer getGno() {
        return gno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.gNO
     *
     * @param gno the value for grade.gNO
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public void setGno(Integer gno) {
        this.gno = gno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.studid
     *
     * @return the value of grade.studid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public String getStudid() {
        return studid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.studid
     *
     * @param studid the value for grade.studid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public void setStudid(String studid) {
        this.studid = studid == null ? null : studid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.courseid
     *
     * @return the value of grade.courseid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public String getCourseid() {
        return courseid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.courseid
     *
     * @param courseid the value for grade.courseid
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.grade
     *
     * @return the value of grade.grade
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public Float getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.grade
     *
     * @param grade the value for grade.grade
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public void setGrade(Float grade) {
        this.grade = grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column grade.testtime
     *
     * @return the value of grade.testtime
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public Date getTesttime() {
        return testtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column grade.testtime
     *
     * @param testtime the value for grade.testtime
     *
     * @mbggenerated Tue May 08 15:38:48 CST 2018
     */
    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }
}