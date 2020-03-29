import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Flight flight2;
    private Passenger passenger;

    @Before
    public void setUp(){
        flight = new Flight(PlaneType.BOEING747, "FR756", "GLA", "EDI", "1300");
        flight2 = new Flight(PlaneType.SMALL,"SR976", "CMB", "PIK","0520");
        passenger = new Passenger("Paul", 2);
    }

    @Test
    public void canGetNumberOfAvailableSeats(){
        assertEquals(100, flight.numberOfSeatsLeft());
    }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger);
        assertEquals(99, flight.numberOfSeatsLeft());
    }

    @Test
    public void cannotAddPassengerToFlight(){
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        flight2.addPassenger(passenger);
        assertEquals(0, flight2.numberOfSeatsLeft());
    }

}
