# Hacker Rank - Kotlin

## Description

Collection of various Hacker Rank problems written in Kotlin.

## Categories in Progress

* **Algorithms**

## Structure

This repository aims to keep each category & sub categories in their own directory to reflect the structure of Hacker Rank's problem sets; e.g. algorithms -> warmup -> *problem*. Each problem will compile & able to be ran on the command line as well as, include a makefile & input.txt file to display the results. Each program is designed to consume the included input file.

## Program Execution

The following command is used to execute each of the programs:

```bash
java -jar <program name>.jar < input.txt
```

Additionally, a 'run' command is included with each makefile.

## Program Compilation

Each program has been compiled with the following command (included in the corresponding makefile):

```~$ $kotlinc <program name>.kt -include-runtime -d <program name>.jar```

At the time of writing, the compilation & execution of each of the programs has been done with Cygwin.

## Setup

The compilation & execution of each program requires a Java JDK & kotlinc (Kotlin Compiler) (found [here](https://kotlinlang.org/docs/tutorials/command-line.html). After installation of Java and/or kotlinc both should be saved in the PATH variable like:

For Java
```bash
export PATH=$PATH:"/cygdrive/C/Program Files/Java/<jdk version>/bin/"
```

For Kotlinc
```bash
export PATH=$PATH:"/cygdrive/C/kotlinc/bin/"
```

*note:* Any path is acceptable for kotlinc

Compilation & execution has been tested with Cygwin