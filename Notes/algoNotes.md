# Algorithms

- Algorithms give a set of instructions to perform a task
- They give programs a set of instructions to perform a task 

## String Algos
- A common programming task is to search for a piece of data within a string 

- What Assumptions can you make?
    - If you know nothing about the string you have to check ever character 
    - If the string's characters are sorted, you can optimize your algorithm based on order 

- Regardless what assumptions you make, you'll need to be able to parse a string's contents 

- The LEAST complex and least efficient way to search for a subset of strings within a string is to use the built in contains method 

- Another type of software task is to create a new string based on input data 

- QUESTIONS:
1. If we wanted to find out if a certain substring existed within a string, what would we do?
    - Us the built in contains method

2. What type of data does a validation algo return?
    - Boolean (true/false)

3. How can we find out if any characters within a string s meets condition?
    - use anyMatch on a character stream of s

4. What data type has a built in reverse function?
    - StringBuilder

5. What can we use to iterate through a string and access each index within the string at the same time?
    - for loop

6. What tool or tools can we use to work with Strings more efficiently?
    - StringBuilder