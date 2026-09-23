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

public class DurationFormatUtils_format_177934797659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31373;
     Object term32438;

    public DurationFormatUtils_format_177934797659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term32230 = new StringBuffer();
        term31373 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term31644 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term31682 = newInstance(Class.forName("java.lang.Object"));
        Object term31796 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term31906 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term32020 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term32058 = newInstance(Class.forName("java.lang.Object"));
        Object term32172 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term31644, term31644.getClass(), "value", term31682);
        setIntField(term31644, term31644.getClass(), "count", 0);
        setElement(term31373, 0, term31644);
        setField(term31796, term31796.getClass(), "value", term31906);
        setIntField(term31796, term31796.getClass(), "count", 0);
        setElement(term31373, 1, term31796);
        setField(term32020, term32020.getClass(), "value", term32058);
        setIntField(term32020, term32020.getClass(), "count", 0);
        setElement(term31373, 2, term32020);
        setField(term32172, term32172.getClass(), "value", term32230);
        setIntField(term32172, term32172.getClass(), "count", 0);
        setElement(term31373, 3, term32172);
        term32438 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term32439 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term32440 = newInstance(Class.forName("java.lang.Object"));
        Object term32441 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term32442 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term32443 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term32444 = newInstance(Class.forName("java.lang.Object"));
        Object term32445 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term32446 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term32449 = (byte[]) newByteArray(16);
        setField(term32439, term32439.getClass(), "value", term32440);
        setIntField(term32439, term32439.getClass(), "count", 0);
        setElement(term32438, 0, term32439);
        setField(term32441, term32441.getClass(), "value", term32442);
        setIntField(term32441, term32441.getClass(), "count", 0);
        setElement(term32438, 1, term32441);
        setField(term32443, term32443.getClass(), "value", term32444);
        setIntField(term32443, term32443.getClass(), "count", 0);
        setElement(term32438, 2, term32443);
        setField(term32446, term32446.getClass(), "toStringCache", "");
        setField(term32446, term32446.getClass(), "value", term32449);
        setByteField(term32446, term32446.getClass(), "coder", (byte) 0);
        setIntField(term32446, term32446.getClass(), "count", 0);
        setField(term32445, term32445.getClass(), "value", term32446);
        setIntField(term32445, term32445.getClass(), "count", 0);
        setElement(term32438, 3, term32445);
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
        args[0] = term31373;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term31373, term32438));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


