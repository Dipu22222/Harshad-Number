# Harshad-Number
# Name: Dipu Mondol;<br>
# ID: IT-24040;<br>
#Language: Java; <br><br>
# Harshad Number 🔢

## Problem Statement

A **Harshad Number** (also called a Niven number) is a positive integer that is divisible by the **sum of its digits**.

Given an integer `x`, return the **sum of its digits** if `x` is a Harshad number, otherwise return `-1`.

---

## Task 1 — Find if a number is a Harshad Number

### Examples

| Input | Digit Sum | Divisible? | Output |
|-------|-----------|------------|--------|
| x = 18 | 1+8 = 9 | 18 % 9 == 0 ✅ | 9 |
| x = 23 | 2+3 = 5 | 23 % 5 != 0 ❌ | -1 |

---

## Task 2 — LeetCode Solution ✅

🔗 [LeetCode - Harshad Number](https://leetcode.com/problems/harshad-number/)

### Solution (Java)

```java
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        if (x % sum == 0) return sum;
        else return -1;
    }
}
```

### How It Works

1. **Calculate digit sum** — loop through each digit and add it up
2. **Check divisibility** — if `x % sum == 0`, it's a Harshad number
3. **Return result** — return `sum` if Harshad, else return `-1`

### Step by Step Walkthrough

**Example: x = 18**
```
sum = 0
Iteration 1: sum += 18 % 10 → sum = 8, temp = 1
Iteration 2: sum += 1  % 10 → sum = 9, temp = 0
18 % 9 == 0 ✅ → return 9
```

**Example: x = 23**
```
sum = 0
Iteration 1: sum += 23 % 10 → sum = 3, temp = 2
Iteration 2: sum += 2  % 10 → sum = 5, temp = 0
23 % 5 != 0 ❌ → return -1
```

### Complexity

| | Value |
|-|-------|
| Time Complexity | O(log x) |
| Space Complexity | O(1) |

---

## Task 3 — SPOJ Submission ⚠️

🔗 [SPOJ - HARSHAD](https://www.spoj.com/problems/HARSHAD/)

> ❌ **SPOJ server was down at the time of submission.**
> The server returned a **503 Service Unavailable** error as shown below:

![SPOJ Server Down](spoj_error.png)

```
503 Service Unavailable
No server is available to handle this request.
```


```

---

