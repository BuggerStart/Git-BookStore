package com.atguigu.test;

import org.junit.Test;

import java.io.InputStream;

/**
 * @author Keith
 * @create 2022-10-08 下午 7:38
 */
public class TestIO {
    @Test
    public void testIO(){
        System.out.println(getClass());
        System.out.println(getClass().getClassLoader());
        InputStream is = getClass().getClassLoader().getResourceAsStream("applicationContext.xml");
        System.out.println(is);
    }
}
