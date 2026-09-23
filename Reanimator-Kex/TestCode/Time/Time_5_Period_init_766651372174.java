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

public class Period_init_766651372174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27377;
     Object term75908;

    public Period_init_766651372174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27377 = new Long(0L);
        term75908 = newInstance(Class.forName("org.joda.time.Period"));
        Object term75909 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term75912 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term75913 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75915 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75917 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75919 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75921 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75923 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75925 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term75927 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term75929 = (int[]) newIntArray(8);
        int[] term75930 = (int[]) newIntArray(8);
        setField(term75909, term75909.getClass(), "iName", "Standard");
        setByteField(term75913, term75913.getClass(), "iOrdinal", (byte) 4);
        setField(term75913, term75913.getClass(), "iName", "");
        setElement(term75912, 0, term75913);
        setByteField(term75915, term75915.getClass(), "iOrdinal", (byte) 5);
        setField(term75915, term75915.getClass(), "iName", "");
        setElement(term75912, 1, term75915);
        setByteField(term75917, term75917.getClass(), "iOrdinal", (byte) 6);
        setField(term75917, term75917.getClass(), "iName", "");
        setElement(term75912, 2, term75917);
        setByteField(term75919, term75919.getClass(), "iOrdinal", (byte) 7);
        setField(term75919, term75919.getClass(), "iName", "");
        setElement(term75912, 3, term75919);
        setByteField(term75921, term75921.getClass(), "iOrdinal", (byte) 9);
        setField(term75921, term75921.getClass(), "iName", "");
        setElement(term75912, 4, term75921);
        setByteField(term75923, term75923.getClass(), "iOrdinal", (byte) 10);
        setField(term75923, term75923.getClass(), "iName", "");
        setElement(term75912, 5, term75923);
        setByteField(term75925, term75925.getClass(), "iOrdinal", (byte) 11);
        setField(term75925, term75925.getClass(), "iName", "");
        setElement(term75912, 6, term75925);
        setByteField(term75927, term75927.getClass(), "iOrdinal", (byte) 12);
        setField(term75927, term75927.getClass(), "iName", "");
        setElement(term75912, 7, term75927);
        setField(term75909, term75909.getClass(), "iTypes", term75912);
        setIntElement(term75929, 1, 1);
        setIntElement(term75929, 2, 2);
        setIntElement(term75929, 3, 3);
        setIntElement(term75929, 4, 4);
        setIntElement(term75929, 5, 5);
        setIntElement(term75929, 6, 6);
        setIntElement(term75929, 7, 7);
        setField(term75909, term75909.getClass(), "iIndices", term75929);
        setField(term75908, term75908.getClass(), "iType", term75909);
        setField(term75908, term75908.getClass(), "iValues", term75930);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term27377;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term75908));
        assertTrue(recursiveEquals(term27377, null));
    }

};


