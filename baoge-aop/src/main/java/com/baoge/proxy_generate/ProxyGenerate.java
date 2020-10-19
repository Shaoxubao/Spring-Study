package com.baoge.proxy_generate;

import com.baoge.service.UserService;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Copyright 2018-2028 Baoge All Rights Reserved.
 * Author: Shao Xu Bao <xubao_shao@163.com>
 * Date:   2020/10/19
 */
public class ProxyGenerate {

    public static void main(String[] args) throws Exception {
        byte[] proxyClassFile = ProxyGenerator.generateProxyClass(
                "$Proxy", new Class[]{UserService.class});

        FileOutputStream outputStream = new FileOutputStream("D://Proxy.class");
        outputStream.write(proxyClassFile);
        outputStream.flush();
        outputStream.close();
    }

}
