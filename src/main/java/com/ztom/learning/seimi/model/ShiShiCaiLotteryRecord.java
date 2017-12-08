package com.ztom.learning.seimi.model;

import java.util.Date;

public class ShiShiCaiLotteryRecord {
	private long recordId;
	private String recordDetails;
	private Date lotteryTime;
	private Date createTime;
	
	public long getRecordId() {
		return recordId;
	}
	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}
	public String getRecordDetails() {
		return recordDetails;
	}
	public void setRecordDetails(String recordDetails) {
		this.recordDetails = recordDetails;
	}
	public Date getLotteryTime() {
		return lotteryTime;
	}
	public void setLotteryTime(Date lotteryTime) {
		this.lotteryTime = lotteryTime;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
