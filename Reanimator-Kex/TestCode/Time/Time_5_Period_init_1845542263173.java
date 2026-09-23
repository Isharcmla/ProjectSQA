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

public class Period_init_1845542263173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22381;
     Object term73733;

    public Period_init_1845542263173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22381 = new Long(0L);
        term73733 = newInstance(Class.forName("org.joda.time.Period"));
        Object term73734 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term73737 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term73738 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73740 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73742 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73744 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73746 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73748 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73750 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term73752 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term73754 = (int[]) newIntArray(8);
        int[] term73755 = (int[]) newIntArray(8);
        setField(term73734, term73734.getClass(), "iName", "Standard");
        setByteField(term73738, term73738.getClass(), "iOrdinal", (byte) 4);
        setField(term73738, term73738.getClass(), "iName", "");
        setElement(term73737, 0, term73738);
        setByteField(term73740, term73740.getClass(), "iOrdinal", (byte) 5);
        setField(term73740, term73740.getClass(), "iName", "");
        setElement(term73737, 1, term73740);
        setByteField(term73742, term73742.getClass(), "iOrdinal", (byte) 6);
        setField(term73742, term73742.getClass(), "iName", "");
        setElement(term73737, 2, term73742);
        setByteField(term73744, term73744.getClass(), "iOrdinal", (byte) 7);
        setField(term73744, term73744.getClass(), "iName", "");
        setElement(term73737, 3, term73744);
        setByteField(term73746, term73746.getClass(), "iOrdinal", (byte) 9);
        setField(term73746, term73746.getClass(), "iName", "");
        setElement(term73737, 4, term73746);
        setByteField(term73748, term73748.getClass(), "iOrdinal", (byte) 10);
        setField(term73748, term73748.getClass(), "iName", "");
        setElement(term73737, 5, term73748);
        setByteField(term73750, term73750.getClass(), "iOrdinal", (byte) 11);
        setField(term73750, term73750.getClass(), "iName", "");
        setElement(term73737, 6, term73750);
        setByteField(term73752, term73752.getClass(), "iOrdinal", (byte) 12);
        setField(term73752, term73752.getClass(), "iName", "");
        setElement(term73737, 7, term73752);
        setField(term73734, term73734.getClass(), "iTypes", term73737);
        setIntElement(term73754, 1, 1);
        setIntElement(term73754, 2, 2);
        setIntElement(term73754, 3, 3);
        setIntElement(term73754, 4, 4);
        setIntElement(term73754, 5, 5);
        setIntElement(term73754, 6, 6);
        setIntElement(term73754, 7, 7);
        setField(term73734, term73734.getClass(), "iIndices", term73754);
        setField(term73733, term73733.getClass(), "iType", term73734);
        setField(term73733, term73733.getClass(), "iValues", term73755);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("org.joda.time.PeriodType");
        Object[] args = new Object[2];
        args[0] = term22381;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term73733));
        assertTrue(recursiveEquals(term22381, null));
    }

};


