package com.fasterxml.jackson.databind.cfg;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.fasterxml.jackson.databind.cfg.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BaseSettings_with_75920055839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64;

    public BaseSettings_with_75920055839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        long[] term69 = (long[]) newLongArray(31);
        int[] term101 = (int[]) newIntArray(4);
        setIntField(term64, term64.getClass(), "rawOffset", 28800000);
        setIntField(term64, term64.getClass(), "rawOffsetDiff", 0);
        setIntField(term64, term64.getClass(), "checksum", -1650057198);
        setIntField(term64, term64.getClass(), "dstSavings", 0);
        setLongElement(term69, 0, -9048018124799999L);
        setLongElement(term69, 1, -8918966038528000L);
        setLongElement(term69, 2, -6556365619199950L);
        setLongElement(term69, 3, -6495864422400000L);
        setLongElement(term69, 4, -3824300851199950L);
        setLongElement(term69, 5, -3776893747200000L);
        setLongElement(term69, 6, -3722733158399950L);
        setLongElement(term69, 7, -3640644403200000L);
        setLongElement(term69, 8, -3608779161599950L);
        setLongElement(term69, 9, -3145192243200000L);
        setLongElement(term69, 10, -3054934425599950L);
        setLongElement(term69, 11, -3005757849600000L);
        setLongElement(term69, 12, -2936379801599950L);
        setLongElement(term69, 13, -2865615667200000L);
        setLongElement(term69, 14, -2801192140799950L);
        setLongElement(term69, 15, -2747061043200000L);
        setLongElement(term69, 16, -2672020684799950L);
        setLongElement(term69, 17, -2662480281600000L);
        setLongElement(term69, 18, 2111599411200050L);
        setLongElement(term69, 19, 2158652620800000L);
        setLongElement(term69, 20, 2232985190400050L);
        setLongElement(term69, 21, 2287470182400000L);
        setLongElement(term69, 22, 2364280012800050L);
        setLongElement(term69, 23, 2416287744000000L);
        setLongElement(term69, 24, 2493097574400050L);
        setLongElement(term69, 25, 2547582566400000L);
        setLongElement(term69, 26, 2621915136000050L);
        setLongElement(term69, 27, 2676400128000000L);
        setLongElement(term69, 28, 2750732697600050L);
        setLongElement(term69, 29, 2805217689600000L);
        setLongElement(term69, 30, 8660385792000000L);
        setField(term64, term64.getClass(), "transitions", term69);
        setIntElement(term101, 0, 28800000);
        setIntElement(term101, 1, 29143000);
        setIntElement(term101, 2, 32400000);
        setIntElement(term101, 3, 3600000);
        setField(term64, term64.getClass(), "offsets", term101);
        setField(term64, term64.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term64, term64.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term64, term64.getClass(), "dirty", false);
        setField(term64, term64.getClass(), "lastRule", null);
        setField(term64, term64.getClass(), "ID", "Asia/Shanghai");
        setField(term64, term64.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.cfg.BaseSettings");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term64;
        try {
            callMethod(klass, "with", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


