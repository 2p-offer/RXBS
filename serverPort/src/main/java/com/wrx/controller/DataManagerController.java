package com.wrx.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wrx.api.WantGo;
import com.wrx.dao.WantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author: wangyan
 * @Date: 2019/5/4
 */
@Controller
@RequestMapping("/data")
public class DataManagerController {

    @Autowired
    WantDao wantDao;
    @GetMapping("/getTest")
    @ResponseBody
    public String getTestData() {
        return "123";
    }

    @GetMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<WantGo> all = wantDao.getAll();
        String s = JSONArray.toJSONString(all);
        return  s;
    }

    @GetMapping("getDataById/{id}")
    @ResponseBody
    public String getDataById(@PathVariable("id") int id){
        WantGo all = wantDao.getDataById(id);
        String s = JSONObject.toJSONString(all);
        return  s;
    }
}
