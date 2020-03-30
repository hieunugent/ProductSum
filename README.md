# ProductSum
  - require: write a function that take an array and return its product sum.
  - the input array is non-empty array and it contains either integer or other arrays.
  - the product sum is understand that it will take the sum of all element respect to the deep of level of array
  - ex1: [x, y] output is x + y
  - ex2: [x, y,[z, j]] output is x + y + 2z +2j
# Solution:
  - Using an helper function that carry two parameters,
    - first one is  List arrays to process
    - second parameter is the level of the current process.
  - if it is the type of input array or mean a special type call the recursive function with increase of level
  - else it will call the sum of current will the current sum to sum all element same level
  - exit the recursive level with the multiplication with sum
