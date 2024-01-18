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



## Array Algos

- Searching through data structures is a common task in software development 

- With a search algorithm, you need to input data to search and the item you are trying to find

- Input: the dataset and the item to search for

- Output: true/false or the item itself 

- Linear Search also known as a Sequential Search

- BINARY SEARCH:
    - A divide and conquer algorithm where in each step it halves the number of elements it has to search through
                    M 
    EX: { 0, 7, 10, 20, 39, 54, 92 }

    We are tasked to find the number 54 
    We start our mid point in the middle of the array : AT 20 

    Since 20 is not our number and is less than 54 
    We must move the front of our pointers to 20 and the end to 92 
    This puts our midpoint at 54, (which is the number wr are searching for)
    Then we can either return true, the index or the number stating it is in the array 


- Aggregating and filtering data are common programming operations 
- Aggregating: Combining two or more data sets into one single data set
    When combining the data sets, you may want or need to filter them

<ins>Aggregating Valid Contents from Two Arrays </ins>
1. Merge arrays and then remove invalid items
2. Check each element and only keep valid items
3. Sort each array and take only valid items

