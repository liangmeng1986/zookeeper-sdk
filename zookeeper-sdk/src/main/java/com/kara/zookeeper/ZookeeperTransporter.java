package com.kara.zookeeper;


public interface ZookeeperTransporter {

	ZookeeperClient connect(URL url);

}
