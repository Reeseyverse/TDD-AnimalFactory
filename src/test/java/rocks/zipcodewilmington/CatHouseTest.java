package rocks.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addTest(){
        Cat cat = new Cat();

        int expectedNumberOfCats = 5;

        CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);
        CatHouse.add(cat);CatHouse.add(cat);

        int actualNumberOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
        Cat cat = new Cat();

        CatHouse.add(cat);CatHouse.add(cat);CatHouse.add(cat);

        CatHouse.remove(0);
        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCat() {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();

        CatHouse.add(c1); CatHouse.add(c2); CatHouse.add(c3);

        CatHouse.remove(c1);
        CatHouse.remove(c2);

        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);


    }
    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void catByIdTest(){
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();

        Cat expected = c1 ;

        CatHouse.add(c1); CatHouse.add(c2); CatHouse.add(c3);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void NumOfCatsTest() {
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        Cat c5 = new Cat();
        Cat c6 = new Cat();

        int expected = 6;
        CatHouse.add(c1); CatHouse.add(c2); CatHouse.add(c3); CatHouse.add(c4); CatHouse.add(c5); CatHouse.add(c6);

        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);


    }
}
