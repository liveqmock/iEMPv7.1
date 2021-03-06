package org.minxc.emp.bpm.core.dao;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.minxc.emp.bpm.core.model.BpmTaskOpinion;
import org.minxc.emp.common.db.dao.CommonDao;

@Mapper
public interface BpmTaskOpinionDao extends CommonDao<String, BpmTaskOpinion> {
	public BpmTaskOpinion getByTaskId(String taskId);

	public List<BpmTaskOpinion> getByInstAndNode(@Param(value = "instId") String instId,
			@Param(value = "nodeId") String nodeId);
}