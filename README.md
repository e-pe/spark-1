# spark-1
spark-submit 
  --deploy-mode cluster --class org.translatorapp.TranslatorApp --master yarn --verbose s3://spark-jars-test/translatorapp-1.0.jar TranslatorApp s3://spark-jars-test/book.txt s3://spark-jars-test/book-de.txt German
