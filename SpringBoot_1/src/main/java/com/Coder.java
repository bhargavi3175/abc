package com;
import javax.annotation.*;

import org.springframework.stereotype.Component;

@Component
public class Coder {
	private int cid;
	private String cname;
	private String tech;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
	@PostConstruct
	public void init() throws Exception
	{
		System.out.println("Bean Instantiated init() method");
	}
	@PreDestroy 
	public void destroy() throws Exception
	{
		System.out.println("Container has been destroyed by destroy() method");
	}
}
