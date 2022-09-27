- Vector encoder - https://tfhub.dev/google/universal-sentence-encoder/4
- Dense vector - https://www.elastic.co/guide/en/elasticsearch/reference/7.17/dense-vector.html
- Search - https://www.elastic.co/guide/en/elasticsearch/reference/7.17/query-dsl-script-score-query.html#vector-functions

How to run
1. Download https://tfhub.dev/google/universal-sentence-encoder/4
   a. unpack it
   b. move it to /src/main/resources/universal-model directory
2. Run ElasticSearch 7.xx locally - https://www.elastic.co/downloads/past-releases#elasticsearch
3. Create index and load data - run /src/main/resources/elastic/LoadData.http
4. Search - run /src/main/resources/elastic/search.http


Main method just converts some hardcoded strings into vectors. Some of them are part of indexing script, one of them is
used for a search itself.
If you want to get a vector or some other string, just change it there and run it. It will print it to the output.