package org.activiti.engine.impl.el;

import com.minxc.emp.core.util.AppContextUtil;

import java.util.Map;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.impl.Condition;
import org.minxc.emp.basis.api.groovy.IGroovyScriptEngine;
import org.minxc.emp.bpm.api.constant.ActionType;
import org.minxc.emp.bpm.api.engine.action.cmd.ActionCmd;
import org.minxc.emp.bpm.api.engine.action.cmd.BaseActionCmd;
import org.minxc.emp.bpm.api.engine.context.BpmContext;
import org.minxc.emp.bpm.api.exception.BpmStatusCode;
import org.minxc.emp.core.api.exception.BusinessException;

public class GroovyCondition implements Condition {
	private static final long serialVersionUID = -5577703954744892854L;
	private String script = "";

	public GroovyCondition(String condition) {
		this.script = condition;
	}

	public boolean evaluate(String arg0, DelegateExecution execution) {
		Map maps = execution.getVariables();
		maps.put("variableScope", execution);
		ActionCmd cmd = BpmContext.getActionModel();
		maps.putAll(cmd.getBizDataMap());
		BaseActionCmd submitAction = (BaseActionCmd) BpmContext.submitActionModel();
		maps.put("submitActionName", submitAction.getActionType().getKey());
		IGroovyScriptEngine engine = (IGroovyScriptEngine) AppContextUtil.getBean(IGroovyScriptEngine.class);
		try {
			return engine.executeBoolean(this.script, maps);
		} catch (Exception e) {
			e.printStackTrace();
			StringBuffer message = new StringBuffer("条件脚本解析异常！请联系管理员。");
			message.append("\n节点：" + execution.getCurrentActivityName() + "——" + execution.getCurrentActivityId());
			message.append("\n脚本：" + this.script);
			message.append("\n异常：" + e.getMessage());
			message.append("\n\n流程变量：" + maps.toString());
			throw new BusinessException(message.toString(), BpmStatusCode.GATEWAY_ERROR, (Throwable) e);
		}
	}
}