package com.liao.ms.bbs.util;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Produces({"application/json"})
@Consumes({"application/json"})
public abstract class BaseContextAwareResource extends BaseWebResourceAware {
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Context
	protected UriInfo uriInfo;

//	protected QueryFilter getQueryFilter() {
//		return QueryUtils.parseMultiQuery(this.uriInfo.getQueryParameters());
//	}
}
