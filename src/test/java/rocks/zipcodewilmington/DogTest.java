package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void setNameTest(){
        String expName = "Rocky";
        Date expDate = new Date();
        Integer expId = 4;

        Dog dog = new Dog(expName,expDate,expId);

        String actName = dog.getName();
        Date actDate = dog.getBirthDate();
        Integer actId = dog.getId();

        Assert.assertEquals(expName,actName);
        Assert.assertEquals(expDate,actDate);
        Assert.assertEquals(expId,actId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Dog dog = new Dog();
        String expSpeak = "bark!";
        String actSpeak = dog.speak();

        Assert.assertEquals(expSpeak,actSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate(){
        Dog dog = new Dog();
        Date expDate = new Date(3/23/12);

        dog.setBirthDate(expDate);

        Assert.assertEquals(expDate,dog.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatFoodTest(){
        int expFood = 2;
        int actFood = 0;

        Dog dog = new Dog("Rocky", new Date(), 2);
        Food food = new Food();

        dog.eat(food);
        dog.eat(food);

        actFood = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expFood, actFood);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void idTest() {
        int expDogId = 3;

        Dog dog = new Dog(null, null, expDogId);

        int actDogId = dog.getId();

        Assert.assertEquals(expDogId, actDogId);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritance() {
        Dog dog = new Dog();
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritance() {
        Dog dog = new Dog();

        Assert.assertTrue(dog instanceof Mammal);
    }
}
