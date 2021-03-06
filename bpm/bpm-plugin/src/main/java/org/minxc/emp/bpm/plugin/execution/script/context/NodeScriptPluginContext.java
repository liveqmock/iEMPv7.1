package org.minxc.emp.bpm.plugin.execution.script.context;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.minxc.emp.bpm.api.constant.EventType;
import org.minxc.emp.bpm.api.engine.plugin.runtime.RunTimePlugin;
import org.minxc.emp.bpm.engine.plugin.context.AbstractBpmExecutionPluginContext;
import org.minxc.emp.bpm.plugin.execution.script.def.NodeScriptPluginDef;
import org.minxc.emp.bpm.plugin.execution.script.plugin.NodeScriptPlugin;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class NodeScriptPluginContext extends AbstractBpmExecutionPluginContext<NodeScriptPluginDef> {
	private static final long serialVersionUID = -5958682303600423597L;

	public List<EventType> getEventTypes() {
		ArrayList<EventType> list = new ArrayList<EventType>();
		list.add(EventType.START_EVENT);
		list.add(EventType.END_EVENT);
		list.add(EventType.TASK_COMPLETE_EVENT);
		list.add(EventType.TASK_CREATE_EVENT);
		return list;
	}

	public Class<? extends RunTimePlugin> getPluginClass() {
		return NodeScriptPlugin.class;
	}

	protected NodeScriptPluginDef parseFromJson(JSON pluginJson) {
		JSONObject jsonObject = (JSONObject) pluginJson;
		NodeScriptPluginDef def = new NodeScriptPluginDef();
		for (String key : jsonObject.keySet()) {
			try {
				EventType event = EventType.fromKey((String) key);
				def.a(event, jsonObject.getString(key));
			} catch (Exception e) {
			}
		}
		return def;
	}

	public String getTitle() {
		return "脚本";
	}

}