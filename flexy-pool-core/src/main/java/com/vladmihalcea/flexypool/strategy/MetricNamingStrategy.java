package com.vladmihalcea.flexypool.strategy;

/**
 * <code>MetricNamingStrategy</code>
 * defines the metrics naming strategy
 *
 * @author Atle Tokle
 * @since 2.2.2
 */
public interface MetricNamingStrategy {
    /**
     * Get decorated name for metric
     * @param name basic name for metric
     * @return decorated name for metric
     */
    String getMetricName(String name);

    /**
     * Use unique metric for each unique pool name
     * @return Use unique metric for each unique pool name
     */
    boolean usePoolUniqueName();
}
