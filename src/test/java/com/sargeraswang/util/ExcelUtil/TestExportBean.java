package com.sargeraswang.util.ExcelUtil;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sargeraswang.util.ExcelUtil.ExcelUtil;

import static javafx.scene.input.KeyCode.M;

public class TestExportBean {
    public static void main(String[] args) throws IOException {
        
        String[] headers = {"a","b","c","d","e"};
        Collection<Object> dataset=new ArrayList<Object>();
//        dataset.add(new Model("a1", "b1", "c1"));
//        dataset.add(new Model("a2", "b2", "c2"));
//        dataset.add(new Model("a3", "b3", "c3"));
        List list = new ArrayList<>();
        String[] sss  = {"ffffssss","sadfasdf","asdfadfa"};
        list.add("fffff");
        list.add("ccccc");

        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        dataset.add(new UserInfo(1,"QQQ","WWW","WWWEE","YYYYY",list,sss));
        File f=new File("d:/sss.xls");
        OutputStream out =new FileOutputStream(f);

        ExcelUtil.exportExcel(headers, dataset, out,new CellStyle());
        out.close();
    }
}
