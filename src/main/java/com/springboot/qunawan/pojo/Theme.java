package com.springboot.qunawan.pojo;

public class Theme {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column theme.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.id
     *
     * @return the value of theme.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.id
     *
     * @param id the value for theme.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column theme.name
     *
     * @return the value of theme.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column theme.name
     *
     * @param name the value for theme.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}