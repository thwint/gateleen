package org.swisspush.gateleen.queue.queuing.circuitbreaker;

import io.vertx.core.Future;

/**
 * @author https://github.com/mcweba [Marc-Andre Weber]
 */
public interface QueueCircuitBreakerStorage {

    Future<Void> resetAllEndpoints();

    Future<QueueCircuitState> getQueueCircuitState(PatternAndEndpointHash patternAndEndpointHash);

    Future<String> updateStatistics(PatternAndEndpointHash patternAndEndpointHash, String uniqueRequestID, long timestamp, int errorThresholdPercentage, long entriesMaxAgeMS, long minSampleCount, long maxSampleCount, QueueResponseType queueResponseType);
}