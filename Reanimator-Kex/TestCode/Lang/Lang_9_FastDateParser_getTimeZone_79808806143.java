package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;

public class FastDateParser_getTimeZone_79808806143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1228;
     Object term10567;

    public FastDateParser_getTimeZone_79808806143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1228 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term1228, term1228.getClass(), "pattern", null);
        setField(term1228, term1228.getClass(), "timeZone", null);
        setField(term1228, term1228.getClass(), "locale", null);
        setField(term1228, term1228.getClass(), "parsePattern", null);
        setField(term1228, term1228.getClass(), "strategies", null);
        setIntField(term1228, term1228.getClass(), "thisYear", 0);
        setField(term1228, term1228.getClass(), "nameValues", null);
        setField(term1228, term1228.getClass(), "currentFormatField", null);
        setField(term1228, term1228.getClass(), "nextStrategy", null);
        term10567 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser"));
        setField(term10567, term10567.getClass(), "pattern", null);
        setField(term10567, term10567.getClass(), "timeZone", null);
        setField(term10567, term10567.getClass(), "locale", null);
        setField(term10567, term10567.getClass(), "parsePattern", null);
        setField(term10567, term10567.getClass(), "strategies", null);
        setIntField(term10567, term10567.getClass(), "thisYear", 0);
        setField(term10567, term10567.getClass(), "nameValues", null);
        setField(term10567, term10567.getClass(), "currentFormatField", null);
        setField(term10567, term10567.getClass(), "nextStrategy", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getTimeZone", argTypes, term1228, args);
        assertTrue(recursiveEquals(term1228, term10567));
        assertTrue(recursiveEquals(retValue, null));
    }

};


