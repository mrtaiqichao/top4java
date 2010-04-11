package com.taobao.top.domain;

import com.taobao.top.mapping.JsonProperty;

/**
 * Feature Data Structure.
 *
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Feature extends BaseObject {

	private static final long serialVersionUID = 1L;

	@JsonProperty("attr_key")
	private String attrKey;

	@JsonProperty("attr_value")
	private String attrValue;

	public String getAttrKey() {
		return this.attrKey;
	}
	public void setAttrKey(String attrKey) {
		this.attrKey = attrKey;
	}

	public String getAttrValue() {
		return this.attrValue;
	}
	public void setAttrValue(String attrValue) {
		this.attrValue = attrValue;
	}

}
