# CC11-CC12 Final Project 
 Repository for Final Project Set 1

Towers of Hanoi

The Problem
Every budding computer scientist must grapple with certain classic problems, and the Towers of
Hanoi (see figure below) is one of the most famous of these. Legend has it that in a temple in the
Far East, priests are attempting to move a stack of disks from one peg to another. The initial stack
had 64 disks threaded onto one peg and arranged from bottom to top by decreasing size. The priests
are attempting to move the stack from this peg to a second peg under the constraints that exactly
one disk is moved at a time, and at no time may a larger disk be placed above a smaller disk. A third
peg is available for temporarily holding the disks. Supposedly the world will end when the priests
complete their task, so there is little incentive for us to facilitate their efforts.

Let’s assume that the priests are attempting to move the disks from peg 1 to peg 3. We wish to
develop an algorithm that will print the precise sequence of disk-to-disk peg transfers.

If we were to approach this problem with conventional methods, we’d rapidly find ourselves
hopelessly knotted up in managing the disks. Instead, if we attack the problem with recursion in
mind, it immediately becomes tractable. Moving n disks can be viewed in terms of moving only
n – 1 disks (and hence the recursion) as follows:

a Move n –1 disks from peg 1 to peg 2, using peg 3 as a temporary holding area.
b Move the last disk (the largest) from peg 1 to peg 3.
c Move the n – 1 disks from peg 2 to peg 3, using peg 1 as a temporary holding area.

The process ends when the last task involves moving n = 1 disk, i.e., the base case. This is
accomplished by trivially moving the disk without the need for a temporary holding area.
Write a program to solve the Towers of Hanoi problem. Use a recursive function with four
parameters:

a The number of disks to be moved
b The peg on which these disks are initially threaded
c The peg to which this stack of disks is to be moved
d The peg to be used as a temporary holding area

Your program should print the precise instructions it will take to move the disks from the starting
peg to the destination peg. For example, to move a stack of three disks from peg 1 to peg 3, your
program should print the following series of moves:

1 → 3 (This means move one disk from peg 1 to peg 3.)
1 → 2
3 → 2
1 → 3
2 → 1
2 → 3
1 → 3

Input
The input will just be a single integer representing the number of initial disks.

Output
The output of the program is the step by step process of transferring the disks from peg 1 to peg 3.
For every line, it contains an integer representing the peg in which the disk is placed, followed by
an arrow represented by the string “-->”, then lastly another integer representing the peg in which
the disk will be transferred.

Sample Input
5

Sample Output
1 --> 3
1 --> 2
3 --> 2
1 --> 3
2 --> 1
2 --> 3
1 --> 3
1 --> 2
3 --> 2
3 --> 1
2 --> 1
3 --> 2
1 --> 3
1 --> 2
3 --> 2
1 --> 3
2 --> 1
2 --> 3
1 --> 3
2 --> 1
3 --> 2
3 --> 1
2 --> 1
2 --> 3
1 --> 3
1 --> 2
3 --> 2
1 --> 3
2 --> 1
2 --> 3
1 --> 3

--------------------------------------------------------------------------------------------------------------
Minesweeper

The Problem
Have you ever played Minesweeper? It's a cute little game which comes within a certain Operating
System which name we can't really remember. Well, the goal of the game is to find where all the
mines within an M × N field are. To help you, the game shows a number in a square which tells you
how many mines there are adjacent to that square. For instance, suppose the following 4 ×4 field
with 2 mines (which are represented by an * character):

*...
....
.*..
....

If we would represent the same field placing the hint numbers described above, we would end up
with:

*100
2210
1*10
1110

As you may have already noticed, each square may have at most 8 adjacent squares.

The Input
The first line of input contains two integers n and m (0<n ,m≤100) which stands for the number of
lines and columns of the field respectively. The next n lines contain exactly m characters and
represent the field. Each safe square is represented by an "." character (without the quotes) and each
mine square is represented by an "*" character (also without the quotes).

The Output
The next n lines should contain the field with the "." characters replaced by the number of adjacent
mines to that square. There must be an empty line between field outputs.

Sample Input
4 4
*...
....
.*..
....

Sample Output
*100
2210
1*10
1110

--------------------------------------------------------------------------------------------------------------
F.L.A.M.E.S.

