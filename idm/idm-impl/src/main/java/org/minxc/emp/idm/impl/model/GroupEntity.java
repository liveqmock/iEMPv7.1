package org.minxc.emp.idm.impl.model;

import org.minxc.emp.idm.api.constant.GroupTypeConstant;
import org.minxc.emp.idm.api.model.GroupStructEnum;
import org.minxc.emp.idm.api.model.Group;
import org.minxc.emp.idm.api.model.IdentityType;
import com.minxc.emp.core.impl.model.AbstractCommonModel;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

/**
 * 组织架构 实体对象
 */
public class GroupEntity extends AbstractCommonModel implements Group {

	private static final long serialVersionUID = 9058258883041062647L;

	/**
	 * 主键
	 */
	protected String id;

	/**
	 * name_
	 */
	protected String name;

	/**
	 * prent_id_
	 */
	protected String parentId;

	/**
	 * code_
	 */
	protected String code;

	/**
	 * 级别
	 */
	protected String grade;

	protected Long sn;

	protected String desc;;

	/**
	 * 上级组织名称
	 */
	protected String parentOrgName;

	/**
	 * 是否主组织。
	 */
	private int isMaster = 0;

	public void setParentOrgName(String parentOrgName) {
		this.parentOrgName = parentOrgName;
	}

	/**
	 * 返回 主键
	 *
	 * @return
	 */
	public String getParentOrgName() {
		return this.parentOrgName;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 返回 主键
	 *
	 * @return
	 */
	public String getId() {
		return this.id;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 返回 name_
	 *
	 * @return
	 */
	public String getName() {
		return this.name;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	/**
	 * 返回 prent_id_
	 *
	 * @return
	 */
	public String getParentId() {
		return this.parentId;
	}

	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * 返回 code_
	 *
	 * @return
	 */
	public String getCode() {
		return this.code;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	/**
	 * 返回 级别
	 *
	 * @return
	 */
	public String getGrade() {
		return this.grade;
	}

	/**
	 * @see Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this).append("id", this.id).append("name", this.name)
				.append("parentId", this.parentId).append("code", this.code).append("grade", this.grade).toString();
	}

	public String getIdentityType() {
		return IdentityType.GROUP;
	}

	public String getGroupId() {
		return this.id;
	}

	public String getGroupCode() {
		return this.code;
	}

	public Long getSn() {
		return sn;
	}

	public void setSn(Long sn) {
		this.sn = sn;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGroupType() {
		return GroupTypeConstant.ORG.key();
	}

	public GroupStructEnum getStruct() {
		return GroupStructEnum.TREE;
	}

	public String getPath() {
		return null;
	}

	public Map<String, Object> getParams() {
		return null;
	}

	public int getIsMaster() {
		return isMaster;
	}

	public void setIsMaster(int isMaster) {
		this.isMaster = isMaster;
	}
}