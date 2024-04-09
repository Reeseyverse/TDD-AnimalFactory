package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        Dog dog = new Dog();

        int expectedNumberOfDogs = 5;

        DogHouse.add(dog);DogHouse.add(dog);DogHouse.add(dog);
        DogHouse.add(dog);DogHouse.add(dog);

        int actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDogs,actualNumberOfDogs);


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        Dog dog = new Dog();
        int actual;
        int expected = 3;

        DogHouse.add(dog);DogHouse.add(dog);DogHouse.add(dog);

        DogHouse.remove(0);
        expected = 2;
        actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDog() {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        DogHouse.add(d1);DogHouse.add(d2);DogHouse.add(d3);

        DogHouse.remove(d1);
        DogHouse.remove(d2);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);



    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void dogIdTest(){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();

        DogHouse.add(d1);DogHouse.add(d2);DogHouse.add(d3);

        Dog expId = d1;
        Dog actId = DogHouse.getDogById(0);

        Assert.assertEquals(expId,actId);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void numDogsTest(){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Dog d5 = new Dog();

        DogHouse.add(d1);DogHouse.add(d2);DogHouse.add(d3);
        DogHouse.add(d4);DogHouse.add(d5);

        int expNumDogs = 5;
        int actNumDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expNumDogs,actNumDogs);
    }
}
