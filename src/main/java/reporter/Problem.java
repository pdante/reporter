package reporter;

/**
 * Created by Chris on 15-03-14.
 */
public class Problem {

    private boolean fixed;
    private Room room;



    public Problem(Room room) {
        this.room = room;
        this.fixed = false;
    }


    // GETTERS

    public boolean isFixed() {
        return fixed;
    }

    public Room getRoom() {
        return this.room;
    }

   // SETTERS

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

}
