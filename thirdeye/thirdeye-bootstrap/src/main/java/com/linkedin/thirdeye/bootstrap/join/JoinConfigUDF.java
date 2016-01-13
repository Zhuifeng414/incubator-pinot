package com.linkedin.thirdeye.bootstrap.join;

import org.apache.hadoop.mapreduce.Job;

/**
 * Simple interface to transform a Generic Record
 */
public interface JoinConfigUDF {

  /**
   * @param record
   * @return
   */
  void setJoinConfig(Job job);
}
