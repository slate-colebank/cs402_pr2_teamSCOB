// The ClimbUp class represents the ClimbUp() action
public class ClimbUp {
    static WorldState climbup(WorldState world) {
        // check the preconditions, if they are valid for the given world, apply the postconditions
        WorldState resultingWorld = world.clone();
        if (checkPreconditions(world)) {
            // return a copy of the given state with the postconidtions applied
            applyPostconditions(resultingWorld);
            return resultingWorld;
        }
        return null;
    }

    // checkPreconditions checks the preconditions of the action
    static boolean checkPreconditions(WorldState world) {
        return (world.getRoomMonkeyIn().equals(world.getRoomBoxIn())) && world.isMonkeyHeight("LOW");
    }

    // applyPostconditions applies the postconditions of the action to the given world
    private static void applyPostconditions(WorldState world) {
        world.setMonkeyHeight("HIGH");
    }
}
