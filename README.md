Java Roman Numeral Converter Console Application.

The goal of the task was to create a Java console application that would accept a roman numeral 
between and including I to X entered by a user via the console, and to then print the numerical value
of the entered roman numeral to the console.

When the application is run, the user is prompted to enter a roman numeral in the console.
If the user enters a valid roman numeral - I, II, III, IV, V, VI, VII, VIII, IX, X -
the application converts the roman numeral to its numerical value and prints it to the console.
If the user enters anything other than a valid roman numeral - the application prints a message
to the console informing the user that what they entered is not a valid roman numeral and prompts
the user to enter a roman numeral.
Numerous tests have been incorporated into the application using junit5.

Technologies used - IntelliJ IDEA(community edition), Java(17.0.2), Maven(3.8.4), junit(5.7.1)

To run this application - 
1) fork and clone this repo
2) open in your chosen IDE
3) navigate to /roman_numerals/src/main/java in a terminal window
4) enter javac RomanNumerals.java
5) enter java RomanNumerals

To run unit tests - in terminal
1) follow the above steps 1 and 2
2) open a terminal window and enter mvn test

To run unit tests in gui
1) follow the above step 1
2) right click on src/test/java/RomanNumeralsTest.java and select Run 'RomanNumeralsTest'

User Acceptance criteria:

GIVEN
The user starts the console application and is prompted with the message Please enter a Roman Numeral.

WHEN
The user enters a roman numeral between I and X.

THEN
The application will print the conversion to the console.

The Application includes unit tests which use the JUnit 5 unit testing framework.

-------------------------------------------------------
Future improvements -
refactor convertToNumber method to include all possible roman numerals and use maths to calculate numerical value
e.g. user enters IX - we know I = 1 and X = 10 so subtract I from X and return result.


