# CSC 231 - Fall 2024 - Project 1

## Learning Objectives
- Given an alphabet and language description, design *words* using that alphabet that match the description and, separately, do not match the description.
- Given an alphabet and a partially implemented finite state machine for a described language, complete the implementation of the finite state machine so that it accepts only words that are part of the described language.

## Project Description
For this project, you will continue working with the 30 cent drink machine finite state machine that was introduced on the first day of class.

### Words Accepted and Rejected
**WORK TASK**: Your task is to write four words in the file, one per line. The words should be made up of just symbols from the alphabet for the 30 cent drink machine: q, d, and n (note they are all lower-case). Remember those symbols represent quarters (25 cents), dimes (10 cents), and nickels (5 cents) respectively

- On the first two lines you should write one word per line, where each word would be *accepted* by the 30 cent drink machine.
- On the next (last two) lines, you should write one word per line, where each word would NOT be accepted by the 30 cent drink machine.

### Machine Implementation
This finite state machine simulator website, on the Input automaton tab, allows for a description of a finite state machine to be input. After being given a valid description, a machine can be visualized and words can be tested with the machine to see if each word is accepted by the machine.
**WORK TASK**: Add to the machine description, in the #transitions section, additional transitions that are needed to complete the machine. You should be adding five transitions.
