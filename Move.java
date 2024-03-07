public class Move {
    static boolean move(String roomA, String roomB, WorldState world) {
        // check preconditions
        if (world.isMonkeyAt(roomA) && world.isMonkeyHeight("LOW")) {
            // set postconditions
            world.setRoomMonkeyIn(roomB);
            return true;
        } else {
            return false;
        }
    }
}
