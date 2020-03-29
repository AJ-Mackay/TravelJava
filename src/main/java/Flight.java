import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime){
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int numberOfSeatsLeft() {
        return this.planeType.getCapacity() - this.passengers.size();
    }

    public void addPassenger(Passenger passenger){
        if(this.numberOfSeatsLeft() > 0){
            this.passengers.add(passenger);
        }

    }
}
