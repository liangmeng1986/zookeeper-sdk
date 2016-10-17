package com.kara.zookeeper.curator;

import com.kara.zookeeper.URL;
import com.kara.zookeeper.ZookeeperClient;
import com.kara.zookeeper.ZookeeperTransporter;


public class CuratorZookeeperTransporter implements ZookeeperTransporter {

	public ZookeeperClient connect(URL url) {
		return new CuratorZookeeperClient(url);
	}

}
