package workshop;

import java.util.UUID;

public abstract class Unit {
    private String name;
    private UUID id;

    public Unit(String name, UUID id) {
        this.name = name;
        id = UUID.randomUUID();
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Unit: " + "name = " + name + ", id = " + id;
    }
    
}
