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

public class DurationFormatUtils_format_177934797669 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39398;
     Object term40379;

    public DurationFormatUtils_format_177934797669() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39398 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term39718 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term39832 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term39946 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40060 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40170 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term40284 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term39490 = (char[]) newCharArray(0);
        setField(term39718, term39718.getClass(), "value", null);
        setIntField(term39718, term39718.getClass(), "count", 0);
        setElement(term39398, 0, term39718);
        setField(term39832, term39832.getClass(), "value", null);
        setIntField(term39832, term39832.getClass(), "count", 0);
        setElement(term39398, 1, term39832);
        setField(term39946, term39946.getClass(), "value", null);
        setIntField(term39946, term39946.getClass(), "count", 0);
        setElement(term39398, 2, term39946);
        setField(term40060, term40060.getClass(), "value", term40170);
        setIntField(term40060, term40060.getClass(), "count", 0);
        setElement(term39398, 3, term40060);
        setField(term40284, term40284.getClass(), "value", term39490);
        setIntField(term40284, term40284.getClass(), "count", 0);
        setElement(term39398, 4, term40284);
        term40379 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term40380 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40381 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40382 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40383 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term40384 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term40385 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term40386 = (char[]) newCharArray(0);
        setField(term40380, term40380.getClass(), "value", null);
        setIntField(term40380, term40380.getClass(), "count", 0);
        setElement(term40379, 0, term40380);
        setField(term40381, term40381.getClass(), "value", null);
        setIntField(term40381, term40381.getClass(), "count", 0);
        setElement(term40379, 1, term40381);
        setField(term40382, term40382.getClass(), "value", null);
        setIntField(term40382, term40382.getClass(), "count", 0);
        setElement(term40379, 2, term40382);
        setField(term40383, term40383.getClass(), "value", term40384);
        setIntField(term40383, term40383.getClass(), "count", 0);
        setElement(term40379, 3, term40383);
        setField(term40385, term40385.getClass(), "value", term40386);
        setIntField(term40385, term40385.getClass(), "count", 0);
        setElement(term40379, 4, term40385);
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
        args[0] = term39398;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term39398, term40379));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


