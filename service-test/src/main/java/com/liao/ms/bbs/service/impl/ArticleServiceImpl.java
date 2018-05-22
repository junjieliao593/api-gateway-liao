package com.liao.ms.bbs.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.liao.ms.bbs.dao.ArticleDao;
import com.liao.ms.bbs.entity.Article;
import com.liao.ms.bbs.service.ArticleService;

/**
 * @author ftl
 *
 */
@Service("ArticleService")
@Transactional(readOnly = false)
public class ArticleServiceImpl implements ArticleService {

	@Resource
	private ArticleDao dao;

	@Override
	public List<Article> getByUserId(long userId) {
		return dao.getByUserId(userId);
	}

	@Override
	public void changeHits(long id) {
		// Article article=dao.getById(id);
		// int i= article.getHits();
		// article.setHits(i++);
		// dao.update(article);

	}

	@Override
	public void editPSById(long id, String postState) {
		dao.editPSById(id, postState);
	}

	////

}
