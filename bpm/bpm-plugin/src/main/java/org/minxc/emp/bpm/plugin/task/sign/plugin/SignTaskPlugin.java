package org.minxc.emp.bpm.plugin.task.sign.plugin;

import org.minxc.emp.bpm.engine.plugin.runtime.abstact.AbstractBpmTaskPlugin;
import org.minxc.emp.bpm.engine.plugin.session.BpmTaskPluginSession;
import org.minxc.emp.bpm.plugin.task.sign.def.SignTaskPluginDef;
import org.springframework.stereotype.Component;

/*
 * 
*    
* 项目名称：wf-plugin   
* 类名称：SignTaskPlugin   
* 类描述：   TODO:查验该类的是否正确
* 创建人：Xianchang.min   
* 创建时间：2018年8月11日 上午1:34:02   
* 修改人：Xianchang.min   
* 修改时间：2018年8月11日 上午1:34:02   
* 修改备注：   
* @version  1.0  
*
 */
@Component
public class SignTaskPlugin extends AbstractBpmTaskPlugin<BpmTaskPluginSession, SignTaskPluginDef> {
	
	@Override
	public Void execute(BpmTaskPluginSession pluginSession, SignTaskPluginDef pluginDef) {
		return null;
	}


}