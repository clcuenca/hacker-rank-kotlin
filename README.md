# Hacker Rank - Kotlin

## Description

Collection of various Hacker Rank problems written in Kotlin

## Solved Categories

* **Algorithms/warmup**

## Preliminary Setup

Java & Kotlinc should be installed in your system before executing the programs, as well as being added to your PATH.
Like this:

For Java
```bash
export PATH=$PATH:"/cygdrive/C/Program Files/Java/<jdk version>/bin/"
```

For Kotlinc
```bash
export PATH=$PATH:"/cygdrive/C/kotlinc/bin/"
```
*note:* Any path should work for kotlinc (found [here](https://kotlinlang.org/docs/tutorials/command-line.html))

## Program Execution

All programs are listed in their own directory, with an input.txt included. 
The input.txt file contains test cases, and allows for additional test cases to be appended to the file.
Each of the programs has support for stdin (so far) and can be used with input redirection to execute through all
of the test cases, so the only thing that should be edited is the input.txt file itself. 
To run a program use a terminal/console, and type in the following within the corresponding directory:

```bash
java -jar <program name>.jar < input.txt
```

Each of the programs are compiled with
```bash
kotlinc <program name>.kt -include-runtime -d <program name>.jar
```
However, a makefile is included with each program to avoid typing that repeatedly.

So far this has been tested with cygwin, but the principle should hold for macOS & linux systems.
