package com.leon.egg;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.leon.egg.modular.system.dao.RelationMapper;
import com.leon.egg.modular.system.model.Relation;



@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloMysqlPlusTest {

	@Autowired
	private RelationMapper userMapper;

	@Test
	public void testSelect() {
		System.out.println(("----- selectAll method test ------"));
		List<Relation> userList = userMapper.selectList(null);
		Assert.assertEquals(75, userList.size());
		userList.forEach(System.out::println);
	}

}