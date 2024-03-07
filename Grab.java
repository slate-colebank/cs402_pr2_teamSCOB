public class Grab {
    static boolean grab(WorldState world) {
        if (world.getRoomMonkeyIn().equals(world.getRoomBananasIn()) && world.isMonkeyHeight("HIGH")) {
            world.grabBananas();
            return true;
        } else {
            return false;
        }
    }
}
