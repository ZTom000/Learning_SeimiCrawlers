package com.ztom.learning.seimi.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.ztom.learning.seimi.model.ShiShiCaiLotteryRecord;

public interface ShiShiCaiLotteryRecordDao {
	public List<ShiShiCaiLotteryRecord> getAll();
	public boolean insert(@Param("recordId") long recordId, @Param("recordDetails") String recordDetails);
}
