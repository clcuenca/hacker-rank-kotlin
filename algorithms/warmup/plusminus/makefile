COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

plusminus:
	$(COMPILER) plusminus.kt $(KOTLINFLAGS) plusminus.jar

run:
	java -jar plusminus.jar < input.txt

clean:
	rm plusminus.jar