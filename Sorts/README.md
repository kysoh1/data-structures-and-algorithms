# Bubble Sort
Naively compares adjacent pairs and swapping them if they aren't in order.
After 'i' iterations, the previous items should already be sorted since the largest element
will swap to the end of the array.

# Insertion Sort
Passes through the whole array and compares elements to the left element to determine its position, 
if they are out of order then swap.

# Selection Sort
The algorithm maintains two subarrays, one sorted and unsorted. Elements are added to the sorted 
subarray by taking the smallest element in the unsorted subarray, this is repeated until the unsorted
subarray is empty.

# Merge Sort
Merge sort divides the array until all elements form their own array of size one (sorted since only one item). 
From there, the individual elements are compared and merged to form a sorted array.

# Quick Sort
A pivot representing an element in the array is selected, the array is divided such that elements to the left of
the pivot are less than or equal to the pivot and elements on the right side are greater. Two tracking variables
left index and right index start from opposite ends of the array and increment towards each other, during each 
iteration the element is compared to the pivot to determine whether its smaller or larger, then swapped if they
are out of order.

