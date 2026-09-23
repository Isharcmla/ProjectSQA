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

public class DurationFormatUtils_format_1779347976319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238341;
     Object term239352;

    public DurationFormatUtils_format_1779347976319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term238736 = new StringBuffer();
        StringBuffer term239136 = new StringBuffer();
        term238341 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term238678 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238850 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term238964 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term239078 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term238678, term238678.getClass(), "value", term238736);
        setIntField(term238678, term238678.getClass(), "count", 0);
        setElement(term238341, 0, term238678);
        setField(term238850, term238850.getClass(), "value", null);
        setIntField(term238850, term238850.getClass(), "count", 0);
        setElement(term238341, 1, term238850);
        setField(term238964, term238964.getClass(), "value", term238736);
        setIntField(term238964, term238964.getClass(), "count", 0);
        setElement(term238341, 2, term238964);
        setField(term239078, term239078.getClass(), "value", term239136);
        setIntField(term239078, term239078.getClass(), "count", 0);
        setElement(term238341, 3, term239078);
        term239352 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term239353 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term239354 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term239357 = (byte[]) newByteArray(16);
        Object term239358 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term239359 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term239360 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term239361 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term239364 = (byte[]) newByteArray(16);
        setField(term239354, term239354.getClass(), "toStringCache", "");
        setField(term239354, term239354.getClass(), "value", term239357);
        setByteField(term239354, term239354.getClass(), "coder", (byte) 0);
        setIntField(term239354, term239354.getClass(), "count", 0);
        setField(term239353, term239353.getClass(), "value", term239354);
        setIntField(term239353, term239353.getClass(), "count", 0);
        setElement(term239352, 0, term239353);
        setField(term239358, term239358.getClass(), "value", null);
        setIntField(term239358, term239358.getClass(), "count", 0);
        setElement(term239352, 1, term239358);
        setField(term239359, term239359.getClass(), "value", term239354);
        setIntField(term239359, term239359.getClass(), "count", 0);
        setElement(term239352, 2, term239359);
        setField(term239361, term239361.getClass(), "toStringCache", "");
        setField(term239361, term239361.getClass(), "value", term239364);
        setByteField(term239361, term239361.getClass(), "coder", (byte) 0);
        setIntField(term239361, term239361.getClass(), "count", 0);
        setField(term239360, term239360.getClass(), "value", term239361);
        setIntField(term239360, term239360.getClass(), "count", 0);
        setElement(term239352, 3, term239360);
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
        args[0] = term238341;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term238341, term239352));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


