package contract.dto.ship;

import java.io.Serializable;

public class ShipIdentifier implements Serializable{
    private final long id;

    public ShipIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
