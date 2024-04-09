package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

import static org.junit.Assert.*;


 /* @author leon on 4/19/18.
 */

 public class AnimalFactoryTest {

     @Test
     public void createDogTest(){
         var dog = AnimalFactory.createDog("Cocoa", new Date());
         assert(dog instanceof Dog);
     }

     @Test
     public void createCatTest(){
         var cat = AnimalFactory.createCat("Cocoa", new Date());
         assert(cat instanceof Cat);
     }
 }