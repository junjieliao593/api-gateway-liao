/**
 * 
 */
package com.liao.ms.bbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.liao.ms.bbs.entity.Article;

/**
 * @author xxxx
 *
 */
@Mapper
public interface ArticleDao {

//	public int getCountByUserId(@Param("query") QueryFilter query);

	List<Article> getByUserId(@Param("userId") long userId);

	public void editPSById(@Param("article_id") long article_id,@Param("postState") String postState);

}
