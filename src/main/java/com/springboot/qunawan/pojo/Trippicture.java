package com.springboot.qunawan.pojo;

public class Trippicture {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trippicture.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trippicture.type
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trippicture.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trippicture.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private Integer trip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trippicture.data
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    private byte[] data;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trippicture.id
     *
     * @return the value of trippicture.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trippicture.id
     *
     * @param id the value for trippicture.id
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trippicture.type
     *
     * @return the value of trippicture.type
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trippicture.type
     *
     * @param type the value for trippicture.type
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trippicture.name
     *
     * @return the value of trippicture.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trippicture.name
     *
     * @param name the value for trippicture.name
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trippicture.trip
     *
     * @return the value of trippicture.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public Integer getTrip() {
        return trip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trippicture.trip
     *
     * @param trip the value for trippicture.trip
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setTrip(Integer trip) {
        this.trip = trip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trippicture.data
     *
     * @return the value of trippicture.data
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public byte[] getData() {
        return data;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trippicture.data
     *
     * @param data the value for trippicture.data
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    public void setData(byte[] data) {
        this.data = data;
    }
}