public class Push {
    static boolean push(String roomA, String roomB, WorldState world) {
        if (world.isMonkeyAt(roomA) && world.isBoxAt(roomA) && world.isMonkeyHeight("LOW")) {
            world.setRoomBoxIn(roomB);
            world.setRoomMonkeyIn(roomB);
            return true;
        } else {
            return false;
        }
    }
}
