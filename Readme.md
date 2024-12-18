## Step 1: Create container redis cache

docker pull redis:latest

### Simple create container redis cache server

docker run -d -p 6379:6379 --name simple-redis-cache-server redis:latest

## Step 2: Start souce and using redis cache
