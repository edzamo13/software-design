package ec.software.engineer.architecture.hexagonal.example.domainmodel.external.console;



import ec.software.engineer.architecture.hexagonal.example.domainmodel.domain.aplication.FlightService;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.domain.aplication.interfaces.BookingRepository;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.domain.aplication.interfaces.FlightRepository;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.domain.model.Flight;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.domain.model.Route;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.external.persistence.InMemoryBookingRepository;
import ec.software.engineer.architecture.hexagonal.example.domainmodel.external.persistence.InMemoryFlightRepository;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
  public void start() {
    try {
      FlightRepository flightRepository = new InMemoryFlightRepository();
      BookingRepository bookingRepository = new InMemoryBookingRepository();
      createSampleFlights(flightRepository);

      var service = new FlightService(flightRepository, bookingRepository);
      var flights = service.search(new Route("Chicago", "Dallas"), LocalDate.of(2023, 4, 3), 2);
      System.out.println(flights);
    } catch (Exception exception) {
      exception.printStackTrace();
    }

  }

  private void createSampleFlights(FlightRepository repository) {

    // Create 5 flights
    Flight flight1 = new Flight("UA101", new Route("New York", "Los Angeles"), LocalDateTime.of(2023, 4, 1, 7, 0), LocalDateTime.of(2023, 4, 1, 10, 30), 100, new BigDecimal(299.990));
    Flight flight2 = new Flight("UA102", new Route("Los Angeles", "New York"), LocalDateTime.of(2023, 4, 2, 7, 0), LocalDateTime.of(2023, 4, 2, 10, 30), 50, new BigDecimal(399.99));
    Flight flight3 = new Flight("AA201", new Route("Chicago", "Dallas"), LocalDateTime.of(2023, 4, 3, 7, 0), LocalDateTime.of(2023, 4, 3, 10, 30), 200, new BigDecimal(199.99));
    Flight flight4 = new Flight("AA202", new Route("Dallas", "Chicago"), LocalDateTime.of(2023, 4, 4, 7, 0), LocalDateTime.of(2023, 4, 4, 10, 30), 150, new BigDecimal(259.99));
    Flight flight5 = new Flight("DL301", new Route("Miami", "Seattle"), LocalDateTime.of(2023, 4, 5, 7, 0), LocalDateTime.of(2023, 4, 5, 10, 30), 300, new BigDecimal(449.99));
    Flight flight6 = new Flight("AA203", new Route("Chicago", "Dallas"), LocalDateTime.of(2023, 4, 3, 14, 0), LocalDateTime.of(2023, 4, 3, 15, 30), 200, new BigDecimal(199.99));

    // Save flights to repository
    repository.save(flight1);
    repository.save(flight2);
    repository.save(flight3);
    repository.save(flight4);
    repository.save(flight5);
    repository.save(flight6);

  }
}
