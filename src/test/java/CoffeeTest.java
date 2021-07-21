import coffee.Coffee;
import coffee.SimpleCoffee;
import coffee.WithMilk;
import coffee.WithSugar;
import org.junit.Test;


public class CoffeeTest {
    @Test
    public void testCoffee() {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getIngredients() + " $" + coffee.getCost());

        Coffee coffeeWithMilk = new WithMilk(coffee);
        System.out.println(coffeeWithMilk.getIngredients() + " $" + coffeeWithMilk.getCost());

        Coffee coffeeWithSugar = new WithSugar(coffee);
        System.out.println(coffeeWithSugar.getIngredients() + " $" + coffeeWithSugar.getCost());

    }
}
