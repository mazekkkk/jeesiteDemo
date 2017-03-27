/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.mazekkkk.jeesite.modules.test.service;

import cn.mazekkkk.jeesite.modules.test.entity.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.mazekkkk.jeesite.common.service.CrudService;
import cn.mazekkkk.jeesite.modules.test.dao.TestDao;

/**
 * 测试Service
 * @author ThinkGem
 * @version 2013-10-17
 */
@Service
@Transactional(readOnly = true)
public class TestService extends CrudService<TestDao, Test> {

}