The Problem
F.L.A.M.E.S. is a popular love calculator that is able to predict the relationship between you and
your crush. The game goes like this:

 First, write the complete name of the two persons you want to calculate.
 Second, cross out all the letters that are common between Person A and Person B.
 Next, count all the letters that were not crossed out. Let us call this the love value.
 Lastly, count from 1 all the way to the love value while iterating through the letters F, L, A,
  M, E, and S. If the counting goes beyond the letter S, go back again to F and continue.
 If all the letters are crossed out for both names, they are said to be just Friends.

Your program should be able to simulate the F.L.A.M.E.S. Love Calculator. Every letter represents
a particular meaning. See the table below.

Letter Meaning
F Friends
L Lovers
A Acquaintance
M Married
E Enemies
S Sweethearts

Input
The first line contains an integerT (1≤T ≤ 100), the number of test cases. T test cases follow. Each
test case will consist of two lines of letters and space characters which corresponds to the names of
the two persons; one name per line. No name will exceed 255 characters.

Output
For each test case, output one line containing “Case #x:” followed by the meaning of the result.

Sample Input
1
Juan dela Cruz
Maria la del Barrio
Sample Output

Case #1: Enemies

--------------------------------------------------------------------------------------------------------------
Primary Arithmetic

The Problem
Children are taught to add multi-digit numbers from right-to-left one digit at a time. Many find the
"carry" operation - in which a 1 is carried from one digit position to be added to the next - to be a
significant challenge. Your job is to count the number of carry operations for each of a set of
addition problems so that educators may assess their difficulty.

Input
The first line contains T (1≤T ≤ 100), representing the number of test cases. The succeeding T lines
will contain pairs of unsigned integers that will be added.

Output
For each test case, output one line containing “Case #x:” followed by the number of carry
operations when adding the pair of unsigned integers.

Sample Input
3
123 456
555 555
123 594

Sample Output
Case #1: No carry operation.
Case #2: 3 carry operations.
Case #3: 1 carry operation.

Base 16

The Problem
Unlike the decimal number system (base 10), the hexadecimal system (base 16) with its 16 digits (0,
1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F) allows for more compact representation of numbers. One of
the many nice things that can be done with hexadecimal numbers is adding them. Example:
A + 5 = F
AA + 11 = BB
AA + FF = 1A9
The process of adding two hex numbers is similar to adding decimal numbers. Your task is to get
the sum of a pair of hex numbers.

Input
The first line contains an integer T (1≤T ≤ 100), indicating the number of pairs of hex numbers that
follow. Each additional line will contain two hexadecimal numbers.

Output
For each test case, output a line containing the string “Case #x: ” followed by the sum of the
corresponding pairs of hexadecimal numbers.

Sample Input
3
8 3
59 A7
4fe 20

Sample Output
Case #1: B
Case #2: 100
Case #3: 51E
Hint: You may use appropriate available format specifier provided by C.

--------------------------------------------------------------------------------------------------------------
Too Large to Handle

The Problem
Java can hold whole numbers using the data types int and long. However, these values have
limited range of values only, having long with wider range. For this programming problem, you
have to make a program that can get the sum of two very large numbers that these two primitive
data types cannot hold.

Input
The first line contains an integer T (1≤T ≤100), indicating the number of pairs of large numbers
that follow. Each additional line will contain two large numbers. The numbers will be positive and
of arbitrary length, but a maximum of 50 digits.

Output
For each test case, output one line containing “Case #x: ” followed by the sum of the
corresponding pairs of large numbers.

Sample Input
4
1234242352345234 78534534534
35345 475467332
2345345634636 234534512
12367674 886235423345

Sample Output
Case #1: 1234320886879768
Case #2: 475502677
Case #3: 2345580169148
Case #4: 886247791019

--------------------------------------------------------------------------------------------------------------
Parity Property

The Problem
A Boolean matrix (a matrix where all elements are either 1 or 0 only) has the parity property when
each row and each column has an even sum, i.e. it contains an even number of bits which are set.
Here’s a 4x4 matrix which has the parity property:

[1 0 1 0
 0 0 0 0
 1 1 1 1
 0 1 0 1]

The sums of the rows are 2, 0, 4, and 2. The sums of the columns are 2, 2, 2, and 2.
Your job is to write a program that reads in a matrix and checks if it has the parity property.

