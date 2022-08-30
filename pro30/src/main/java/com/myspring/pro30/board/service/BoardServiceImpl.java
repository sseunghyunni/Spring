package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.pro30.board.dao.BoardDAO;
import com.myspring.pro30.board.vo.ArticleVO;

@Service("boardService")
@Transactional(propagation = Propagation.REQUIRED)
public class BoardServiceImpl implements BoardService {
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public List<ArticleVO> listArticles() throws DataAccessException{
		List<ArticleVO> articlesList =boardDAO.selectAllArticlesList();
		return articlesList;
	}

	@Override
	public int addNewArticle(Map articleMap) throws Exception {
		return boardDAO.insertNewArticle(articleMap);
	}
	@Override
	public ArticleVO viewArticle(int articleNO) throws DataAccessException{
		ArticleVO articleVO = boardDAO.selectArticle(articleNO);
		return articleVO;
	}
	
	@Override
	public void modArticle(Map articleMap) throws DataAccessException{
		boardDAO.updateArticle(articleMap);
	}
	
	@Override
	public void removeArticle(int articleNO) throws DataAccessException{
		boardDAO.deleteArticle(articleNO);
	}
	

}
