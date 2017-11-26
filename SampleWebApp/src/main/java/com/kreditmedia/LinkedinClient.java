package com.kreditmedia;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class LinkedinClient {
	
	private String host;

	private int port;

	private SocketChannel channel;

	private static int TIMEOUT = 10000;

	public LinkedinClient(String host, int port) throws IOException {
		channel = SocketChannel.open(new InetSocketAddress(host, port));
	}

	public void sendMessage(String msg) throws IOException, InterruptedException {
		ByteBuffer buffer = ByteBuffer.wrap(msg.getBytes());
		channel.write(buffer);
		Thread.sleep(TIMEOUT);
	}
	
//	public static void main(String[] args) throws IOException {
//		LinkedinClient client = new LinkedinClient("10.1.54.91", 9093);
//		
//	}
}
