package org.minxc.emp.core.api.model;

import java.io.Serializable;

/**
 * @version V1.0
 * @Title: IdModel
 * @Package: org.minxc.emp.core.api.model
 * @Description: TODO:(用一句话描述该文件做什么)
 * @author: Xianchang.min
 * @date 2018/8/24 22:53
 */

public interface IdModel extends Serializable{

    public String getId();

    public void setId(String id);
}
