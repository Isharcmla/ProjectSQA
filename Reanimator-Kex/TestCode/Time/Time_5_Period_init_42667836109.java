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
import java.lang.Object;

public class Period_init_42667836109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39788;

    public Period_init_42667836109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39788 = newInstance(Class.forName("org.joda.time.Period"));
        Object term39789 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term39792 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term39793 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39795 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39797 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39799 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39801 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39803 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39805 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term39807 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term39809 = (int[]) newIntArray(8);
        int[] term39810 = (int[]) newIntArray(8);
        setField(term39789, term39789.getClass(), "iName", "Standard");
        setByteField(term39793, term39793.getClass(), "iOrdinal", (byte) 4);
        setField(term39793, term39793.getClass(), "iName", "");
        setElement(term39792, 0, term39793);
        setByteField(term39795, term39795.getClass(), "iOrdinal", (byte) 5);
        setField(term39795, term39795.getClass(), "iName", "");
        setElement(term39792, 1, term39795);
        setByteField(term39797, term39797.getClass(), "iOrdinal", (byte) 6);
        setField(term39797, term39797.getClass(), "iName", "");
        setElement(term39792, 2, term39797);
        setByteField(term39799, term39799.getClass(), "iOrdinal", (byte) 7);
        setField(term39799, term39799.getClass(), "iName", "");
        setElement(term39792, 3, term39799);
        setByteField(term39801, term39801.getClass(), "iOrdinal", (byte) 9);
        setField(term39801, term39801.getClass(), "iName", "");
        setElement(term39792, 4, term39801);
        setByteField(term39803, term39803.getClass(), "iOrdinal", (byte) 10);
        setField(term39803, term39803.getClass(), "iName", "");
        setElement(term39792, 5, term39803);
        setByteField(term39805, term39805.getClass(), "iOrdinal", (byte) 11);
        setField(term39805, term39805.getClass(), "iName", "");
        setElement(term39792, 6, term39805);
        setByteField(term39807, term39807.getClass(), "iOrdinal", (byte) 12);
        setField(term39807, term39807.getClass(), "iName", "");
        setElement(term39792, 7, term39807);
        setField(term39789, term39789.getClass(), "iTypes", term39792);
        setIntElement(term39809, 1, 1);
        setIntElement(term39809, 2, 2);
        setIntElement(term39809, 3, 3);
        setIntElement(term39809, 4, 4);
        setIntElement(term39809, 5, 5);
        setIntElement(term39809, 6, 6);
        setIntElement(term39809, 7, 7);
        setField(term39789, term39789.getClass(), "iIndices", term39809);
        setField(term39788, term39788.getClass(), "iType", term39789);
        setField(term39788, term39788.getClass(), "iValues", term39810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.ReadableInstant");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term39788));
    }

};


