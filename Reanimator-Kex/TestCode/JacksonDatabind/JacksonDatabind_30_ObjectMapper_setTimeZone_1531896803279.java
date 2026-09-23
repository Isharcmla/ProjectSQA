package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ObjectMapper_setTimeZone_1531896803279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;

    public ObjectMapper_setTimeZone_1531896803279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term65, term65.getClass(), "rawOffset", 18000000);
        setIntField(term65, term65.getClass(), "rawOffsetDiff", 0);
        setIntField(term65, term65.getClass(), "checksum", 0);
        setIntField(term65, term65.getClass(), "dstSavings", 0);
        setField(term65, term65.getClass(), "transitions", null);
        setField(term65, term65.getClass(), "offsets", null);
        setField(term65, term65.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term65, term65.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term65, term65.getClass(), "dirty", false);
        setField(term65, term65.getClass(), "lastRule", null);
        setField(term65, term65.getClass(), "ID", "Etc/GMT-5");
        setField(term65, term65.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.ObjectMapper");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[1];
        args[0] = term65;
        try {
            callMethod(klass, "setTimeZone", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


