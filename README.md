
   Spring:
 -------
                                        
>Spring is a framework which is used to develop web applications or enteprise eddition application.
>It is also called as container. 
>It is also called as IOC(Inversion of control) framework.
>It is also called as DI(Dependency Injection) Framework.

JavaBean=[DTO+extra method]--->xml---->MainClass.

Steps to create a Spring Application:
-------------------------------------
  1.Create a java project .
  2.Create a folder called as lib and copy all the jars.
  3.Do the build path.
  4.Create a proper package under 'src'.
  5.Create a 'javaBean' .
  6.Create a xml file with the name 'beans.xml' under src.
  7.Create a Test Class with the main method.
  
  Note.
  -----
  1.www.github.com/harsh-gitx/sring:-->url for jars.
  
 Springproject:
    //Create java Bean class.
   class BarBean implements Serializable
   {
      private String barName;
	  private String licno;
	  private String location;
	  private int turnOver;
	  //generate getter n setter
	  //method which shows functionality(Business Method).
	  //set value via Constructor
	  public BarBean(String barName,String licno,String location,int turnOver)
	  {
	    this.barName=barName;
		this.licno=licno;
	  }
	  public String supply()
	  {
	    return "supplies alcohal";
	  }
	  
   }
   
   Xml file:
   ---------
    beans.xml
     declaration[DTD,XSD]--->pre defined tag.
      get jar from :spring-beans
      use xsd fro spring.
   To obtain XSD (Xml Schema defenation):
   --------------------------------------
     1.Extract a jar file called as spring-beans.
     2.Navigate to org then spring framework then beans.
     3.Search for a file with 'spring-beans.xsd'.
     4.Copy line no 3,4 and 5. 
	 >To set values for datamembers using constructors we have to use a tag called as 'constructor-arg'.
	 
     <beans paste xsd >
	 <!--Information abt bean -->
	
	   //for create object of class..
	 <bean class="fully qualified class of 'BarBean'" id="id">
	 <property name="barName" value="Gopi Bar" ></property>
	 <property name="licNo" value="123456ABC" ></property>
	 <property name="location" value="Basavangudi" ></property>
	 <property name="turnOver" value="10000" ></property>
     //for setting value
      <constructor-arg value="Gopi Bar"></constructor-arg>
      <constructor-arg value="123456ABC"></constructor-arg>
      <constructor-arg value="Basavangudi"></constructor-arg>	 
      <constructor-arg value="10000"></constructor-arg>	  
	 </bean>
	 //for one more object
	 <bean same like pre>
	  <constructor-arg value="Gopi Bar"></constructor-arg>
      <constructor-arg value="123456ABC"></constructor-arg>
      <constructor-arg value="Basavangudi"></constructor-arg>	 
      <constructor-arg value="10000"></constructor-arg>	
	 </bean>
	 </beans>
	 
 //Create a test class with main method..
  class Test{
      main()
	  {
	    /* //obj of bar bean
		 BarBean bar=new BarBean();
		 bar.setBar("Gopi wines");
		 bar.setLicNo("1234ABC");
		 bar.setLocation("Basavangudi");
		 bar.setTurnOver(10000);*///
		 //load beans.xml
		 String xml="path of xml file";
		 //FSR(File System Resource) which loads the xml file.
		 FileSystemResource fsr=new FileSystemResource(xml);
		 
		 //bean Factory object
		 BeanFactory beanFactory=new XmlBeanFactory(fsr);
		 //To obtain ref barBean
		 BarBean bar=beanFactory.getBean(BarBean.class);
		 //setting val
		 /*bar.setBar("Gopi wines");
		 bar.setLicNo("1234ABC");
		 bar.setLocation("Basavangudi");
		 bar.setTurnOver(10000);*/do not set val in Test
		 //call business method
		 String sup=bar.supply();
		 sop(sup);
		 sop(bar.getTurnOver());
		 //
		 BarBean bar2=beanFactory.getBean("bar2",BarBean.class);
	  }
  } 

>To create an object of 'javaBean' we use a tag called as '<bean>'.
 >It has two attributes:
 1.id ->'id' is use to provide the reference variable .
 2.class->'class' is use to provide the information about the class whose object
      needs to be created.
    
Steps to create a Test class:
-----------------------------
  1.Load beans.xml file.
  2.Use 'BeanFactory' to create the object of 'javaBean'.
  3.Obtain the reference of bean object using 'BeanFactory'
  4.call the business method.

