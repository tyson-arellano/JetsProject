# JetsProject

## Overview
### Here is a simple program that simulates an airfield. The air field is loaded with 5 jets at the beginning from a text file. The user is given a list of options that they can do in the application. The user can:
 * View the jets in airfield 
 * Fly jets 
 * View fastest jet 
 * Veiw jet with longest range 
 * Have jets do jet-type specific maneuvers
 * Add or remove jets from the fleet.
### The application runs on a loop until it is quit by the user.

## Technologies Used 
* Java
* Eclipse
* Sublime
* Git/GitHub
* MacOS Terminal

## Lessons Learned
### In this project I learned a lot more about constructors, method calling, loops, and iterating through arrays to find specific objects in them. Then taking those specific objects and displaying them.  

### While coding my scanner inputs, I always want to anticipate the user typing in something unexpected. Then figure out what to do if there was an input that is not valid. There are many different inputs that needed to be stored for later use in this one. In order to add a jet to the fleet, the user is asked for information about the new jet that involves 5 subsequent inputs. At first, I coded this portion to go back to the main menu if any one of these inputs were invalid. I didn't like this because all of the information the user input up to that point is lost and the user has to start all over. I wanted to make sure that the user was forced to input a valid value at each question until a new jet is added. This involved having loops for each individual question so the user cannot move on until a valid input is detected. Overall, I think this makes the user experience much better as the loops are condensed at each question until all inputs are valid, and a jet is added. Only then does the user enter back into the main loop.
