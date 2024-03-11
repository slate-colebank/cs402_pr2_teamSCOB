// The planner class is able to find the possible actions given a current state and 
// analyze and choose the next action for the monkey to take
import java.util.ArrayList;
import java.util.Arrays;

public class Planner {
   public static final ArrayList<String> rooms = new ArrayList<>(Arrays.asList("A", "B", "C"));
   public static final ArrayList<String> box = new ArrayList<>(Arrays.asList("Box1"));
   public static final ArrayList<String> height = new ArrayList<>(Arrays.asList("Low", "High"));
   public WorldState perfectWorld;

   // checkActions goes through every possible action that the monkey can execute
   // all possible actions are added to a list and returned
   public ArrayList<WorldState> checkActions(WorldState world) {
      ArrayList<WorldState> possibleActions = new ArrayList<>();
      // check every move action
      checkMoveActions(possibleActions, world);

      // check every push action
      checkPushActions(possibleActions, world);

      // check climb up and climb down
      checkClimbUpAction(possibleActions, world);
      checkClimbDownAction(possibleActions, world);
      
      // check grab
      checkGrabAction(possibleActions, world);

      return possibleActions;
   }

   // The checkMoveActions function adds all the possible move actions to the possible actions list
   public void checkMoveActions(ArrayList<WorldState> possibleActions, WorldState world) {
      for (String roomA : rooms) {
         for (String roomB : rooms) {
            WorldState possibleMove = Move.move(roomA, roomB, world);
            if (possibleMove != null) {
               possibleMove.setLastAction("Move(" + roomA + "," + roomB + ")");
               possibleActions.add(possibleMove);
            }
         }
      }
   }

   // The checkPushActions function adds all the possible push actions to the possible actions list
   public void checkPushActions(ArrayList<WorldState> possibleActions, WorldState world) {
      for (String roomA : rooms) {
         for (String roomB : rooms) {
            WorldState possiblePush = Push.push(roomA, roomB, world);
            if (possiblePush != null) {
               possiblePush.setLastAction("Push(" + roomA + "," + roomB + ")");
               possibleActions.add(possiblePush);
            }
         }
      }
   }

   // The checkClimbUpAction function adds all the possible climbUp actions to the possible actions list
   public void checkClimbUpAction(ArrayList<WorldState> possibleActions, WorldState world) {
      WorldState possibleClimbUp = ClimbUp.climbup(world);
      if (possibleClimbUp != null) {
         possibleClimbUp.setLastAction("ClimbUp()");
         possibleActions.add(possibleClimbUp);
      }
   }
   
   // The checkClimbDownAction function adds all the possible climbDown actions to the possible actions list
   public void checkClimbDownAction(ArrayList<WorldState> possibleActions, WorldState world) {
      WorldState possibleClimbDown = ClimbDown.climbup(world);
      if (possibleClimbDown != null) {
         possibleClimbDown.setLastAction("ClimbDown()");
         possibleActions.add(possibleClimbDown);
      }
   }

   // The checkGrab function adds all the possible grab actions to the possible actions list
   public void checkGrabAction(ArrayList<WorldState> possibleActions, WorldState world) {
      WorldState possibleGrab = Grab.grab(world);
      if (possibleGrab != null) {
         possibleGrab.setLastAction("Grab()");
         possibleActions.add(possibleGrab);
      }
   }

   // the bestWorld function finds the best world according to the heuristic from
   // a list of worldStates
   public WorldState bestWorld(ArrayList<WorldState> worldStates) {
      // bestworld starts as the first world in the list
      // whenever a better world is found, it is replaced with that world
      WorldState bestworld = worldStates.get(0);
      for (WorldState world : worldStates) {
         bestworld = checkTwoWorlds(bestworld, world);
      }
      return bestworld;
   }

   // the checkTwoWorlds function compares two worldstates that represent moves
   // and returns the best one based on the heuristic
   public WorldState checkTwoWorlds(WorldState world_a, WorldState world_b) {
      if (heuristic(world_a) > heuristic(world_b)) {
         return(world_a);
      } else {
         return(world_b);
      }
   }

   // the heuristic function evaluates a world and gives it a score
   public int heuristic(WorldState world) {
      int score = 0;
      // check all elements of the worldstate and return the total score
      if (world.getRoomMonkeyIn().equals(perfectWorld.getRoomBananasIn())) {
         score += 15;
      }

      if (world.getMonkeyHeight().equals(perfectWorld.getMonkeyHeight())) {
         score += 25;
      }

      if (world.getRoomBoxIn().equals(perfectWorld.getRoomBoxIn())) {
         score += 100;
      }

      if (world.getRoomMonkeyIn().equals(world.getRoomBoxIn())) {
         score += 50;
      }

      if (world.getMonkeyHasBananas()) {
         score += 500;
      }

      return score;
   }
}

