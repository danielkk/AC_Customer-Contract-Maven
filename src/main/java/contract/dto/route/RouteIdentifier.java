package contract.dto.route;

import java.io.Serializable;

public class RouteIdentifier implements Serializable{
    private final long id;

    public RouteIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
