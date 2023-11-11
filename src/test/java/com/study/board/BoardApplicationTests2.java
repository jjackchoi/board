package com.study.board;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

/*대부분의 스프링부트 관련 게시물에는 configguration 클래스를 추가하라고 하지만,
추가하지 않아도 db연결 잘되는것 확인*/
@SpringBootTest
class BoardApplicationTests2 {
	@Autowired
	private ApplicationContext context;
	@Autowired
	private SqlSessionFactory sessionFactory;
	@Test
	public void testByApplicationContext(){
		try{
			System.out.println("=========================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("=========================");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	@Test
	public void testBySqlSessionFactory() {
		try {
			System.out.println("=========================");
			System.out.println(sessionFactory.toString());
			System.out.println("=========================");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
