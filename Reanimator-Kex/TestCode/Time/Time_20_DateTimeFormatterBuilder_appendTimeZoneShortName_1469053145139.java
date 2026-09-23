package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.format.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class DateTimeFormatterBuilder_appendTimeZoneShortName_1469053145139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term545;
     Object term551;
     Object term11365;
     Object term11370;
     Object term11358;

    public DateTimeFormatterBuilder_appendTimeZoneShortName_1469053145139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term546 = new ArrayList();
        term545 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term550 = newInstance(Class.forName("java.lang.Object"));
        setField(term545, term545.getClass(), "iElementPairs", term546);
        setField(term545, term545.getClass(), "iFormatter", term550);
        term551 = new LinkedHashMap();
        LinkedHashMap term11369 = new LinkedHashMap();
        Object term11368 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11368, term11368.getClass(), "iParseLookup", term11369);
        setIntField(term11368, term11368.getClass(), "iType", 1);
        ArrayList term11366 = new ArrayList();
        ((ArrayList) term11366).add(term11368);
        ((ArrayList) term11366).add(term11368);
        term11365 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11365, term11365.getClass(), "iElementPairs", term11366);
        setField(term11365, term11365.getClass(), "iFormatter", null);
        term11370 = new LinkedHashMap();
        LinkedHashMap term11352 = new LinkedHashMap();
        Object term11361 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11361, term11361.getClass(), "iParseLookup", term11352);
        setIntField(term11361, term11361.getClass(), "iType", 1);
        ArrayList term11359 = new ArrayList();
        ((ArrayList) term11359).add(term11361);
        ((ArrayList) term11359).add(term11361);
        term11358 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11358, term11358.getClass(), "iElementPairs", term11359);
        setField(term11358, term11358.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term551;
        Object retValue = callMethod(klass, "appendTimeZoneShortName", argTypes, term545, args);
        assertTrue(recursiveEquals(term545, term11365));
        assertTrue(recursiveEquals(term551, term11370));
        assertTrue(recursiveEquals(retValue, term11358));
    }

};


