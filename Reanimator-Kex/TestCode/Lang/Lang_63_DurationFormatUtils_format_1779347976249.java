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
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172553;
     Object term173521;

    public DurationFormatUtils_format_1779347976249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term173411 = new StringBuffer();
        term172553 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term173239 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term173353 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term173239, term173239.getClass(), "value", null);
        setIntField(term173239, term173239.getClass(), "count", 0);
        setElement(term172553, 0, term173239);
        setField(term173353, term173353.getClass(), "value", term173411);
        setIntField(term173353, term173353.getClass(), "count", 0);
        setElement(term172553, 1, term173353);
        setElement(term172553, 2, term173239);
        term173521 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term173522 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term173523 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term173524 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term173527 = (byte[]) newByteArray(16);
        setField(term173522, term173522.getClass(), "value", null);
        setIntField(term173522, term173522.getClass(), "count", 0);
        setElement(term173521, 0, term173522);
        setField(term173524, term173524.getClass(), "toStringCache", "");
        setField(term173524, term173524.getClass(), "value", term173527);
        setByteField(term173524, term173524.getClass(), "coder", (byte) 0);
        setIntField(term173524, term173524.getClass(), "count", 0);
        setField(term173523, term173523.getClass(), "value", term173524);
        setIntField(term173523, term173523.getClass(), "count", 0);
        setElement(term173521, 1, term173523);
        setElement(term173521, 2, term173522);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term172553;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term172553, term173521));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


