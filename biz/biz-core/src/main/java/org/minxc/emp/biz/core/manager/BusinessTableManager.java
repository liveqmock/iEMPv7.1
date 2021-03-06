package org.minxc.emp.biz.core.manager;

import org.minxc.emp.biz.core.model.BusinessTable;
import org.minxc.emp.common.db.tableoper.TableOperator;
import org.minxc.emp.common.manager.Manager;


public interface BusinessTableManager extends Manager<String, BusinessTable> {
	
	
	void save(BusinessTable businessTable);

	BusinessTable getByKey(String key);

	BusinessTable getFilledByKey(String key);

	TableOperator newTableOperator(BusinessTable businessTable);
}