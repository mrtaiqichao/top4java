package com.taobao.top.parser;

import com.taobao.top.TopException;
import com.taobao.top.domain.CatStat;
import com.taobao.top.domain.ResponseList;
import com.taobao.top.mapping.Converter;

public class CatStatListJsonParser implements TopParser<ResponseList<CatStat>> {

	public ResponseList<CatStat> parse(String rsp) throws TopException {
		return Converter.toResponseList(rsp, CatStat.class);
	}

}
