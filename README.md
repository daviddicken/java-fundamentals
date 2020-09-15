# java-fundamentals

# Lab-01

## Methods Used:

### Main
- calls pluralize and prints what is returned to the screen
- passes in a integer to flipNHeads and prints a string to the screen using the number returned

### pluralize
- Takes in a string and a integer 
- if the integer is 1 it returns the sting passed in unchanged
- if the integer is anything but a 1 it returns the string with a s added to the end of the string

### flipNHeads
- takes in a integer
- sets a variable to keep track of the number of times flipped and a variable to track how many times in a row.
- enter a while loop
- uses Math.random to get a double between 0-1
- if number returned is at or greater then 0.5 then adds one to both variable created earlier and prints "heads to the screen.
- if the number is less then 0.5 reset the how many times in a row variable to 0 and increase number of times flipped variable by one. then print out "tails" to the screen.
- exit the while loop when when the times in a row equals the integer that was passed in.
- returns the number of times flipped

### clock
