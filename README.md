# Here, the following tasks are implemented:

Write a program with the following functionality:
Pass a string as input (we will assume that this is a standard document number in a given format).
The document number has the format xxxx-yyy-xxxx-yyy-xyxy, where x is any digit, and y is a letter of the Latin alphabet (can be upper or lower case).
1. Display the first two blocks of 4 digits on one line.
2. Display the document number, but replace the blocks of three letters with *** (each letter will be replaced with *).
3. Display only the letters from the document number in the format yyy/yyy/y/y in lower case.
4. Display the letters from the document number in the format "Letters:yyy/yyy/y/y" in upper case (implemented using the StringBuilder class).
5. Check whether the document number contains the sequence "abc" and display a message whether it does or not (moreover, abc and ABC are considered the same sequence).
6. Check if the document number starts with the sequence 555.
7. Check if the document number ends with the sequence 1a2b.
8. 
All these methods are implemented in a separate class in static methods, each task - in a separate method.
