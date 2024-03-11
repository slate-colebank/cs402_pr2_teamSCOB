// The move class represents the Move(x,y) action
public class Move {
    public static WorldState move(String roomA, String roomB, WorldState world) {
        // check the preconditions, if they are valid for the given world, apply the postconditions
        WorldState resultingWorld = world.clone();
        if (checkPreconditions(roomA, roomB, world)) {
            // return a copy of the given state with the postconidtions applied
            applyPostconditions(roomA, roomB, resultingWorld);
            return resultingWorld;
        }
        return null;
    }
    
    // checkPreconditions checks the preconditions of the action
    public static boolean checkPreconditions(String roomA, String roomB, WorldState world) {
        return world.isMonkeyAt(roomA) && world.isMonkeyHeight("LOW") && !roomA.equals(roomB);
    }
    
    // applyPostconditions applies the postconditions of the action to the given world
    public static void applyPostconditions(String roomA, String roomB, WorldState world){
        world.setRoomMonkeyIn(roomB);
    }
}
