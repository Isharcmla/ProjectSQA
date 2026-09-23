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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138039;
     Object term140167;

    public DurationFormatUtils_format_1779347976200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term138602 = new StringBuffer();
        StringBuilder term138776 = new StringBuilder();
        term138039 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term138316 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term138430 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term138544 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term138716 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term138316, term138316.getClass(), "value", null);
        setIntField(term138316, term138316.getClass(), "count", 0);
        setElement(term138039, 0, term138316);
        setField(term138430, term138430.getClass(), "value", null);
        setIntField(term138430, term138430.getClass(), "count", 0);
        setElement(term138039, 1, term138430);
        setField(term138544, term138544.getClass(), "value", term138602);
        setIntField(term138544, term138544.getClass(), "count", 0);
        setElement(term138039, 2, term138544);
        setField(term138716, term138716.getClass(), "value", term138776);
        setIntField(term138716, term138716.getClass(), "count", 0);
        setElement(term138039, 3, term138716);
        term140167 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term140168 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140169 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140170 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140171 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term140174 = (byte[]) newByteArray(16);
        Object term140175 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term140176 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term140177 = (byte[]) newByteArray(16);
        setField(term140168, term140168.getClass(), "value", null);
        setIntField(term140168, term140168.getClass(), "count", 0);
        setElement(term140167, 0, term140168);
        setField(term140169, term140169.getClass(), "value", null);
        setIntField(term140169, term140169.getClass(), "count", 0);
        setElement(term140167, 1, term140169);
        setField(term140171, term140171.getClass(), "toStringCache", "");
        setField(term140171, term140171.getClass(), "value", term140174);
        setByteField(term140171, term140171.getClass(), "coder", (byte) 0);
        setIntField(term140171, term140171.getClass(), "count", 0);
        setField(term140170, term140170.getClass(), "value", term140171);
        setIntField(term140170, term140170.getClass(), "count", 0);
        setElement(term140167, 2, term140170);
        setField(term140176, term140176.getClass(), "value", term140177);
        setByteField(term140176, term140176.getClass(), "coder", (byte) 0);
        setIntField(term140176, term140176.getClass(), "count", 0);
        setField(term140175, term140175.getClass(), "value", term140176);
        setIntField(term140175, term140175.getClass(), "count", 0);
        setElement(term140167, 3, term140175);
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
        args[0] = term138039;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term138039, term140167));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


