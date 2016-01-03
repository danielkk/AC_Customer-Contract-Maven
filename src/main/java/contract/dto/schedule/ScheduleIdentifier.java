package contract.dto.schedule;

import java.io.Serializable;

public class ScheduleIdentifier implements Serializable{
    private final long id;

    public ScheduleIdentifier(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
