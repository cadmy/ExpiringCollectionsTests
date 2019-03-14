package ru.cadmy.util;

import org.apache.mina.util.ExpiringMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.TimeUnit;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Cadmy on 05.12.2018.
 */
@RunWith(JUnit4.class)
public class ApacheMinaExpiredMapTest {


    @Test
    public void deleteTest1Second() {
        ExpiringMap<Integer, Integer> map = new ExpiringMap<>(1);
        map.put(1, 1);
        map.getExpirer().startExpiring();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(0, map.size());
    }

    @Test
    public void deleteTest1001Miliseconds() {
        ExpiringMap<Integer, Integer> map = new ExpiringMap<>(1);
        map.put(1, 1);
        map.getExpirer().startExpiring();
        try {
            TimeUnit.MILLISECONDS.sleep(1001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(0, map.size());
    }
}
