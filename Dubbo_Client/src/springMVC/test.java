package springMVC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springMVC.service.provider;

public class test {
  public static void main(String[] args) throws Exception {
	  System.out.println("我是消费者，买买买。。。。。。。。。。。。。。。。。。。。。。。");
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
              new String[] { "applicationContext.xml" });
      context.start();
      provider service = (provider) context.getBean("provider");
      service.sfy();
      context.close();
      
}
}
