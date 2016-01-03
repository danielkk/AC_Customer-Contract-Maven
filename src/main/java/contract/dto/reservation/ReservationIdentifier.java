package contract.dto.reservation;

import java.io.Serializable;

public class ReservationIdentifier implements Serializable{
    private final long id;

    public ReservationIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
