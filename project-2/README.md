# CSC 231: Fall 2024 - Project 2: FSM Design and Implementation

## Context
- Design a finite state machine that recognizes the exact set of words in that language.
- Implement in Java in a tabular from your designed finite state machine.

## Work
The alphabet for the machine is the four symbol set {A, C, G, T} (the DNA alphabet). The language your finite state machine should recognize is described as words that have the following structure:
- CGG with an optional A on the front and an optional A on the back (so, CGG, ACGG,CGGA, and ACGGA).
- T followed by two or more instances of AT (so, TATAT, TATATAT, TATATATAT, ...).
