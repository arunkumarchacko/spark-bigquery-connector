package com.google.cloud.spark.bigquery.integration;

import com.google.cloud.spark.bigquery.BigQueryConnectorUtils;

public class Spark24QueryPushdownIntegrationTest extends QueryPushdownIntegrationTestBase {
  public Spark24QueryPushdownIntegrationTest() {
    BigQueryConnectorUtils.enablePushdownSession(spark);
  }
}
