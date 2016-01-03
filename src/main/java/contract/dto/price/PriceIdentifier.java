package contract.dto.price;

import java.io.Serializable;

public class PriceIdentifier implements Serializable{
    private final long id;

    public PriceIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
