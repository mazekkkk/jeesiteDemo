/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.mazekkkk.jeesite.modules.gen.dao;

import cn.mazekkkk.jeesite.common.persistence.CrudDao;
import cn.mazekkkk.jeesite.common.persistence.annotation.MyBatisDao;
import cn.mazekkkk.jeesite.modules.gen.entity.GenTable;

/**
 * 业务表DAO接口
 * @author ThinkGem
 * @version 2013-10-15
 */
@MyBatisDao
public interface GenTableDao extends CrudDao<GenTable> {
	
}
