/**
 * 
 */
package com.liao.ms.bbs.ui;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.liao.ms.bbs.entity.Article;
import com.liao.ms.bbs.service.ArticleService;
import com.liao.ms.bbs.util.BaseContextAwareResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ftl
 *
 */
@Controller
@RequestMapping("test/article")
// @Resource(code = 20001, model = "Smart2", desc = "Article Resource")
public class ArticleResource extends BaseContextAwareResource {
	@Autowired
	private ArticleService service;

	protected ArticleService getService() {
		return service;
	}

	////
	@ResponseBody
	@GetMapping(value = "/index")
	public String index() {
		return "成功";
	}

	@ResponseBody
	@GetMapping(value = "/getByUserId/list")
	public List<Article> getByUserId(@RequestParam("userId") Integer userId) {
		return getService().getByUserId(userId);
	}

	@PUT
	@Path(value = "changeHits/{id}")
	public void changeHits(@PathParam("id") long id) {
		getService().changeHits(id);
	}

	@PUT
	@Path(value = "editPSById/{id}/{postState}")
	public void editPSById(@PathParam("id") long id, @PathParam("postState") String postState) {
		getService().editPSById(id, postState);
	}

}
