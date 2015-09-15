/**
 * 
 */
package myApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import Food.Meal;

/**
 * @author Nagarjuna Yadav K
 *
 */
public class Myapp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ApplicationContext appContext = new FileSystemXmlApplicationContext("appContext.xml");
		
		Meal myMeal = new Meal();
		System.out.println(myMeal.mealContains());
		
		Meal mySpringMeal = (Meal)appContext.getBean("Meal");
		Meal mySpringMealAlt = (Meal)appContext.getBean("MealAlt");
		
		System.out.println(mySpringMeal.mealContains());
		System.out.println(mySpringMealAlt.mealContains());
		
		((FileSystemXmlApplicationContext) appContext).close();

	}

}
