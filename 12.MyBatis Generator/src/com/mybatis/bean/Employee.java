package com.mybatis.bean;

public class Employee {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.gender
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.email
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.id
     *
     * @return the value of employee.id
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.id
     *
     * @param id the value for employee.id
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.name
     *
     * @return the value of employee.name
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.name
     *
     * @param name the value for employee.name
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.gender
     *
     * @return the value of employee.gender
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.gender
     *
     * @param gender the value for employee.gender
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column employee.email
     *
     * @return the value of employee.email
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column employee.email
     *
     * @param email the value for employee.email
     *
     * @mbggenerated Tue Apr 12 01:30:05 CST 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}