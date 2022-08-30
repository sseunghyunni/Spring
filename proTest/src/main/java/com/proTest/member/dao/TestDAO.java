package com.proTest.member.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository("testDAO")
public interface TestDAO {
	 public List listTests() throws DataAccessException ;

}
