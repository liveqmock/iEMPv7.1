package org.minxc.emp.bpm.core.manager;

import java.util.List;
import java.util.Set;

import org.minxc.emp.basis.api.model.SysIdentity;
import org.minxc.emp.bpm.api.model.task.IBpmTask;
import org.minxc.emp.bpm.core.model.TaskIdentityLink;
import org.minxc.emp.common.manager.Manager;

public interface TaskIdentityLinkManager extends Manager<String, TaskIdentityLink> {
	public void removeByTaskId(String var1);

	public void bulkCreate(List<TaskIdentityLink> var1);

	public void removeByInstanceId(String var1);

	public Boolean checkUserOperatorPermission(String var1, String var2, String var3);

	public void createIdentityLink(IBpmTask var1, List<SysIdentity> var2);

	public Set<String> getUserRights(String var1);

	public List<TaskIdentityLink> getByTaskId(String var1);
}