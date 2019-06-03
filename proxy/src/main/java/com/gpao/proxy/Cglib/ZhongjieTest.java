package com.gpao.proxy.Cglib;

import net.sf.cglib.core.DebuggingClassWriter;

public class ZhongjieTest {
    public static void main(String[] args) {

        Zhongjie zhongjie = (Zhongjie) new ZhongjieCglibProxy().getInstance(Zhongjie.class);
        zhongjie.zufang();
    }
}
