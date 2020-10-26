COMPILER=kotlinc
KOTLINFLAGS=-include-runtime -d

birthdaycakecandles:
	$(COMPILER) birthdaycakecandles.kt $(KOTLINFLAGS) birthdaycakecandles.jar

run:
	java -jar birthdaycakecandles.jar < input.txt

clean:
	rm birthdaycakecandles.jar