package com.ruby.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.ruby.bean.WishMessage;

public class Test {

	public static void main(String[] args) {
BeanFactory factory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/ruby/cfg/ApplicationContext.xml"));
WishMessage wish= factory.getBean("message",WishMessage.class);
System.out.println(wish);
	}

}
