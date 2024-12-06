## Project 2 Explanation

### Branching
Branching was used in state s0 to handle whether the first element in the input was an A, C, or T which lead to different states each. If the first letter was a G, the next state would be the (implicit) trash state because there are no accepted words that start with G.

### Looping
Looping was used in this FSM between states s8 and s10. For the second definition of words this machine would accept, since there is no upper limit on how many combinations of "AT" should follow the first string of "TATAT", I implemented a loop to go back and forth between these two states for successive combinations of "AT", making sure that the word is only accepted if it is "AT" at the end, not just "A". 

### Linear Ordering Of Transitions
Linear ordering of transitions is the type of transition used most in this FSM; one example is in the transition between s5 and s7, when T is the element for current state s5, the next state is s7. 
