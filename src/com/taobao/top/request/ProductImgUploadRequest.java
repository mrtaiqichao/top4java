package com.taobao.top.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.top.util.FileItem;
import com.taobao.top.util.TopHashMap;

/**
 * TOP API: taobao.product.img.upload
 * 
 * @author carver.gu
 * @since 1.0, Sep 13, 2009
 */
public class ProductImgUploadRequest implements TopUploadRequest {

	/** 产品图片编号 */
	private Long imgId;

	/** 产品编号 */
	private Long productId;

	/** 子图片文件 */
	public FileItem image;

	/** 图片序号 */
	private Integer position;

	/** 是否将该图片设为主图 */
	private Boolean primary;

	public void setImgId(Long imgId) {
		this.imgId = imgId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setImage(FileItem image) {
		this.image = image;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public void setPrimary(Boolean primary) {
		this.primary = primary;
	}

	public String getApiName() {
		return "taobao.product.img.upload";
	}

	public Map<String, String> getTextParams() {
		TopHashMap params = new TopHashMap();

		params.put("pic_id", this.imgId);
		params.put("product_id", this.productId);
		params.put("position", this.position);
		params.put("is_major", this.primary);

		return params;
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("image", this.image);
		return params;
	}

}
