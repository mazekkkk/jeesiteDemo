/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.mazekkkk.jeesite.modules.sys.dao;

import cn.mazekkkk.jeesite.common.persistence.TreeDao;
import cn.mazekkkk.jeesite.common.persistence.annotation.MyBatisDao;
import cn.mazekkkk.jeesite.modules.sys.entity.Area;

/**
 * 区域DAO接口
 * @author ThinkGem
 * @version 2014-05-16
 */
@MyBatisDao
public interface AreaDao extends TreeDao<Area> {
	
}
