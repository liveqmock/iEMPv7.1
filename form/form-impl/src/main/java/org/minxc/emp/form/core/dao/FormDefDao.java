package org.minxc.emp.form.core.dao;

import org.apache.ibatis.annotations.Mapper;
import org.minxc.emp.common.db.dao.CommonDao;
import org.minxc.emp.form.core.model.FormDef;


/**
 * 表单 DAO接口
 *
 * @time 2018-03-19 20:30:46
 */
@Mapper
public interface FormDefDao extends CommonDao<String, FormDef> {

	FormDef getByKey(String key);

}
