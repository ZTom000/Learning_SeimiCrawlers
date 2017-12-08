package com.ztom.learning.seimi.crawlers;

import cn.wanghaomiao.seimi.annotation.Crawler;
import cn.wanghaomiao.seimi.def.BaseSeimiCrawler;
import cn.wanghaomiao.seimi.struct.Response;
import cn.wanghaomiao.xpath.exception.XpathSyntaxErrorException;
import cn.wanghaomiao.xpath.model.JXDocument;

@Crawler(name = "shishicailottery")
public class ShiShiCaiLotteryCrawler extends BaseSeimiCrawler {

	@Override
	public String[] startUrls() {
		return new String[] { "http://www.cqcp.net/game/ssc/" };
		// return new String[] { "http://shishicai.cjcp.com.cn/chongqing/kaijiang/" };
	}

	@Override
	public void start(Response response) {
		JXDocument doc = response.document();
		// System.out.println("response.getUrl()=="+response.getUrl());
		String turl = response.getUrl();
		try {
			logger.info("url:{} {}", response.getUrl(), doc.sel("//div[@id='openlist']/ul"));
		} catch (XpathSyntaxErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
