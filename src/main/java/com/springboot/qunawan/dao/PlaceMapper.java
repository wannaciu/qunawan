package com.springboot.qunawan.dao;

import com.springboot.qunawan.pojo.Place;

import java.util.List;

public interface PlaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int insert(Place record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    Place selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    List<Place> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table place
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int updateByPrimaryKey(Place record);
}