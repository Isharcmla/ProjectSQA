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

public class DateTimeFormatterBuilder_appendTimeZoneName_1194032067137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term512;
     Object term518;
     Object term11323;
     Object term11328;
     Object term11316;

    public DateTimeFormatterBuilder_appendTimeZoneName_1194032067137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term513 = new ArrayList();
        term512 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term517 = newInstance(Class.forName("java.lang.Object"));
        setField(term512, term512.getClass(), "iElementPairs", term513);
        setField(term512, term512.getClass(), "iFormatter", term517);
        term518 = new LinkedHashMap();
        LinkedHashMap term11327 = new LinkedHashMap();
        Object term11326 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11326, term11326.getClass(), "iParseLookup", term11327);
        setIntField(term11326, term11326.getClass(), "iType", 0);
        ArrayList term11324 = new ArrayList();
        ((ArrayList) term11324).add(term11326);
        ((ArrayList) term11324).add(term11326);
        term11323 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11323, term11323.getClass(), "iElementPairs", term11324);
        setField(term11323, term11323.getClass(), "iFormatter", null);
        term11328 = new LinkedHashMap();
        LinkedHashMap term11310 = new LinkedHashMap();
        Object term11319 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setField(term11319, term11319.getClass(), "iParseLookup", term11310);
        setIntField(term11319, term11319.getClass(), "iType", 0);
        ArrayList term11317 = new ArrayList();
        ((ArrayList) term11317).add(term11319);
        ((ArrayList) term11317).add(term11319);
        term11316 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        setField(term11316, term11316.getClass(), "iElementPairs", term11317);
        setField(term11316, term11316.getClass(), "iFormatter", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Map");
        Object[] args = new Object[1];
        args[0] = term518;
        Object retValue = callMethod(klass, "appendTimeZoneName", argTypes, term512, args);
        assertTrue(recursiveEquals(term512, term11323));
        assertTrue(recursiveEquals(term518, term11328));
        assertTrue(recursiveEquals(retValue, term11316));
    }

};


