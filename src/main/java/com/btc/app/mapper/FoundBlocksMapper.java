package com.btc.app.mapper;

import com.btc.app.entity.FoundBlocks;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author cc
 * @since 2018-09-26
 */
@Mapper
public interface FoundBlocksMapper {	
	
	List<FoundBlocks> selectAll();
	
	void insert(FoundBlocks foundBlocks);
	
	void inserts(List<FoundBlocks> list);
	
	void update(FoundBlocks foundBlocks);

	void delete(Integer id);
	
	FoundBlocks findByPrimaryKey(Integer id);
	
}