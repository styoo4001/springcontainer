package kr.co.saramin.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    
        
        System.out.println("----------------------testbeanfactory-----------");
        testBeanFactory();
       
        
        
        
        
        System.out.println("----------------------testbeanfactory2-----------");
        testBeanFactory2();
     
        
        System.out.println("----------------------testApplicationConext-----------");
        
        testApplicationConext();
        
    }
    

    public static void testApplicationConext(){
    	
    	// bean 팩토리랑 같은기능이지만 더 강력한 기능을 가진 ....applicationcontext
    	ApplicationContext ac= new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
    	
    	User user  = null;
    	Guestbook gb= null;
    	// id로 가져오기..
    	user = (User)ac.getBean("user");
   
     	System.out.println(user.getName());
        
     	//타입으로 가져오기는 캐스팅 안해도된다..
    	user = ac.getBean( User.class);
    	
    	
    	System.out.println(user.getName());
    	
    	
    	//name 으로 가져오기..
    	user = (User)ac.getBean( "myuser");
    	
    	
    	System.out.println(user.getName());
    	
    	
    	
    	
    	// 같은 타입(클래스)가 한개 이상있을때 타입으로 가져오면 에러 발생함..
    	//gb = bf.getBean( Guestbook.class);
     	//System.out.println(gb.getMessage());
   
     	// 같은 타입이 두개있어도 아이디로 가져오면 에러 안남..
     	gb = (Guestbook)ac.getBean( "guestbook1");
    	
     	System.out.println(gb.getMessage());
   
     	
     	System.out.println(ac.getBean("guestbook1")==ac.getBean("guestbook"));
    	
    	
    }
    
    
    
    private static void testBeanFactory(){
    	
    	BeanFactory bf= new XmlBeanFactory( new ClassPathResource("config/applicationContext.xml"));
    	
    	User user  = null;
    	Guestbook gb= null;
    	// id로 가져오기..
    	user = (User)bf.getBean("user");
   
     	System.out.println(user.getName());
        
     	//타입으로 가져오기는 캐스팅 안해도된다..
    	user = bf.getBean( User.class);
    	
    	
    	System.out.println(user.getName());
    	
    	
    	//name 으로 가져오기..
    	user = (User)bf.getBean( "myuser");
    	
    	
    	System.out.println(user.getName());
    	
    	
    	
    	
    	// 같은 타입(클래스)가 한개 이상있을때 타입으로 가져오면 에러 발생함..
    	//gb = bf.getBean( Guestbook.class);
     	//System.out.println(gb.getMessage());
   
     	// 같은 타입이 두개있어도 아이디로 가져오면 에러 안남..
     	gb = (Guestbook)bf.getBean( "guestbook1");
    	
     	System.out.println(gb.getMessage());
   
     	
     	System.out.println(bf.getBean("guestbook1")==bf.getBean("guestbook"));
    	
    }
    
    
    

    
    
    private static void testBeanFactory2(){
    	
    	// 자동으로 스캐닝 해서 올라간건 클래스명으로만 찾아야된다..타입도 아니고 id 인데 id 자체가 클래스명임.
    	
    	BeanFactory bf= new XmlBeanFactory( new ClassPathResource("config/applicationContext2.xml"));
    	
    	User user  = null;
    	Guestbook gb= null;
    	// id로 가져오기..
    	user = (User)bf.getBean("user");
   
     	System.out.println(user.getName());
        
     	//타입으로 가져오기는 캐스팅 안해도된다..
    	user = bf.getBean( User.class);
    	
    	
    	System.out.println(user.getName());
    	
    	
    	//name 으로 가져오기..
   // 	user = (User)bf.getBean( "myuser");
    	
    	
    	System.out.println(user.getName());
    	
    	
    	
    	
    	// 같은 타입(클래스)가 한개 이상있을때 타입으로 가져오면 에러 발생함..
    	//gb = bf.getBean( Guestbook.class);
     	//System.out.println(gb.getMessage());
   
     	// 같은 타입이 두개있어도 아이디로 가져오면 에러 안남..
     	gb = (Guestbook)bf.getBean( "guestbook1");
    	
     	System.out.println(gb.getMessage());
   
     	
     	System.out.println(bf.getBean("guestbook1")==bf.getBean("guestbook"));
    	
    }
    
    
    
    
}
