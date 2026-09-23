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

public class DurationFormatUtils_format_1779347976339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259823;
     Object term261365;

    public DurationFormatUtils_format_1779347976339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term260882 = new StringBuffer();
        term259823 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term260596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term260710 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term260824 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term260996 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261110 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261212 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term260596, term260596.getClass(), "value", null);
        setIntField(term260596, term260596.getClass(), "count", 0);
        setElement(term259823, 0, term260596);
        setField(term260710, term260710.getClass(), "value", null);
        setIntField(term260710, term260710.getClass(), "count", 0);
        setElement(term259823, 1, term260710);
        setField(term260824, term260824.getClass(), "value", term260882);
        setIntField(term260824, term260824.getClass(), "count", 0);
        setElement(term259823, 2, term260824);
        setField(term260996, term260996.getClass(), "value", null);
        setIntField(term260996, term260996.getClass(), "count", 0);
        setElement(term259823, 3, term260996);
        setElement(term259823, 4, term260996);
        setField(term261110, term261110.getClass(), "value", term261212);
        setIntField(term261110, term261110.getClass(), "count", 0);
        setElement(term259823, 5, term261110);
        term261365 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term261366 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261367 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261368 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261369 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term261372 = (byte[]) newByteArray(16);
        Object term261373 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261374 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term261375 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term261366, term261366.getClass(), "value", null);
        setIntField(term261366, term261366.getClass(), "count", 0);
        setElement(term261365, 0, term261366);
        setField(term261367, term261367.getClass(), "value", null);
        setIntField(term261367, term261367.getClass(), "count", 0);
        setElement(term261365, 1, term261367);
        setField(term261369, term261369.getClass(), "toStringCache", "");
        setField(term261369, term261369.getClass(), "value", term261372);
        setByteField(term261369, term261369.getClass(), "coder", (byte) 0);
        setIntField(term261369, term261369.getClass(), "count", 0);
        setField(term261368, term261368.getClass(), "value", term261369);
        setIntField(term261368, term261368.getClass(), "count", 0);
        setElement(term261365, 2, term261368);
        setField(term261373, term261373.getClass(), "value", null);
        setIntField(term261373, term261373.getClass(), "count", 0);
        setElement(term261365, 3, term261373);
        setElement(term261365, 4, term261373);
        setField(term261374, term261374.getClass(), "value", term261375);
        setIntField(term261374, term261374.getClass(), "count", 0);
        setElement(term261365, 5, term261374);
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
        args[0] = term259823;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term259823, term261365));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


