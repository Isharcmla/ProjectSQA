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

public class DurationFormatUtils_format_1779347976147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104124;
     Object term107063;

    public DurationFormatUtils_format_1779347976147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term105018 = new StringBuffer();
        term104124 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term104846 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term104636 = (char[]) newCharArray(0);
        Object term104960 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term105132 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term105246 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term105360 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term104846, term104846.getClass(), "value", term104636);
        setIntField(term104846, term104846.getClass(), "count", 0);
        setElement(term104124, 0, term104846);
        setField(term104960, term104960.getClass(), "value", term105018);
        setIntField(term104960, term104960.getClass(), "count", 0);
        setElement(term104124, 1, term104960);
        setField(term105132, term105132.getClass(), "value", null);
        setIntField(term105132, term105132.getClass(), "count", 0);
        setElement(term104124, 2, term105132);
        setField(term105246, term105246.getClass(), "value", term105360);
        setIntField(term105246, term105246.getClass(), "count", 0);
        setElement(term104124, 3, term105246);
        term107063 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term107064 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term107065 = (char[]) newCharArray(0);
        Object term107066 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107067 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term107070 = (byte[]) newByteArray(16);
        Object term107071 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107072 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107073 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term107064, term107064.getClass(), "value", term107065);
        setIntField(term107064, term107064.getClass(), "count", 0);
        setElement(term107063, 0, term107064);
        setField(term107067, term107067.getClass(), "toStringCache", "");
        setField(term107067, term107067.getClass(), "value", term107070);
        setByteField(term107067, term107067.getClass(), "coder", (byte) 0);
        setIntField(term107067, term107067.getClass(), "count", 0);
        setField(term107066, term107066.getClass(), "value", term107067);
        setIntField(term107066, term107066.getClass(), "count", 0);
        setElement(term107063, 1, term107066);
        setField(term107071, term107071.getClass(), "value", null);
        setIntField(term107071, term107071.getClass(), "count", 0);
        setElement(term107063, 2, term107071);
        setField(term107073, term107073.getClass(), "value", null);
        setIntField(term107073, term107073.getClass(), "count", 0);
        setField(term107072, term107072.getClass(), "value", term107073);
        setIntField(term107072, term107072.getClass(), "count", 0);
        setElement(term107063, 3, term107072);
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
        args[0] = term104124;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term104124, term107063));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


