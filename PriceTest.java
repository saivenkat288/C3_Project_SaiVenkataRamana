import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;
public class PriceTest{
	Restaurant restaurant = service.addRestaurant("Amelie's cafe","Chennai",openingTime,closingTime);
    restaurant.addToMenu("Sweet corn soup",119);
    restaurant.addToMenu("Vegetable lasagne", 269);
    @Test
	public void is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time(){
        //WRITE UNIT TEST CASE HERE
		assertEquals(388,restaurant.getTotalPrice();)
    }
}