// The Grab class represents the Grab() action
public class Grab {
    static WorldState grab(WorldState world) {
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
    public static boolean checkPreconditions(WorldState world) {
        return world.getRoomMonkeyIn().equals(world.getRoomBananasIn()) && world.isMonkeyHeight("HIGH");
    }
    
    // applyPostconditions applies the postconditions of the action to the given world
    private static void applyPostconditions(WorldState world){
        world.grabBananas();

    }
}