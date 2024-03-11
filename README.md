# cs402_pr2_teamSCOB

monkey
- move
- grab
- push
- climb up
- climb down
box

rooms A B C are all connected



each state has:
- precons (batchest)
- postcons
- add list / delete list?

Conditions:
At(Room)
Height(Monkey)
HasBanana(Monkey)

move(x, y)
z = move(roomA, roomB)
if z = true{
    monkey(y)
    monkey(roomB)
} else {
    mokey(x)
    monkey(roomA)
}

copy the world, try a action, if false, forget it, if true, add it to the possible actions
if true continue running on these the resulting world
otherwise cut
- run heurstic on remaining world states if we need to choose (prioritize NOT moving)

start at a state
check for actions
find desired action
- add that action to the plan
do it again, with that action in mind

private String roomMonkeyIn;
private String roomBoxIn;
private String roomBananasIn;
private String monkeyHeight;
private boolean monkeyHasBananas;

array of worlds

int best
worldstate bestworld

for worlds in array
    if ((check world_A world_B) > best)
        set bestworld to winner
        set best to heruistic result