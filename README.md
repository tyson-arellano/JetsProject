# JetsProject

## Overview
### Here is another simple program that simulates an airfield. The air field is loaded with 5 jets that were right away that were initiated from a text file. The user is given a list of options that they can do in the application. The user can view the jets in airfield, fly jets, view fastest jet, veiw jet with longest range, have jets do jet-type specific maneuvers, add or remove jets from the fleet and quit the application. The application runs on a loop until it is quit by the user.

## Technologies Used 
* Java
* Eclipse
* Sublime
* Git/GitHub
* MacOS Terminal

## Lessons Learned
### While coding my scanner inputs I alwys want to anticipate the user typing in something unexpected, and what to do if there was an input that is not accepted. There are many different inputs that needed to be stored for later use in this one. There is one spot that the user is asked for information about adding a new jet that involves 5 subsequent inputs. At first, I coded this portion to go back to the main menu if any one of these inputs were invalid. I didn't like this because all of the information the user input up to that point is lost and the user has to start all over. I wanted to make sure that the user was forced to input a valid value at each question until a new jet is added. This involved having loops for each individual question so the user cannot move on until a valid input is detected. Overall, I think this makes the user experience much better as the loops are condensed to each input until the loop breaks when all inputs are valid, and the user enters the main loop.
### In this project I learned a lot more about constructors, method calling, loops, and iterating through arrays to find specific objects in them to display only those objects.  
