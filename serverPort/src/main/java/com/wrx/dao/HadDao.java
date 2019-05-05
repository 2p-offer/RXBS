package com.wrx.dao;

import com.wrx.api.HadGo;
import com.wrx.api.WantGo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: wangyan
 * @Date: 2019/5/4
 */
@Component
public interface HadDao {

    @Select("SELECT * FROM hadgo ")
   public List<HadGo> getAll();

    @Select("select * from hadgo where id = #{id}")
    public HadGo getDataById(int id);

    @Insert("insert into hadgo(address,time,pingjia,photo) values (#{address},#{time},#{pingjia},#{photo})")
    public void addData(HadGo hadGo);
}
