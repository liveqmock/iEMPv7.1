package com.dstz.sys.groovy;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.dstz.org.api.model.IUser;
import com.dstz.sys.api.groovy.IScript;
import com.dstz.sys.api.service.SerialNoService;
import com.dstz.sys.util.ContextUtil;

/**
 * 系统脚本
 * 常用的系统功能的脚本
 */
@Component
public class SysScript implements IScript {
	@Resource
	SerialNoService serialNoService;
	
	/**
	 * 获取系统流水号
	 * @param alias
	 * @return
	 */
	public String getNextSerialNo(String alias) {
		return serialNoService.genNextNo(alias);
	}
	
	
	public IUser getCuurentUser() {
		return ContextUtil.getCurrentUser();
	}
	
	
	
}
