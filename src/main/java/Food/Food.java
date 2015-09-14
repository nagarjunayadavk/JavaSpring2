package Food;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Food {

	private static ApplicationContext appContext;

	public static void main(String[] args) {
		//Fruit f = new Fruit();
		//Rice r = new Rice();
		//==========Using Spring =========
		  //=== Ex: FileSystemXmlApplicationContext Path ............
		//appContext = new FileSystemXmlApplicationContext("appContext.xml");
		  //=== Ex: ClassPathXmlApplicationContext ====== Path ............
				appContext = new ClassPathXmlApplicationContext("classPath/appContext.xml");
//		Fruit f = appContext.getBean("fruit", Fruit.class);
//		Rice r = (Rice)appContext.getBean("rice");

		
		
		MealPack mealPack = (MealPack) appContext.getBean("Meal");
		
//		System.out.println(f.myself());
//		System.out.println(r.myself());
//	
		System.out.println(mealPack.currentMeal());
		
       //((FileSystemXmlApplicationContext) appContext).close();
       
       ((ClassPathXmlApplicationContext) appContext).close();
	}

}
