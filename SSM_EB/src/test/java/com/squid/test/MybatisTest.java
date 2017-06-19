package com.squid.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.squid.bean.Address;
import com.squid.bean.Member;
import com.squid.dao.AddressMapper;
import com.squid.dao.MemberMapper;

public class MybatisTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext(
				new String[]{"conf/spring-mybatis.xml"});
		 AddressMapper bean = (AddressMapper) beanFactory.getBean("addressMapper");
		 Address address=new Address(3, 30, "中国", "江西", "南昌", "华东交大");
		 bean.insert(address);
	}
}