package org.minxc.emp.bpm.engine.plugin.runtime;

import com.dstz.sys.api.model.SysIdentity;
import java.util.List;

import org.minxc.emp.bpm.api.engine.plugin.def.BpmPluginDef;
import org.minxc.emp.bpm.api.engine.plugin.runtime.RunTimePlugin;
import org.minxc.emp.bpm.engine.plugin.session.BpmUserCalcPluginSession;

public interface BpmUserCalcPlugin<M extends BpmPluginDef>
		extends
			RunTimePlugin<BpmUserCalcPluginSession, M, List<SysIdentity>> {
}