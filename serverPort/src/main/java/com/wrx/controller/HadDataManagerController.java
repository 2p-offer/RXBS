package com.wrx.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.wrx.api.HadGo;
import com.wrx.api.WantGo;
import com.wrx.dao.HadDao;
import com.wrx.dao.WantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: wangyan
 * @Date: 2019/5/4
 */
@Controller
@RequestMapping("/had")
public class HadDataManagerController {

    @Autowired
    HadDao hadDao;
    @GetMapping("/getTest")
    @ResponseBody
    public String getTestData() {
        return "123";
    }

    @GetMapping("getAll")
    @ResponseBody
    public String getAll(){
        List<HadGo> all = hadDao.getAll();
        String s = JSONArray.toJSONString(all);
        return s;
    }

    @GetMapping("getDataById/{id}")
    @ResponseBody
    public String getDataById(@PathVariable("id") int id){
        HadGo all = hadDao.getDataById(id);
        String s = JSONObject.toJSONString(all);
        return  s;
    }

    @PostMapping
    @ResponseBody
    public String addData(HadGo wantGo){
        hadDao.addData(wantGo);
        return "ok";
    }
}
