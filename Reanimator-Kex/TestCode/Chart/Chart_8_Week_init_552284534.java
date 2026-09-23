package org.jfree.data.time;

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
import static org.jfree.data.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Week_init_552284534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term15;

    public Week_init_552284534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("java.util.Date"));
        setLongField(term13, term13.getClass(), "fastTime", 1480456351369L);
        setField(term13, term13.getClass(), "cdate", null);
        term15 = newInstance(Class.forName("sun.util.calendar.ZoneInfo"));
        setIntField(term15, term15.getClass(), "rawOffset", 18000000);
        setIntField(term15, term15.getClass(), "rawOffsetDiff", 0);
        setIntField(term15, term15.getClass(), "checksum", 0);
        setIntField(term15, term15.getClass(), "dstSavings", 0);
        setField(term15, term15.getClass(), "transitions", null);
        setField(term15, term15.getClass(), "offsets", null);
        setField(term15, term15.getClass(), "simpleTimeZoneParams", null);
        setBooleanField(term15, term15.getClass(), "willGMTOffsetChange", false);
        setBooleanField(term15, term15.getClass(), "dirty", false);
        setField(term15, term15.getClass(), "lastRule", null);
        setField(term15, term15.getClass(), "ID", "Etc/GMT-5");
        setField(term15, term15.getClass(), "zoneId", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.time.Week");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.util.TimeZone");
        Object[] args = new Object[2];
        args[0] = term13;
        args[1] = term15;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


