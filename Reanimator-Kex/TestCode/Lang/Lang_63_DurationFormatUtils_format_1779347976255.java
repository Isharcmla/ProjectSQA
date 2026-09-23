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

public class DurationFormatUtils_format_1779347976255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183467;
     Object term184463;

    public DurationFormatUtils_format_1779347976255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term184343 = new StringBuffer();
        term183467 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term184171 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term184285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term184171, term184171.getClass(), "value", null);
        setIntField(term184171, term184171.getClass(), "count", 0);
        setElement(term183467, 0, term184171);
        setElement(term183467, 1, term184171);
        setField(term184285, term184285.getClass(), "value", term184343);
        setIntField(term184285, term184285.getClass(), "count", 0);
        setElement(term183467, 2, term184285);
        setElement(term183467, 3, term184171);
        term184463 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term184464 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term184465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term184466 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term184469 = (byte[]) newByteArray(16);
        setField(term184464, term184464.getClass(), "value", null);
        setIntField(term184464, term184464.getClass(), "count", 0);
        setElement(term184463, 0, term184464);
        setElement(term184463, 1, term184464);
        setField(term184466, term184466.getClass(), "toStringCache", "");
        setField(term184466, term184466.getClass(), "value", term184469);
        setByteField(term184466, term184466.getClass(), "coder", (byte) 0);
        setIntField(term184466, term184466.getClass(), "count", 0);
        setField(term184465, term184465.getClass(), "value", term184466);
        setIntField(term184465, term184465.getClass(), "count", 0);
        setElement(term184463, 2, term184465);
        setElement(term184463, 3, term184464);
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
        args[0] = term183467;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term183467, term184463));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


