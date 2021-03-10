# Abstract syntax



The model of the project is based on events and states, which both contain instructions. Thus, both the State class and Event class extend the InstructionsSet class. We also have functions in our system, but we ended up not implementing them because it was way too tricky to add in the execution loop (rewritingrules). They still exist in the model though, at least to show that their existence is technically possible from the model's perspective.



The Goto instruction does not directly have the next state as an attribute, but rather its name, for implementation simplicity. Same goes for the currentStateName in the Program class.



Also, we use NumeralValue and RandomValue classes in order the customize the visualization more easily.



Here is the final model: ![](..\..\..\readme_files\model.png)