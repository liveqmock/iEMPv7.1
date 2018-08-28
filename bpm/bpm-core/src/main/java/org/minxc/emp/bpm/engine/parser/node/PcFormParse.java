package org.minxc.emp.bpm.engine.parser.node;

import org.minxc.emp.bpm.api.engine.plugin.def.BpmDef;
import org.minxc.emp.bpm.api.model.form.BpmForm;
import org.minxc.emp.bpm.api.model.form.DefaultForm;
import org.minxc.emp.bpm.api.model.nodedef.impl.BaseBpmNodeDef;
import org.minxc.emp.bpm.engine.parser.node.AbsNodeParse;
import org.springframework.stereotype.Component;

@Component
public class PcFormParse extends AbsNodeParse<DefaultForm> {
	public String getKey() {
		return "form";
	}

	public void setDefParam(BaseBpmNodeDef userNodeDef, Object object) {
		DefaultForm form = (DefaultForm) object;
		userNodeDef.setForm((BpmForm) form);
	}

//	public void setDefParam(BpmDef bpmDef, Object object) {
//		this.a((BaseBpmNodeDef) bpmDef, object);
//	}
}