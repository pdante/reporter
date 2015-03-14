package reporter;


/**
 * Created by Chris on 15-03-14.
 */
public class Building {
    private String name;
    private Set<Room> rooms;

    public Building(String name, Room room) {
        this.name = name;
        rooms = new HashSet<Room>;
        rooms.add(room);
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public Set<Room> getRoom() {
        return rooms;
    }

    // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}

