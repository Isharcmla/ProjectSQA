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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_177934797655 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28761;
     Object term29431;

    public DurationFormatUtils_format_177934797655() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term29268 = new StringBuilder();
        term28761 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term29094 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term29208 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term29094, term29094.getClass(), "value", null);
        setIntField(term29094, term29094.getClass(), "count", 0);
        setElement(term28761, 0, term29094);
        setField(term29208, term29208.getClass(), "value", term29268);
        setIntField(term29208, term29208.getClass(), "count", 0);
        setElement(term28761, 1, term29208);
        term29431 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term29432 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term29433 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term29434 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term29435 = (byte[]) newByteArray(16);
        setField(term29432, term29432.getClass(), "value", null);
        setIntField(term29432, term29432.getClass(), "count", 0);
        setElement(term29431, 0, term29432);
        setField(term29434, term29434.getClass(), "value", term29435);
        setByteField(term29434, term29434.getClass(), "coder", (byte) 0);
        setIntField(term29434, term29434.getClass(), "count", 0);
        setField(term29433, term29433.getClass(), "value", term29434);
        setIntField(term29433, term29433.getClass(), "count", 0);
        setElement(term29431, 1, term29433);
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
        args[0] = term28761;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term28761, term29431));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


