package com.myspring.pro30.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myspring.pro30.board.vo.ArticleVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<ArticleVO> selectAllArticlesList() throws DataAccessException {
		List<ArticleVO> articlesList = sqlSession.selectList("mapper.board.selectAllArticlesList");
		return articlesList;
	}

	@Override
	public int insertNewArticle(Map articleMap) throws DataAccessException {
		int result = sqlSession.insert("mapper.board.insertMember", articleMap);
		return result;
	}

	@Override
	public ArticleVO selectArticle(int articleNO) throws DataAccessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateArticle(Map articleMap) throws DataAccessException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteArticle(int articleNO) throws DataAccessException {
		int result = sqlSession.delete("mapper.board.deleteMember",articleNO);
		return;

	}

}
