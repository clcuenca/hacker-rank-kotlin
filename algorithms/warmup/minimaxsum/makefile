COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

minimaxsum:
	$(COMPILER) minimaxsum.kt $(KOTLINFLAGS) minimaxsum.jar

run:
	java -jar minimaxsum.jar < input.txt

clean:
	rm minimaxsum.jar