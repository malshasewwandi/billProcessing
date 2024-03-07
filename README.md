# ProjectByMalsha

Bill Processing Service

GitHub package:
https://github.com/malshasewwandi/billProcessing/pkgs/container/billprocessingghcr

GitHub Repository 
https://github.com/malshasewwandi/billProcessing

docker command :
docker run -p 8081:8080 ghcr.io/malshasewwandi/billprocessingghcr:latest


curl -X POST -H "Content-Type: application/json" \ -d "{\"billId\":\"1232312\",\"pathwaySequenceNo\": 313131,\"accountNo\":\"1232324124\"}" http://localhost:8081/processbill