Input
The first line contains one integer T (1≤T ≤100), the number of test cases. T test cases follow. The
first line in every test case contains one integer N (N<10), representing the size of the square
matrix. On the next N lines, there will be N integers per line. Assume that no other integers than 0
and 1 will occur in the matrix.

Output
For each test case, output the line containing “Case #x: ” followed by “OK” if the matrix has
the parity property and “NOT OK” if it does not have the parity property.

Sample Input
3
4
1 0 1 0
0 0 0 0
1 1 1 1
0 1 0 1
5
1 0 1 1 1
1 0 0 0 0
1 0 1 1 1
0 0 0 0 1
0 0 0 0 0
3
1 0 1
0 1 0
1 0 1

Sample Output
Case #1: OK
Case #2: NOT OK
Case #3: NOT OK

--------------------------------------------------------------------------------------------------------------
New Programming Language

The Problem
JR wants to write his own programming language. He was already able to identify the rules for
naming identifiers. Below are the rules:
 Only English letters, even digits (0, 2, 4, 6, 8), the number sign (#), or the underscore (_) can
be used
 It cannot begin with a digit
 Maximum length is 20 characters
 Identifiers are case-sensitive

Your job is to create a program that determines whether an identifier is valid or not, based form the
rules above.

Input
The first line contains an integer T (1≤T ≤100), the number of test cases. T test cases follow. Each
test case will consist of a line of string which will not exceed 255 characters. Spaces will not appear
at the start or end of a line.

Output
For each test case, output one line containing “Case #x: ” followed by a “VALID” or a “NOT
VALID”.

Sample Input
3
valid
2ne1
first#
Sample Output
Case #1: VALID
Case #2: NOT VALID
Case #3: VALID

--------------------------------------------------------------------------------------------------------------
Normal Form

The Problem
An expression of the form
D days, H hours, M minutes, S seconds
(where D, H, M, and S are nonnegative integers) describe a duration. Such an expression is said to
be in normal form if D>0, 0<H <24, 0<M <60, and 0<S<60. For example, each of the following
is in normal form:
5 days, 16 hours, 12 minutes, 53 seconds
13 days, 45 minutes, 16 seconds
21 hours, 8 minutes
36 minutes

Notice how we omit mention of any unit of measure that is not needed (because corresponding
number of units is zero). In the third expression above, for instance, we mention neither days nor
seconds.

In contrast to the above, none of the following expressions is in normal form: the first because the
number of hours exceeds 23; the second because the number of seconds exceeds 59; and the third
because the number of hours is mentioned when it need not be.
5 days, 49 hours, 33 minutes
2 days, 7 hours, 5 minutes, 93 seconds
1 days, 0 hours, 51 minutes, 4 seconds

You are to develop a program that, given as input a duration (in the form of a sequence of four
nonnegative integers representing number of days, hours, minutes, and seconds, respectively),
produces as output the same duration but expressed in normal form.

Input
The first line contains an integer T (1≤T ≤ 100), the number of test cases. T test cases follow. Each
test case will contain a description of a duration in the form of four nonnegative integers (separated
by one or more spaces) representing number of days, hours, minutes, and seconds, respectively.

Output
For each test case, output the line containing “Case #x: ” followed by the duration provided but
in normal form.

Sample Input
4
5 49 33 0
2 7 5 3573
1 0 67 120
5 2 43 15

Sample Output
Case #1: 7 days, 1 hours, 33 minutes
Case #2: 2 days, 8 hours, 4 minutes, 33 seconds
Case #3: 1 days, 1 hours, 9 minutes
Case #4: 5 days, 2 hours, 43 minutes, 15 seconds

--------------------------------------------------------------------------------------------------------------
Reverse Words

The Problem
Given a list of space separated words, reverse the order of the words. Each line of text contains L
letters and W words. A line will only consist of lowercase letters and space characters. There will be
exactly one space character between each pair of consecutive words.

Input
The first line contains an integer T (1≤T ≤ 100), the number of test cases. T test cases follow. Each
test case will consist of a line of lowercase letters and space characters indicating a list of space
separated words. Spaces will not appear at the start or end of a line. The number of characters in
each line will not exceed 255.

Output
For each test case, output one line containing “Case #x: ” followed by the list of words in
reverse order.

Sample Input
3
hello world
foobar
all about that bass

Sample Output
Case #1: world hello
Case #2: foobar
Case #3: bass that about all
