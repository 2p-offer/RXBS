package com.wrx.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: wangyan
 * @Date: 2019/2/24
 */
@Mapper
public interface MenuDao {



	int count(Map<String, Object> map);



	
	int remove(Long menuId);
	
	int batchRemove(Long[] menuIds);
	

	List<String> listUserPerms(Long id);
}
