package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("server")
public class ServerProperties {

	public ServerProperties() {
		// TODO Auto-generated constructor stub
	}
	
	public static class Cluster{
		private String ip;
		private String path;
		public String getIp() {
			return ip;
		}
		public void setIp(String ip) {
			this.ip = ip;
		}
		public String getPath() {
			return path;
		}
		public void setPath(String path) {
			this.path = path;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Cluster [ip=" + ip +"path=" +path +"]";
		}
		
	}
	
	private String email;
	
	private List<Cluster> clusterList = new ArrayList<>();

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Cluster> getClusterList() {
		return clusterList;
	}

	public void setClusterList(List<Cluster> clusterList) {
		this.clusterList = clusterList;
	}

	@Override
	public String toString() {
		return "ServerProperties [email=" + email + ", clusterList=" + clusterList + "]";
	}
	
	
}
