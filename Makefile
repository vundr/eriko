init: docker-down-clear docker-pull docker-build docker-up
up: docker-up
down: docker-down
restart: down up

docker-pull:
	docker-compose pull

docker-up:
	docker-compose up -d

docker-build:
	docker-compose build --pull

docker-down:
	docker-compose down --remove-orphans

docker-down-clear:
	docker-compose down -v --remove-orphans