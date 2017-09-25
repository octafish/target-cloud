package uk.co.octafish.spike.target.targetservice.domain;

import org.springframework.data.annotation.Id;

public class Target {

    @Id
    private String id;

    private final String name;
    private final Location location;

    public Target(String name, Location location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "Target{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", location=" + location +
                '}';
    }

}
