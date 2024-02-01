package c29.jad.models;

import jakarta.persistence.*;

@Entity
@Table(name="gym_rooms")
public class GymRoomModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="map")
    private String map;
    @Column(name="location_name")
    private String locationName;
    @Column(name="location_address")
    private String locationAddress;
    @Column(name="location_contact")
    private String locationContact;
    @Column(name="location_max_people")
    private int locationMaxPeople;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationContact() {
        return locationContact;
    }

    public void setLocationContact(String locationContact) {
        this.locationContact = locationContact;
    }

    public int getLocationMaxPeople() {
        return locationMaxPeople;
    }

    public void setLocationMaxPeople(int locationMaxPeople) {
        this.locationMaxPeople = locationMaxPeople;
    }
}