There are two containers in spring:
 1.BeanFactory(I).--------->XmlBeanFactory(Implementation class of BeanFactory(I))
 2.ApplicationContext.
 
 >These containers are responsible for creating object of bean class. 
 
 To set values for datamembers we use a tag called as '<property>' in 'xml' file..
 >It has two attributes
  1.name->In 'name' attributes we have to pass name of datamember
  2.value->'value' is use to provide the value for datamember.
   
 1.BeanFactory:
 --------------
 1.BeanFactory is a container.
 2.It is an interface.
 3.BeanFactory reads xml file and Bean objects.
 4.To obtain BeanFactory object we have to use an implementation class called as 'XmlBeanFactory'.
 5.To obtain the reference of Bean object from to BeanFactory we have to use a method called as
  'getBean()'.
 6.BeanFactory doesn't support web application. 

//link
  www.github.com/harsh-gitx/spring
   

ApplicationContext:
-------------------
  >ApplicationContext is a container.
  >It extends BeanFactory.
  >It supports web application.
  >It support AOP(Aspect Oriented programming).
  
 Steps to create test class using ApplicationContext::
  1.Obtain the name of xml file.
  2.create an object of ApplicationContext.
  3.Use getBean method to obtain the reference of javaBean.
  4.Call the Business method.
 ---------------------------------------------------------
  Create Project for applicationContext.
  Create a javaBean class.
  class NavyBean implements Serializable
  {
     private String regimentName;
	 private String rank;
	 private String port;
	 //getter setter method
	 //Business method
	 //add via constructors
	 public NavyBean(String regimentName,String rank,String port)
	 {
	   
	 }
	 public String protect()
	 {
	    
	 }
  }
  Xml:
  <beans>
  <bean calss="" id="id">
  <property name="regimentName" value="navy"></property>
  <property name="rank" value="commander"></property>
  <property name="port" value="surot"></property>
  //set value in <constructor-arg> tag.
  </bean>
  </beans>
  //Create a Test class
  Class testDao
  {
     main()
	 {
	    String xml=beans.xml;
		//create object of ApplicationContext
		ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
		NavyBean navy=ac.getBean(NavyBean.class);
		SOP(navy.getRegimentName());
	 }
  }
  
IOC(Inversion Of Control):
--------------------------
     >IOC is an abstract design a architecture.
	 >It states an object should not create its own dependent object.
	 >Instead it should be created by an external entity.
Dependency Injection:
---------------------
   >Dependency Injection is an implementation of IOC .
   >Dependency Injection pushing the dependent object into Owner object.
   >There are two types of depency injection.
     1.Setter Injection.
     2.Constructor Injection.
    ex:	 
    IOC Project:
    ------------
    Class BarBean implements Serializable
    {
	   private String barName;
	                  licno;
			   DrinkBean drink;	  
		//getter setter.
        //		
	}
    Class DrinkBean implements Serializable
    {
	   private String type;
	   private double perOfAlcohal;
	   
	   //getter setter.
	}
    class TestBar	
	{
	  main()
	  {
	    /*BarBean bar=new BarBean();
		SOP(bar.supply());
		DrinkBean d=new DrinkBean();
		//relate bar with drink
		//depency injection
		bar.setDrink(d);//bar has drink.*/
		String xml="beans.xml";
		ApplicationContext ac=new ClassPathXmlApplicationContext(xml);
		BarBean bar=ac.getBean(BarBean.class);
		SOP(bar.supply());
		Drink drink=bar.getDrink();
		SOP(drink.getType());
	  }
	}
	xml file:
	---------
	<beans>
	  <bean class="fully qualified path of Bar" id="bar">
	  <property name="barName" value="Gopi Bar"></property>
	  <property name="licno" value="12334"></property>
	  //depency injection
	  <property name="drink" ref="scotch"></property>
	  </bean>
	  <bean class="fully qualified path of Drink" id="scotch">
	  <property name="type" value="Beer"></property>
	  <property name="perOfAlcohal" value="48.5"></property>
	  </bean>
	</beans>

	>'value' attributes is used only for primitive types and wrapper class.
	>For object type we have to use 'ref' attribute
      
AutoWire:
---------
   >Using AutoWire spring performes depency injection autometically.
   >There are three types of AutoWire:
     1.byName.
     2.byType.
     3.constructor.
	 
	1.byType:
       >In byType spring searches for a type of dependent object in the heap.
       >If the dependent object is found then it injects the dependent object to owner object.		
       eg.	 
	    <bean autowire="byType"></bean>
	 
	2.byName:
       >In byName the name of the member in the owner class should match with the id of dependent
        bean.
	   eg.
	    <bean autowire="byName"></bean>
        <bean id="drink"></bean>

    3.constructor:
       >constructor autowiring is same as byType .
       >but while injecting dependent object it uses constructor of the bean class.
	    eg.
	     <bean autowire="constructor">
	     <constructor-arg value="Gopi Wines"/>
	     <constructor-arg value="1234"/>
	     </bean>
	   
