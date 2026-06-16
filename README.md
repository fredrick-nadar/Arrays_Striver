# Array Problems - Java Solutions

A curated collection of **array-based coding problems and solutions** organized by difficulty level. This repository contains optimized Java implementations of classic array algorithms commonly asked in technical interviews.

## 📚 Repository Structure

```
Arrays/
├── Easy/           # Beginner-friendly problems
├── Medium/         # Intermediate-level challenges
├── Hard/           # Advanced problems
└── README.md       # This file
```

## 🎯 Problem Categories

### Easy Level
- **SubarraySumK.java** - Find longest subarray with sum equal to K

### Medium Level
- **TwoSum.java** - Find two elements that sum to target value (HashMap approach)
- **Kadanes.java** - Maximum subarray sum using Kadane's algorithm
- **Permutation.java** - Generate or validate permutations
- **SetMatrix.java** - Set entire row/column to zero if element is zero
- **spiralOrder.java** - Traverse matrix in spiral order
- **StringCompression.java** - Compress string sequences
- **SubarraySubKCount.java** - Count subarrays with specific sum
- **BTSS.java** - Best Time to Buy and Sell Stock
- **Alt.java** - Alternating positive-negative arrangement
- **leader.java** - Find leaders in array (element greater than all elements to the right)
- **LongestSeq.java** - Find longest consecutive sequence
- **Ninty.java** - Problem involving 90-degree rotations or transformations

### Hard Level
- **ThreeSum.java** - Find all unique triplets that sum to zero
- **FourSum.java** - Find all unique quadruplets that sum to target
- **MaxProd.java** - Maximum product subarray
- **countInversions.java** - Count inversions in array using merge sort
- **ReversePairs.java** - Count reverse pairs using merge sort
- **SubarrayCounTxORk.java** - Count subarrays with XOR equal to K
- **SubarraySum0.java** - Find longest subarray with sum equal to zero
- **MergeIntervals.java** - Merge overlapping intervals
- **MissAndRep.java** - Find missing and repeating elements
- **Merge2Arrays.java** - Merge two sorted arrays
- **MajorityII.java** - Find elements appearing more than n/3 times
- **Pascal.java** - Generate Pascal's triangle or find element in row

## 🚀 Quick Start

### Prerequisites
- Java 8 or higher
- A Java IDE (IntelliJ, VS Code, Eclipse) or command line

### Running a Solution

```bash
# Navigate to the problem directory
cd Arrays/Medium

# Compile the Java file
javac TwoSum.java

# Run the solution
java TwoSum
```

## 💡 Key Algorithms & Techniques

This repository covers essential array algorithms including:

- **Hash Map/HashMap** - O(n) lookups for two-sum type problems
- **Sliding Window** - Efficient subarray problems
- **Two Pointers** - Sorting-based approaches
- **Prefix Sum** - Subarray sum problems
- **Merge Sort** - For counting inversions and merge operations
- **Kadane's Algorithm** - Maximum subarray problems
- **XOR Operations** - Efficient bit manipulation
- **Sorting** - Foundation for many algorithms

## 📊 Complexity Analysis

Most solutions include:
- **Time Complexity** analysis
- **Space Complexity** analysis
- **Optimized approaches** with trade-offs

## 🎓 Learning Approach

1. **Start with Easy problems** to understand basic array operations
2. **Progress to Medium** for practice with common patterns
3. **Challenge yourself with Hard** problems for interview preparation
4. **Analyze the code** to understand algorithmic thinking
5. **Try variations** and edge cases

## 🔍 Common Patterns

### Subarray Problems
- Use **prefix sums** and **HashMap** for O(n) solutions
- Examples: SubarraySumK, SubarraySum0

### Sorted Array Problems
- Use **two pointers** approach
- Examples: ThreeSum, FourSum

### Maximum/Minimum Problems
- Use **Kadane's algorithm** or **dynamic programming**
- Examples: Kadanes, MaxProd

### Counting Problems
- Use **merge sort** for inversion counting
- Examples: countInversions, ReversePairs

## 💻 Code Quality

- Clean, readable Java code
- Consistent naming conventions
- Test cases in `main()` method
- Comments for complex logic

## 📝 License

This repository is for educational purposes.

## 🤝 Contributing

Feel free to:
- Optimize existing solutions
- Add alternative approaches
- Improve documentation
- Add more test cases

## ✨ Tips for Interview Preparation

1. Understand the **problem statement** completely
2. Discuss **trade-offs** between approaches
3. Write **clean, working code** first
4. Optimize after correctness
5. Test with **edge cases** (empty array, single element, duplicates)
6. Explain **time and space complexity**

---

**Happy Coding! 🚀**
