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

public class DurationFormatUtils_format_1779347976526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term446578;
     Object term448922;

    public DurationFormatUtils_format_1779347976526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term447468 = new StringBuffer();
        term446578 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term447296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term447410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term447582 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term447296, term447296.getClass(), "value", null);
        setIntField(term447296, term447296.getClass(), "count", 0);
        setElement(term446578, 0, term447296);
        setField(term447410, term447410.getClass(), "value", term447468);
        setIntField(term447410, term447410.getClass(), "count", 0);
        setElement(term446578, 1, term447410);
        setElement(term446578, 2, term447410);
        setElement(term446578, 3, term447410);
        setField(term447582, term447582.getClass(), "value", null);
        setIntField(term447582, term447582.getClass(), "count", 0);
        setElement(term446578, 4, term447582);
        term448922 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term448923 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448924 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term448925 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term448928 = (byte[]) newByteArray(16);
        Object term448929 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term448923, term448923.getClass(), "value", null);
        setIntField(term448923, term448923.getClass(), "count", 0);
        setElement(term448922, 0, term448923);
        setField(term448925, term448925.getClass(), "toStringCache", "");
        setField(term448925, term448925.getClass(), "value", term448928);
        setByteField(term448925, term448925.getClass(), "coder", (byte) 0);
        setIntField(term448925, term448925.getClass(), "count", 0);
        setField(term448924, term448924.getClass(), "value", term448925);
        setIntField(term448924, term448924.getClass(), "count", 0);
        setElement(term448922, 1, term448924);
        setElement(term448922, 2, term448924);
        setElement(term448922, 3, term448924);
        setField(term448929, term448929.getClass(), "value", null);
        setIntField(term448929, term448929.getClass(), "count", 0);
        setElement(term448922, 4, term448929);
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
        args[0] = term446578;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term446578, term448922));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


