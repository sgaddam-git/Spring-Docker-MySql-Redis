# Description: Start the local redis stack
# Starts up Redis Stack server and RedisInsight.
# Connect to Redis on port 63791
# View Redis data through RedisInsight on http://localhost:8001/redis-stack/browser

docker run -d --rm --name redis-stack -p 63791:6379 -p 8001:8001 redis/redis-stack:latest