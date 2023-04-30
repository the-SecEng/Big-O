# Big-O

With Big O, we mathematically measure the efficiency of code. It measures time complexity and space complexity, and we can compare code quality with it.

For example, we have two sets of code: code one and code two. How do we determine which one is better? Both of them accomplish the same thing, but they're written differently. Is code one better? Maybe it is easier to read. Or is code two better? Maybe there are other things about it that make code two better.

Big O is a way to mathematically figure out which of these two is better and which one runs more efficiently. If we add a stopwatch to make the point, let's say we run code one and start a stopwatch. It runs for 15 seconds. Then, we reset the stopwatch and run code two. Code two runs a lot longer than 15 seconds.

Obviously, we want our code to run as quickly and efficiently as possible. So by this measure, code one is the better code. This is what is called time complexity. But we don't measure time complexity in time; we measure it in the number of operations. We do that because if we took the same code and ran it on a faster computer, it would complete in less time, but the number of operations would be the same.

So, either way, on a fast or slow computer:

The time complexity would be the same.
The number of operations would be the same.
Also, with Big O, we measure what is called space complexity. Space complexity is the amount of memory that something uses. Code one is very fast and runs in 15 seconds, but it may use a lot of memory. On the other hand, code two runs for a longer time, maybe a full minute, but uses less memory. If using less memory is what's most important to you, then maybe code two is better.

It's a crucial and very important topic for all developers, in my opinion, to write better and more efficient code that works optimally for the job it does.
