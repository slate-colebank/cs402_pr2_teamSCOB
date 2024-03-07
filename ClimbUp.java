public class ClimbUp {
    static boolean climbup(WorldState world) {
        // check preconditions
        if (world.isMonkeyHeight("LOW")) {
            // set postconditions
            world.setMonkeyHeight("HIGH");
            return true;
        } else {
            return false;
        }
    }
}
