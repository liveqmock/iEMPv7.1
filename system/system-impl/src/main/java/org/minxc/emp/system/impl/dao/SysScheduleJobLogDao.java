package org.minxc.emp.system.impl.dao;

import org.apache.ibatis.annotations.Mapper;
import org.minxc.emp.common.db.dao.CommonDao;
import org.minxc.emp.system.impl.model.SystemScheduleJobLogEntity;

/**
 * 任务计划日志持久化
 */

@Mapper
public interface SysScheduleJobLogDao extends CommonDao<String, SystemScheduleJobLogEntity> {

	/**
	 * 选择性插入
	 * 
	 * @param entity 实体
	 * @return
	 */
	int insertSelective(SystemScheduleJobLogEntity entity);

	/**
	 * 选择性更新
	 *
	 * @param entity 更新
	 * @return
	 */
	int updateByPrimaryKeySelective(SystemScheduleJobLogEntity entity);

	/**
	 * 根据任务计划ID移除
	 * 
	 * @param jobId
	 * @return
	 */
	int removeByJobId(String jobId);
}
