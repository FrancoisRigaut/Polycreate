# Rewriting rules

## What is implemented

The main run loop is implemented. We use a simple while(true) running the currentState, and we just switch up this variable when we want. The events are scanned at each loop step, in order to be able to fire them at any moment. They also have to be checked during some instructions, such as GoForward.



## What is left to be implemented

The synchronization with the robot (steps, waiting times and angles and speed calibrating) is not done at all, because we were low on time. Also, some events and actions relative to the object detection are also not done.