package org.minxc.emp.system.impl.manager;

import java.util.List;

import org.minxc.emp.common.manager.Manager;
import org.minxc.emp.system.impl.model.ApplicationEntity;

/**
 * 子系统定义 处理接口
 */
public interface SubsystemManager extends Manager<String, ApplicationEntity> {

	/**
	 * 判断别名是否存在。
	 *
	 * @param subsystem
	 * @return
	 */
	boolean isExist(ApplicationEntity subsystem);

	/**
	 * 获取可用的子系统。
	 *
	 * @return
	 */
	List<ApplicationEntity> getList();

	/**
	 * 获取默认子系统。 1.获取用户有权限的系统，如果没有权限则返回空。 2.如果权限子系统，判断是否有默认的子系统，有则返回。 3.否则取第一个。
	 *
	 * @return
	 */
	ApplicationEntity getDefaultSystem(String userId);

	/**
	 * 设置默认子系统。 1.如果是默认的则取消。 2.非默认则设置默认。
	 *
	 * @param systemId
	 */
	void setDefaultSystem(String systemId);

	List<ApplicationEntity> getCurrentUserSystem();

}
