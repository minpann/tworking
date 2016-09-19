package com.tcl.tworking.persistence.dao;

import java.util.List;

import com.tcl.tworking.persistence.model.Example;

public interface ExampleDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Example record);

    int insertSelective(Example record);

    Example selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Example record);

    int updateByPrimaryKey(Example record);

	List<Example> getAll();
}