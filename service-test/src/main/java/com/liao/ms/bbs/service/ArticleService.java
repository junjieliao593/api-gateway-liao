/**
 * 
 */
package com.liao.ms.bbs.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.liao.ms.bbs.entity.Article;

/**
 * @author ftl
 *
 */
@Transactional
public interface ArticleService  {

	List<Article> getByUserId(long userId);

	void changeHits(long id);

	void editPSById(long id,String postState);

}
