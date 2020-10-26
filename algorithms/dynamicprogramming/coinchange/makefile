COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

coinchange:
	$(COMPILER) coinchange.kt $(KOTLINFLAGS) coinchange.jar

run:
	java -jar coinchange.jar < input.txt

clean:
	rm coinchange.jar