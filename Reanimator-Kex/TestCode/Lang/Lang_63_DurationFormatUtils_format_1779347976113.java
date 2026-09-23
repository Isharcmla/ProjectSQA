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

public class DurationFormatUtils_format_1779347976113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82366;
     Object term83164;

    public DurationFormatUtils_format_1779347976113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term83082 = new StringBuffer();
        term82366 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term83024 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term83024, term83024.getClass(), "value", term83082);
        setIntField(term83024, term83024.getClass(), "count", 0);
        setElement(term82366, 0, term83024);
        term83164 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 1);
        Object term83165 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term83166 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term83169 = (byte[]) newByteArray(16);
        setField(term83166, term83166.getClass(), "toStringCache", "");
        setField(term83166, term83166.getClass(), "value", term83169);
        setByteField(term83166, term83166.getClass(), "coder", (byte) 0);
        setIntField(term83166, term83166.getClass(), "count", 0);
        setField(term83165, term83165.getClass(), "value", term83166);
        setIntField(term83165, term83165.getClass(), "count", 0);
        setElement(term83164, 0, term83165);
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
        args[0] = term82366;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term82366, term83164));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


