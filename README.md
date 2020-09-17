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
- grabs the current time and reformatts it to hh:mm:ss and save it to a variable
- enters a forever loop
- grab a new current time and save it to a variable
- checks to see if the two time variables are different
- if different change first variable to new current time
- test counter against if else statement to pick correct string to be displayed
- else continue looping user needs to hit cntrl c to quite program
- created a counter variable to hold how many times while loop is ran per second reset to 0 everytime time is printed to screen

### clockString
- pass in time string, counter, base number(1 billion, 1 million, 1 thousand), hertz string
- do the math to to find out how mant millions or billions then use % to find out remainder
- print out string to the screen with time/ math that was done for speed and hertz that was passed in


# Lab 02

### roll
- takes a integer and returns an array of random numbers between 1-6 the length of integer passed in.

### containsDuplicates
- takes a array of integers test for duplicates and returns a boolean of true or false.

### calcAvg
- takes a array of integers and return a average(double) of integers

### arrayAvg
- takes a array of int arrays and returns the array with the lowest average

# Lab 03

### analize
- Takes in an array of int arrays. Returns a string telling user the highest and lowest integer and any integers between the high and low that were not used.

### tally
-  Takes a List of Strings that represents votes and returns a string that tells who got the most votes.