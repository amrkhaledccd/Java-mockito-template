RUN_GRADLE = bash gradlew

build:
	$(RUN_GRADLE) -x test build --daemon
.PHONY: build

test:
	$(RUN_GRADLE) test --info --daemon

run:
	$(RUN_GRADLE) :java-project-app:run  --daemon

# TODO may add linting/code formatting?