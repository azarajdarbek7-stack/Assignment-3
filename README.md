# Assignment 3 - Sorting and Searching Algorithm Analysis

## Project Overview
This project compares the performance of sorting and searching algorithms in Java. The goal is to analyze execution time and understand algorithm efficiency using different input sizes.

## Algorithms Used

### Sorting Algorithms
- Bubble Sort (Basic Sorting)
- Merge Sort (Advanced Sorting)

**Bubble Sort Complexity:** O(n²)  
**Merge Sort Complexity:** O(n log n)

### Searching Algorithm
- Linear Search

**Linear Search Complexity:** O(n)

## Experiments
The program tests:
- Small array (10 elements)
- Medium array (100 elements)
- Large array (1000 elements)

It compares performance on:
- Random arrays
- Sorted arrays

Execution time is measured using System.nanoTime().

## Screenshots
Screenshots of program output are included in the repository (docs/screenshots folder).

## Reflection
From this experiment, I learned that Merge Sort is significantly faster than Bubble Sort for large datasets. Sorting performance depends heavily on input size. Linear Search is simple but slow for large arrays. The results match Big-O theoretical expectations.

## Author
Student: Azhar Aidarbek
