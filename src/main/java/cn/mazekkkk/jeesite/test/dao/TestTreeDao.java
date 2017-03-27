/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.mazekkkk.jeesite.test.dao;

import cn.mazekkkk.jeesite.common.persistence.TreeDao;
import cn.mazekkkk.jeesite.common.persistence.annotation.MyBatisDao;
import cn.mazekkkk.jeesite.test.entity.TestTree;

/**
 * 树结构生成DAO接口
 * @author ThinkGem
 * @version 2015-04-06
 */
@MyBatisDao
public interface TestTreeDao extends TreeDao<TestTree> {
	
}