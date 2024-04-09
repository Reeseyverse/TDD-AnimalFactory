package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        String expectedName = "Kitty";
        Cat cat = new Cat();

        cat.setName(expectedName);

        Assert.assertEquals(expectedName, cat.getName());
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Cat cat = new Cat();
        String exSpeak = "meow!";
        String actSpeak = cat.speak();

        Assert.assertEquals(exSpeak, actSpeak);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthDateTest() {
        Cat cat = new Cat();
        Date expectedDate = new Date(3 / 4 / 23);

        cat.setBirthDate(expectedDate);

        Assert.assertEquals(expectedDate, cat.getBirthDate());


    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest() {
        int expFood = 2;
        int actFood = 0;

        Cat cat = new Cat("Kitty", new Date(), 2);
        Food food = new Food();

        cat.eat(food);
        cat.eat(food);

        actFood = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expFood, actFood);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void idTest() {
        int expCatId = 3;

        Cat cat = new Cat(null, null, expCatId);

        int actCatId = cat.getId();

        Assert.assertEquals(expCatId, actCatId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritance() {
        Cat cat = new Cat();

        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritance() {
        Cat cat = new Cat();

        Assert.assertTrue(cat instanceof Mammal);
    }
}
