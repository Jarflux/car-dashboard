package be.jarflux.car.core;

import be.jarflux.car.service.CarService;
import org.junit.Before;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.mockito.Matchers.any;

/**
 * Developer: Ben Oeyen
 * Date: 04/04/16
 */
public class GearServiceTest {

    private CarService carService;

    @Before
    public void before(){
        carService =  new CarService();
    }

    @Test
    public void startingGear_0(){
        //assertThat(carService.getCurrent()).isEqualTo(0);
    }

//    @Test
//    public void validShiftUp(){
//        assertThat(carService.shiftUp()).isTrue();
//        assertThat(carService.getGear()).isEqualTo(1);
//    }
//
//    @Test
//    public void MultipleShiftUp(){
//        assertThat(carService.shiftUp()).isTrue();
//        assertThat(carService.shiftUp()).isTrue();
//        assertThat(carService.shiftUp()).isTrue();
//        assertThat(carService.getGear()).isEqualTo(3);
//    }
//
//    @Test
//    public void MaxAmountShiftUp(){
//        assertThat(carService.shiftUp()).isTrue(); // 1
//        assertThat(carService.shiftUp()).isTrue(); // 2
//        assertThat(carService.shiftUp()).isTrue(); // 3
//        assertThat(carService.shiftUp()).isTrue(); // 4
//        assertThat(carService.shiftUp()).isTrue(); // 5
//        assertThat(carService.shiftUp()).isTrue(); // 6
//        assertThat(carService.getGear()).isEqualTo(6);
//    }
//
//    @Test
//    public void TooMuchShiftUp(){
//        assertThat(carService.shiftUp()).isTrue(); // 1
//        assertThat(carService.shiftUp()).isTrue(); // 2
//        assertThat(carService.shiftUp()).isTrue(); // 3
//        assertThat(carService.shiftUp()).isTrue(); // 4
//        assertThat(carService.shiftUp()).isTrue(); // 5
//        assertThat(carService.shiftUp()).isTrue(); // 6
//        assertThat(carService.shiftUp()).isFalse(); // ERROR
//        assertThat(carService.getGear()).isEqualTo(6);
//    }
//
//    @Test
//    public void MaxAmountShiftDown(){
//        assertThat(carService.shiftDown()).isTrue();
//        assertThat(carService.getGear()).isEqualTo(-1);
//    }
//
//    @Test
//    public void TooMuchShiftDown(){
//        assertThat(carService.shiftDown()).isTrue(); // -1
//        assertThat(carService.shiftDown()).isFalse(); // ERROR
//        assertThat(carService.getGear()).isEqualTo(-1);
//    }

}