Scopes of spring:
-----------------
    >Scope is a boundary with in which object can be access.
    >There are five scopes in spring:
    1.Singleton.
    2.Prototype.
    3.Request.
    4.Session.
    5.Global.
	
    1.Singleton:
       >Spring container creates bean objects using Singleton scope.
	    syntax:
	     <beans scope="singleton">
    2.Prototype:
       >In Prototype whenever we use getBean spring always returns a new object.
	   >To configure the scope as prototype we have to use an attribute called as
    	   scope in the bean tag.
   eg:
    class ParlourBean implements Serializable
    { 
	   private String name;
	   private String loc;
	   private String noOfEmp;
	   //getter n setter.
	   //Business method
	   public String 
	}
	class OwnerBean implements Serializable
	{
	  
	}
  xml file:
   <beans>
    <bean scope="prototype">
	</bean>
   </beans>
   class TestParlour
   {
     String xmi="beans.xml";
	 ApplicationContext ac= new ClassPathXmlApplicationContext(xml);
	 ParlourBean parlour=ac.getBean(ParlourBean.class);
	 SOP(parlour);
   }
   
Configuring Application using annotations:
------------------------------------------
  >To use annotations we have to follow three sup
    1.get the name space.
    2.use a tag called as 'component-scan'.
    3.use an annotation called as component.

  @Component:It is use to convert javaBean to a component so that spring creates an object of it.
  @Value:It is use to set the values for datamembers.
   eg.
    @Value("any value")
	
  @Autowired:It is use to performe the depency injection.

There are six Modules in spring:
--------------------------------
 1.Spring Core(Comes under Spring Core IOC,DI,BF,AC)
 2.Spring JDBC
 3.Spring MVC
 4.Spring ORM
 5.Spring AOP
 6.Spring DAO 
      
Spring MVC :
  >Spring MVC is a module which is use to develop web application or enteprise eddition application. 
  
  >FCDP(Front Control Design Pattern):
    It states an application should have only one servlet for processing all the request and 
	to rendar the response.
  >Spring implements FCDP using Dispatcher Servlet.Hence Dispatcher Servlet is responsible for
    processing all the request and to rendar the response.	
	
Steps to create a Spring MVC application:
 1.create a 'dynamicwebproject'
 2.create a folder called as views under WebContent
 3.Create a html or jsp page under views folder.
 4.Create a proper package under src.
 5.Create a folder called as controler inside the package.
 6.copy all the jars in lib folder.
 7.create a controler class inside the controler.
 8.Configure web.xml to map all the request to the dispatcher servlet.
 --------------------------------------------
 FlightBooking.html
  <body>
  <pre>
  <form action="/booking">
   Source:<input type="text" name="source"/>
   Destination:<input type="text" name="destination"/>
   Date:<input type="text" name="dateofDept"/>
   <button type="submit">Book</button>
   <button type="submit">Cancel</button>   
  </form>
  </pre>
  </body>
  
  com.app.mvc --->folder-->Create class BookingController extends HttpServlet
  {
    doGet(HSR req, HSR res)
	{
	  String source=req.getParameter("source");
	}
  }
  
@ModelAttribute():
    >It is used to bind the values from the form to a dto object.  
Advantages of MVC:
------------------ 
	>Application can be maintain very easely.
	>Migration of application will be easier.
	
	
Dispatcher Servlet:
-------------------
    >It is use to implement Front Control Design Pattern.
	>Whenever Dispatcher Servlet is invoked it always searches for the file with servletName-servlet.xml.
	>If the file is not presnet then it throws 500 Exception.
	>Dispatcher Servlet invokes a component called as handdler mapping to search for the controlers.
	>Dispatcher Servlet is Entry/Exit Point of the application.
	
Handeler Mapping:
  >It is an internal component which searches for controler by using @RequestMapping.
  >It return the name of the controler to the dispatcher servlet.
	  
Controler:
  >Controler is a class which is responsible for processing all the request and giving the response.
  >In controler every request is mapp its own method.

View Resolver:
   >It is an internal component which is consulted by the dispatcher servlet to search  for views.
   >If it finds the view then it returns the view to the dispatcher servlet else it throws404 error.   
   >To return dynamic contentfrom the controler we have to use a component called as model and view.

Model & View:
  >It is a class .
  >It has two methods 
    1.addObject()---send data(destination,date,source)
    2.setViewName()-->name of the view(success.jsp)
addObject():
------------
   It is use to send the dynamic data(destination,date,source).
   syntax:
       addObject("key","value")
setViewName:
   >It is use to provide the information about the jsp page.
    syntax:
       setViewName("name")//"views/success.jsp"
	   
19/02/2018	   
@RequestParam("somevalue"):
  >It is use to obtain a values from query string.


Questions:
 1.What is Spring and why it is use?
 2.What are the Containers of Spring?
 3.What is IOC and DI?
 4.What is AutoWire and explain the types of AutoWire?
 5.What is SpringMVC ?
  
