package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.EqualityUtils.*;
import java.lang.Long;
import java.lang.Object;

public class Period_init_1256641030172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20717;
     Object term71330;

    public Period_init_1256641030172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20717 = new Long(0L);
        term71330 = newInstance(Class.forName("org.joda.time.Period"));
        Object term71331 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term71334 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term71335 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71337 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71339 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71341 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71343 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71345 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71347 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term71349 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term71351 = (int[]) newIntArray(8);
        int[] term71352 = (int[]) newIntArray(8);
        setField(term71331, term71331.getClass(), "iName", "Standard");
        setByteField(term71335, term71335.getClass(), "iOrdinal", (byte) 4);
        setField(term71335, term71335.getClass(), "iName", "");
        setElement(term71334, 0, term71335);
        setByteField(term71337, term71337.getClass(), "iOrdinal", (byte) 5);
        setField(term71337, term71337.getClass(), "iName", "");
        setElement(term71334, 1, term71337);
        setByteField(term71339, term71339.getClass(), "iOrdinal", (byte) 6);
        setField(term71339, term71339.getClass(), "iName", "");
        setElement(term71334, 2, term71339);
        setByteField(term71341, term71341.getClass(), "iOrdinal", (byte) 7);
        setField(term71341, term71341.getClass(), "iName", "");
        setElement(term71334, 3, term71341);
        setByteField(term71343, term71343.getClass(), "iOrdinal", (byte) 9);
        setField(term71343, term71343.getClass(), "iName", "");
        setElement(term71334, 4, term71343);
        setByteField(term71345, term71345.getClass(), "iOrdinal", (byte) 10);
        setField(term71345, term71345.getClass(), "iName", "");
        setElement(term71334, 5, term71345);
        setByteField(term71347, term71347.getClass(), "iOrdinal", (byte) 11);
        setField(term71347, term71347.getClass(), "iName", "");
        setElement(term71334, 6, term71347);
        setByteField(term71349, term71349.getClass(), "iOrdinal", (byte) 12);
        setField(term71349, term71349.getClass(), "iName", "");
        setElement(term71334, 7, term71349);
        setField(term71331, term71331.getClass(), "iTypes", term71334);
        setIntElement(term71351, 1, 1);
        setIntElement(term71351, 2, 2);
        setIntElement(term71351, 3, 3);
        setIntElement(term71351, 4, 4);
        setIntElement(term71351, 5, 5);
        setIntElement(term71351, 6, 6);
        setIntElement(term71351, 7, 7);
        setField(term71331, term71331.getClass(), "iIndices", term71351);
        setField(term71330, term71330.getClass(), "iType", term71331);
        setField(term71330, term71330.getClass(), "iValues", term71352);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term20717;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term71330));
        assertTrue(recursiveEquals(term20717, 0L));
    }

};


