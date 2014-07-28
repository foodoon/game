package com.foodoon.game.gen;

import com.foodoon.gooda.gen.DemoGen;

/**
 * Created by foodoon on 2014/7/28.
 */
public class ActionGen {

    private static String jdbcPath = "e:\\repo\\mysql\\mysql-connector-java\\5.1.9\\mysql-connector-java-5.1.9.jar";

    private static String jdbUrl = "jdbc:mysql://127.0.0.1:3306/demo?useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args){
        DemoGen demoGen = new DemoGen();
        demoGen.setJdbcPassword("");
        demoGen.setJdbcUsername("root");
        demoGen.setJdbcPath(jdbcPath);
        demoGen.setJdbUrl(jdbUrl);

        DemoGen.genDaoXML("challenge","game","com.foodoon");
        DemoGen.genBiz("challenge","game","com.foodoon");
        DemoGen.genAction("challenge","game","com.foodoon");
    }
}
