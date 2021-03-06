package org.lightfish.business.monitoring.control.collectors.paranormal;

import org.lightfish.business.monitoring.control.collectors.AbstractRestDataCollector;
import org.lightfish.business.monitoring.control.collectors.DataPoint;
import org.lightfish.business.monitoring.control.collectors.SnapshotDataCollector;

/**
 *
 * @author Rob Veldpaus
 */
@SnapshotDataCollector
public class QueuedConnectionCollector extends AbstractRestDataCollector<Integer> {
    
    public static final String QUEUED_CONNS = "network/connection-queue/countqueued";

    @Override
    public DataPoint<Integer> collect() throws Exception{
        return new DataPoint<>("queuedConnectionCount",getInt(QUEUED_CONNS, "countqueued"));
    }
    
}
