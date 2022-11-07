import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    public void createCar() {
        car = new Car("Skoda", "ABC-1234", 2019, "Victor");
    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("ABC-1234", car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("ABCD-1234");
        assertEquals("ABCD-1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2019, car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Victor", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Olga");
        assertEquals("Olga", car.getOwner());
    }

    @Test
    void getListOfOwners() {
        assertArrayEquals(new String[]{"Victor"},
                car.getOwners().toArray());
    }

    @Test
    void getListOfTwoOwners() {
        car.setOwner("Olga");
        assertArrayEquals(new String[]{"Victor", "Olga"},
                car.getOwners().toArray());
    }

//    @Test
//    public void testMethod() {
//        car.
//    }
}