import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    static Dog dog;

    @BeforeAll
    static void prepareData() {
        dog = new Dog("Albert", 2);
    }

//    @BeforeEach
//    void prepareData() {
//        dog = new Dog("Albert", 2);
//    }

    @org.junit.jupiter.api.Test
    void testGetDogNameMethod() {
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        dog.setName("Roman");
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Roman");
        assertEquals("Roman", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}