
import javax.persistence.EntityManagerFactory;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dix.entity.*;

public class main {

	public static void main(String[] args)
	{
		SessionFactory sessionFactory;
		Session session;
		
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		Meal meal = new Meal();
		meal.setCalories(1111);
		meal.setComponentsRecipe("asdasdasdasdasdad");
		meal.setMealId(1);
		meal.setMethodOfPreparing("asdasdasdas");
		meal.setNameRecipe("123fsdfsdf");
		meal.setShourtDescribe("asdasdasda");
		session.save(meal);
		session.getTransaction().commit();
		session.close();	
		
		//Diets diets = new Diets(1, "hello", "aaaaaaaaaa", "asdaaqqwe", 122, "asdasda");
		//Diets diets2 = new Diets(2, "hello1", "aaaaaaaaaa", "asdaaqqwe", 1212, "asdasda");
		//Diets diets3 = new Diets(3, "hello3", "aaaaaaaaaa", "asdaaqqwe", 1122, "asdasda");
		//DietsDaoImpl daoDietsImpl = new DietsDaoImpl();
		//daoDietsImpl.setMeal(diets);
		//daoDietsImpl = new DietsDaoImpl();
		//daoDietsImpl.setMeal(diets2);		
		//daoDietsImpl = new DietsDaoImpl();
		//daoDietsImpl.setMeal(diets3);
		//Diets dietGfet = new Diets();
		//dietGfet = daoDietsImpl.getMeal(3);
		//System.out.println(dietGfet.getName());
		//System.out.println(dietGfet.getCalories());
		//System.out.println(dietGfet.getComponents());
		//System.out.println(dietGfet.getDescription());
		//System.out.println(daoDietsImpl.getAllMeals1().get(0));

		
	}

}