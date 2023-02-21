# Searching and Sorting Algorithms

 Linear Search
 
• Complexity - O(N).
• Linear search is a very simple search algorithm.
• Sequential search is made over all items one by one.
• Every item is checked and if a match is found then that particular item is returned.
• Otherwise the search continues till the end of the data collection.

Binary Search
 
• Complexity – O(log N)
Precondition - Array Must be sorted.
• Binary search looks for a particular item by comparing the middle most item of the collection.
• If a match occurs, then the index of item is returned.
• If the middle item is greater than the item, then the item is searched
in the sub-array to the left of the middle item.
• Otherwise, the item is searched for in the sub-array to the right of the middle item.
• This process continues on the sub-array as well until the size of the subarray reduces to zero.


 Bubble Sort
 
• Complexity of Bubble sort is O(N^2)
• Move the largest value to the end using pair-wise comparisons and swapping
• Repeat the same process for all the elements


 Selection Sort
 
• Complexity of Selection sort is O(N^2) • First find the smallest value
• Move the smallest value to the start

 Merge Sort
 
• Complexity is O(NlogN)
• Merge sort uses Divide and Conquer strategy
• Merge method merges two sorted arrays and produce one sorted array
• Steps:
• Divide the unsorted collection into two
• Keep on dividing until the sub-arrays only contain one element • Then merge the sub-problem solutions together
  
