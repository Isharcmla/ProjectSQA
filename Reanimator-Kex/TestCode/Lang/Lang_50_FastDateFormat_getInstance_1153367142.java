package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class FastDateFormat_getInstance_1153367142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35;

    public FastDateFormat_getInstance_1153367142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term35, term35.getClass(), "rawOffset", 18000000);
        setIntField(term35, term35.getClass(), "rawOffsetDiff", 0);
        setIntField(term35, term35.getClass(), "checksum", 0);
        setIntField(term35, term35.getClass(), "dstSavings", 0);
        setField(term35, term35.getClass(), "transitions", null);
        setField(term35, term35.getClass(), "offsets", null);
        setField(term35, term35.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term35, term35.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term35, term35.getClass(), "dirty", false);
        setField(term35, term35.getClass(), "lastRule", null);
        setField(term35, term35.getClass(), "ID", "Etc/GMT-5");
        setField(term35, term35.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = term35;
        callMethod(klass, "getInstance", argTypes, null, args);
    }

};


