package com.google.gson.internal.bind.util;

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
import static com.google.gson.internal.bind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.util.EqualityUtils.*;
import java.lang.Boolean;

public class ISO8601Utils_format_169664850412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object term11;
     Object term544;
     Object term545;

    public ISO8601Utils_format_169664850412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = newInstance(Class.forName("java.util.Date"));
        setLongField(term7, term7.getClass(), "fastTime", 1610958182830L);
        setField(term7, term7.getClass(), "cdate", null);
        term9 = new Boolean(false);
        term11 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term11, term11.getClass(), "rawOffset", 18000000);
        setIntField(term11, term11.getClass(), "rawOffsetDiff", 0);
        setIntField(term11, term11.getClass(), "checksum", 0);
        setIntField(term11, term11.getClass(), "dstSavings", 0);
        setField(term11, term11.getClass(), "transitions", null);
        setField(term11, term11.getClass(), "offsets", null);
        setField(term11, term11.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term11, term11.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term11, term11.getClass(), "dirty", false);
        setField(term11, term11.getClass(), "lastRule", null);
        setField(term11, term11.getClass(), "ID", "Etc/GMT-5");
        setField(term11, term11.getClass(), "zoneId", null);
        term544 = newInstance(Class.forName("java.util.Date"));
        setLongField(term544, term544.getClass(), "fastTime", 1610958182830L);
        setField(term544, term544.getClass(), "cdate", null);
        term545 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term545, term545.getClass(), "rawOffset", 18000000);
        setIntField(term545, term545.getClass(), "rawOffsetDiff", 0);
        setIntField(term545, term545.getClass(), "checksum", 0);
        setIntField(term545, term545.getClass(), "dstSavings", 0);
        setField(term545, term545.getClass(), "transitions", null);
        setField(term545, term545.getClass(), "offsets", null);
        setField(term545, term545.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term545, term545.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term545, term545.getClass(), "dirty", false);
        setField(term545, term545.getClass(), "lastRule", null);
        setField(term545, term545.getClass(), "ID", "Etc/GMT-5");
        setField(term545, term545.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[3];
        args[0] = term7;
        args[1] = term9;
        args[2] = term11;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term7, term544));
        assertTrue(recursiveEquals(term9, false));
        assertTrue(recursiveEquals(term11, term545));
        assertTrue(recursiveEquals(retValue, "2021-01-18T13:23:02+05:00"));
    }

};


