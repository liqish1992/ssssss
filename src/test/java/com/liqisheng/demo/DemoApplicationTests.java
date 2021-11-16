package com.liqisheng.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.util.Map;

@SpringBootTest
@Slf4j
class DemoApplicationTests {

    private static int counter = 0;

    @Test
    void contextLoads() throws IOException {

        String jsonString = "apiVersion: apps/v1\n" +
                "kind: Deployment\n" +
                "metadata: \n" +
                "  name: pc-deployment \n" +
                "  namespace: dev \n" +
                "spec: \n" +
                "  replicas: 3 \n" +
                "  strategy: \n" +
                "    type: RollingUpdate # RollingUpdate：\n" +
                "    rollingUpdate:\n" +
                "      maxUnavailable: 25%\n" +
                "      maxSurge: 25%\n" +
                "  selector: \n" +
                "    matchLabels: \n" +
                "      app: nginx-pod\n" +
                "  template: \n" +
                "    metadata:\n" +
                "      labels:\n" +
                "        app: nginx-pod\n" +
                "    spec:\n" +
                "      containers:\n" +
                "        - name: nginx \n" +
                "          image: nginx:1.17.1 \n" +
                "          ports:\n" +
                "            - containerPort: 80 \n" +
                "apiVersion: apps/v1\n" +
                "kind: Deployment\n" +
                "metadata:\n" +
                "  name: pc-deployment\n" +
                "  namespace: dev\n" +
                "spec:\n" +
                "  replicas: 3\n" +
                "  strategy:\n" +
                "    type: RollingUpdate # RollingUpdate：\n" +
                "    rollingUpdate:\n" +
                "      maxUnavailable: 25%\n" +
                "      maxSurge: 25%\n" +
                "  selector:\n" +
                "    matchLabels:\n" +
                "      app: nginx-pod\n" +
                "  template:\n" +
                "    metadata:\n" +
                "      labels:\n" +
                "        app: nginx-pod\n" +
                "    spec:\n" +
                "      containers:\n" +
                "        - name: nginx\n" +
                "          image: nginx:1.17.1\n" +
                "          ports:\n" +
                "            - containerPort: 80 ";

        Yaml yaml = new Yaml();
        Map load = yaml.load(jsonString);
        String dump = yaml.dump(load);

        System.out.println(countStr(dump, "apiVersion"));
        System.out.println(countStr(jsonString, "apiVersion"));

    }


    public static int countStr( String str1, String key) {
         int count = 0;
         int account = 0;
        while ((count = str1.indexOf(key)) != -1) {
            account++;
            str1 = str1.substring(count);
        }
        return account;
    }


}


