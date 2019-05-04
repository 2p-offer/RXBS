package com.wrx.dao;

import com.wrx.api.WantGo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author: wangyan
 * @Date: 2019/5/4
 */
@Component
public interface WantDao {

    @Select("SELECT * FROM wantgo ")
   public List<WantGo> getAll();

    @Select("select * from wantgo where id = #{id}")
    public WantGo getDataById(int id);

    @Insert("insert into wantgo(address,reason) values (#{address},#{reason})")
    public void addData(WantGo wantGo);
}
