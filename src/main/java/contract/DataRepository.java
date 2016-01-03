package contract;

import contract.dto.departure.DepartureDetail;
import contract.dto.departure.DepartureSummary;
import contract.dto.price.PriceDetail;
import contract.dto.reservation.ReservationDetail;
import contract.dto.route.RouteDetail;
import contract.dto.route.RouteSummary;
import contract.dto.schedule.ScheduleDetail;
import contract.dto.schedule.ScheduleSummary;
import java.util.Collection;
import java.util.Date;



public interface DataRepository {
    
    //reservation stuff
    public void createReservation(long id, Date date, double price, String ticketType, String firstName, String lastName, String email, int routeId);
    public ReservationDetail getReservation(long id) throws Exception;
    public void cancelReservation(long id) throws Exception;
    
    //find schedules and stuff
    public ScheduleDetail getScheduleDetail(Date date, long routeId);
    public Collection<ScheduleSummary> getScheduleSummary(Date date);
    public DepartureDetail getDepartureDetail(long id);
    public Collection<DepartureSummary> getDepartureSummaiers();
    public RouteDetail getRouteDetail(long id);
    public Collection<RouteSummary> getRouteSummaries();

    //prices and stuff
    public Collection<PriceDetail> getPrices();
    
}
