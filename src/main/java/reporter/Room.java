package reporter;

/**
 * Created by Chris on 15-03-14.
 */
public class Room {
    private String roomNumber;
    private Building building;

    public Room(String roomNumber, Building building) {
        this.roomNumber = roomNumber;
        this.building = building;
    }

    // GETTERS

    public String getRoomNumber() {
        return roomNumber;
    }

    public Building getBuilding() {
        return building;
    }

    // SETTERS

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

}
