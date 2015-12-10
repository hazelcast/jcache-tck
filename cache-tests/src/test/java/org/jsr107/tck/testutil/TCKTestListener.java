package org.jsr107.tck.testutil;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class TCKTestListener extends RunListener {

    public TCKTestListener() {
        System.out.println("Creation of Run Listener...");
    }

    static {
        Config config = new Config();
        config.getNetworkConfig().getJoin().getAwsConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getTcpIpConfig().setEnabled(false);
        config.getNetworkConfig().getJoin().getMulticastConfig().setEnabled(false);
        Hazelcast.newHazelcastInstance(config);

        System.out.println("Hazelcast instance created ...");
    }

    @Override
    public void testStarted(Description description) throws Exception {
        System.out.println("A Test is going to start");
    }
}