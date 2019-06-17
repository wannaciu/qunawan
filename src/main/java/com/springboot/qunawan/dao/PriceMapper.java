package com.springboot.qunawan.dao;

import com.springboot.qunawan.pojo.Price;

import java.util.List;

public interface PriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int insert(Price record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    Price selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    List<Price> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbggenerated Mon Jun 17 11:23:14 CST 2019
     */
    int updateByPrimaryKey(Price record);
}