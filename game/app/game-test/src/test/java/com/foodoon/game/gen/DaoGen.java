package com.foodoon.game.gen;

import com.foodoon.gooda.gen.DemoGen;

/**
 * Created by foodoon on 2014/6/28.
 */
public class DaoGen {

    private static String jdbcPath = "e:\\repo\\mysql\\mysql-connector-java\\5.1.9\\mysql-connector-java-5.1.9.jar";

    private static String jdbUrl = "jdbc:mysql://127.0.0.1:3306/game?useUnicode=true&characterEncoding=utf8";

    public static void main(String[] args){
        try {
            DemoGen demoGen = new DemoGen();
            demoGen.setJdbcPassword("");
            demoGen.setJdbcUsername("root");
            demoGen.setJdbcPath(jdbcPath);
            demoGen.setJdbUrl(jdbUrl);
            demoGen.setConnectionURL(jdbUrl);
            demoGen.genDAO("user_info", "game", "com.foodoon");
        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
