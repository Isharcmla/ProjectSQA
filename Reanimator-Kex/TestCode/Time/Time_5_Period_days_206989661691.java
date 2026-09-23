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
import java.lang.Integer;
import java.lang.Object;

public class Period_days_206989661691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term9903;

    public Period_days_206989661691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = new Integer(-73683645);
        term9903 = newInstance(Class.forName("org.joda.time.Period"));
        Object term9904 = newInstance(Class.forName("org.joda.time.PeriodType"));
        Object[] term9915 = (Object[]) newArray("org.joda.time.DurationFieldType", 8);
        Object term9916 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9919 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9922 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9925 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9928 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9931 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9934 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        Object term9937 = newInstance(Class.forName("org.joda.time.DurationFieldType$StandardDurationFieldType"));
        int[] term9940 = (int[]) newIntArray(8);
        int[] term9949 = (int[]) newIntArray(8);
        setField(term9904, term9904.getClass(), "iName", "Standard");
        setByteField(term9916, term9916.getClass(), "iOrdinal", (byte) 4);
        setField(term9916, term9916.getClass(), "iName", "");
        setElement(term9915, 0, term9916);
        setByteField(term9919, term9919.getClass(), "iOrdinal", (byte) 5);
        setField(term9919, term9919.getClass(), "iName", "");
        setElement(term9915, 1, term9919);
        setByteField(term9922, term9922.getClass(), "iOrdinal", (byte) 6);
        setField(term9922, term9922.getClass(), "iName", "");
        setElement(term9915, 2, term9922);
        setByteField(term9925, term9925.getClass(), "iOrdinal", (byte) 7);
        setField(term9925, term9925.getClass(), "iName", "");
        setElement(term9915, 3, term9925);
        setByteField(term9928, term9928.getClass(), "iOrdinal", (byte) 9);
        setField(term9928, term9928.getClass(), "iName", "");
        setElement(term9915, 4, term9928);
        setByteField(term9931, term9931.getClass(), "iOrdinal", (byte) 10);
        setField(term9931, term9931.getClass(), "iName", "");
        setElement(term9915, 5, term9931);
        setByteField(term9934, term9934.getClass(), "iOrdinal", (byte) 11);
        setField(term9934, term9934.getClass(), "iName", "");
        setElement(term9915, 6, term9934);
        setByteField(term9937, term9937.getClass(), "iOrdinal", (byte) 12);
        setField(term9937, term9937.getClass(), "iName", "");
        setElement(term9915, 7, term9937);
        setField(term9904, term9904.getClass(), "iTypes", term9915);
        setIntElement(term9940, 1, 1);
        setIntElement(term9940, 2, 2);
        setIntElement(term9940, 3, 3);
        setIntElement(term9940, 4, 4);
        setIntElement(term9940, 5, 5);
        setIntElement(term9940, 6, 6);
        setIntElement(term9940, 7, 7);
        setField(term9904, term9904.getClass(), "iIndices", term9940);
        setField(term9903, term9903.getClass(), "iType", term9904);
        setIntElement(term9949, 3, -73683645);
        setField(term9903, term9903.getClass(), "iValues", term9949);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Period");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term101;
        Object retValue = callMethod(klass, "days", argTypes, null, args);
        assertTrue(recursiveEquals(term101, -73683645));
        assertTrue(recursiveEquals(retValue, term9903));
    }

};


