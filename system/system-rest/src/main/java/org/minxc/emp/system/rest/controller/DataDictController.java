package org.minxc.emp.system.rest.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.minxc.emp.common.rest.CommonController;
import org.minxc.emp.core.api.aop.annotation.ErrorCatching;
import org.minxc.emp.core.api.query.QueryFilter;
import org.minxc.emp.core.api.query.QueryOperator;
import org.minxc.emp.core.api.response.impl.ResultMessage;
import org.minxc.emp.system.impl.manager.DataDictManager;
import org.minxc.emp.system.impl.model.DataDict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ArrayNode;


/**
 * 数据字典 控制器类<br/>
 * @author  aschs
 */
@RestController
@RequestMapping("/sys/dataDict")
public class DataDictController extends CommonController<DataDict>{
	@Resource
	DataDictManager dataDictManager;
	
	
	@Override
	protected String getModelDesc(){
		return "数据字典";
	}
	
	@RequestMapping("getDictData")
	public ResultMessage<List<DataDict>> getByDictKey(@RequestParam String dictKey,@RequestParam(defaultValue="false") Boolean hasRoot) throws Exception{
		if(StringUtils.isEmpty(dictKey)) return null;
		
		List<DataDict> dict = dataDictManager.getDictNodeList(dictKey,hasRoot);
		return getSuccessResult(dict);
	}
	
	@RequestMapping("getDictList")
	public ResultMessage<List<DataDict>> getDictList(HttpServletRequest request) throws Exception{
		QueryFilter filter = getQueryFilter(request);
		filter.addFilter("dict_type_", DataDict.TYPE_DICT, QueryOperator.EQUAL);
		filter.setPage(null);
		
		List<DataDict> dict = dataDictManager.query(filter);
		return getSuccessResult(dict);
	}
	
	/**
	 * 获取所有数据字典，以tree的形式
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("getDictTree")
	@ErrorCatching("获取数据字典失败")
	public ResultMessage<ArrayNode> getDictTree() throws Exception{
		ArrayNode dict = dataDictManager.getDictTree();
		return getSuccessResult(dict);
	}
	
}
