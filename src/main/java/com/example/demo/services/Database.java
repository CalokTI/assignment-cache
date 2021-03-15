package com.example.demo.services;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.TimeUnit;

/**
 * @author Carsten
 * Time: 20.20
 * Date: 15/03/2021
 */
public class Database {

    // simulates a slow call
    public String getDataSlow() throws InterruptedException {
        TimeUnit.SECONDS.sleep(10);
        String generatedString = RandomStringUtils.randomAlphabetic(1000);

        return generatedString;
    }
}
