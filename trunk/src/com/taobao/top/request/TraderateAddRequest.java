package com.taobao.top.request;

import java.util.Map;

import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.traderate.add
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class TraderateAddRequest implements TopRequest {

	private Boolean anony;
	private String content;
	private Long oid;
	private String result;
	private String role;
	private Long tid;

	public void setAnony(Boolean anony) {
		this.anony = anony;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setOid(Long oid) {
		this.oid = oid;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public String getApiName() {
		return "taobao.traderate.add";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();
		params.put("anony", this.anony);
		params.put("content", this.content);
		params.put("oid", this.oid);
		params.put("result", this.result);
		params.put("role", this.role);
		params.put("tid", this.tid);
		return params;
	}

}
