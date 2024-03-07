public class ClimbDown {
    static boolean climbdown(WorldState world) {
        // check preconditions
        if (world.isMonkeyHeight("HIGH")) {
            // set postconditions
            world.setMonkeyHeight("LOW");
            return true;
        } else {
            return false;
        }
    }
}
