import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @org.junit.jupiter.api.Test
    void getName() {
        Dog dog = new Dog("Albert", 2);
        assertEquals("Albert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        Dog dog = new Dog("Albert", 2);
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