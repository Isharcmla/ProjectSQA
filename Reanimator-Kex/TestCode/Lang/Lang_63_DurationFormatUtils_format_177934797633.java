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

public class DurationFormatUtils_format_177934797633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15876;
     Object term16601;

    public DurationFormatUtils_format_177934797633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15876 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term16220 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16334 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16448 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16486 = newInstance(Class.forName("java.lang.Object"));
        setField(term16220, term16220.getClass(), "value", null);
        setIntField(term16220, term16220.getClass(), "count", 0);
        setElement(term15876, 0, term16220);
        setField(term16334, term16334.getClass(), "value", null);
        setIntField(term16334, term16334.getClass(), "count", 0);
        setElement(term15876, 1, term16334);
        setField(term16448, term16448.getClass(), "value", term16486);
        setIntField(term16448, term16448.getClass(), "count", 0);
        setElement(term15876, 2, term16448);
        term16601 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term16602 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16603 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16604 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term16605 = newInstance(Class.forName("java.lang.Object"));
        setField(term16602, term16602.getClass(), "value", null);
        setIntField(term16602, term16602.getClass(), "count", 0);
        setElement(term16601, 0, term16602);
        setField(term16603, term16603.getClass(), "value", null);
        setIntField(term16603, term16603.getClass(), "count", 0);
        setElement(term16601, 1, term16603);
        setField(term16604, term16604.getClass(), "value", term16605);
        setIntField(term16604, term16604.getClass(), "count", 0);
        setElement(term16601, 2, term16604);
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
        args[0] = term15876;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term15876, term16601));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


