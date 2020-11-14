# Planning

Planning is a java program which solves the following fictional problem using dynamic programming.

## Problem Statement

You are planning a road trip across the country and you will be visiting a number of different towns along the way. To keep yourself well-nourished, you will need to eat a meal in each town that you visit.

Fortunately, there are three large restaurant franchises (named A, B, and C) that are so popular they all have restaurants in every town. However, the price of their meals is not fixed, and may vary from town to town. You don't want to eat from the same restaurant two towns in a row.

Given the cost of a meal for each franchise for each town, what is the minimum amount you can spend during the trip?

## Input
Input is given in the following format: 

```bash
<number of towns n >
<town 1 prices at A, B, and C separated by spaces>
...
<town n prices at A, B, and C separated by spaces>
```

## Output
```bash
<integer representing the minimum total cost k of eating on the trip>
```

## Example IO
### Input
```bash
4
5 3 8
4 6 5
3 9 11
7 6 8
```
### Output
```bash
17
```

## Usage

```bash
javac Planning.java
java Planning
```
